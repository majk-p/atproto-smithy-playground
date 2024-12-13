//> using scala "3"
//> using dep "com.github.plokhotnyuk.jsoniter-scala::jsoniter-scala-core::2.32.0"
//> using compileOnly.dep "com.github.plokhotnyuk.jsoniter-scala::jsoniter-scala-macros::2.32.0"

import scala.io.Source
import scala.util.{Try, Using}
import com.github.plokhotnyuk.jsoniter_scala.core._
import com.github.plokhotnyuk.jsoniter_scala.macros._
import java.nio.file.{Files, Paths, StandardOpenOption}
import scala.jdk.CollectionConverters._

case class LexiconDef(id: String, defs: Map[String, LexiconMain])
case class LexiconMain(`type`: Option[String], record: Option[RecordDef])
case class RecordDef(properties: Map[String, PropertyDef])
case class PropertyDef(
    `type`: String,
    description: Option[String],
    required: Option[Boolean]
)

implicit val propertyDefCodec: JsonValueCodec[PropertyDef] = JsonCodecMaker.make
implicit val recordDefCodec: JsonValueCodec[RecordDef] = JsonCodecMaker.make
implicit val lexiconMainCodec: JsonValueCodec[LexiconMain] = JsonCodecMaker.make
implicit val lexiconDefCodec: JsonValueCodec[LexiconDef] = JsonCodecMaker.make

object ConvertLexiconToSmithy {

  def convertAtprotoTypeToSmithy(atprotoType: String): String =
    atprotoType match {
      case "string"           => "String"
      case "integer"          => "Integer"
      case "boolean"          => "Boolean"
      case "float"            => "Float"
      case "bytes"            => "Blob"
      case "json" | "unknown" => "Document"
      case _ =>
        if (atprotoType.startsWith("array"))
          s"List<${convertAtprotoTypeToSmithy(atprotoType.substring(5))}>"
        else "String"
    }

  def generateSmithyStructure(lexiconDef: LexiconDef): String = {
    val structureName = lexiconDef.id
    val properties = lexiconDef.defs
      .get("main")
      .flatMap(_.record)
      .map(_.properties)
      .getOrElse(Map.empty)

    val propertyLines = properties.map { case (propName, propDetails) =>
      val propType = convertAtprotoTypeToSmithy(propDetails.`type`)
      val description = propDetails.description
        .map(d => s"""@documentation("$d")\n\t""")
        .getOrElse("")
      val required =
        if (propDetails.required.getOrElse(false)) "@required " else ""

      s"    $description$required$propName: $propType"
    }

    Seq(
      s"""@documentation("Generated from ATP Lexicon")""",
      s"structure $structureName {"
    ).mkString("\n") ++ propertyLines.mkString(",\n") ++ "}"
  }

  def convertLexiconToSmithy(lexiconFile: String): String = {
    val source = Using(Source.fromFile(lexiconFile))(_.mkString)
    val json = source.toOption.flatMap(str =>
      Try(readFromArray[LexiconDef](str.getBytes)).toOption
    )

    val namespace =
      json.map(j => s"lexicon.${j.id}").getOrElse("com.example.atproto")

    (Seq(
      "$version: \"2.0\"",
      s"namespace $namespace",
      "",
      "// Imports (add as needed)",
      "use alloy#simpleRestJson",
      ""
    ) ++ json.toList.flatMap { lexiconDef =>
      lexiconDef.defs.collect {
        case (defName, defDetails)
            if defDetails.`type`.exists(t => t == "record" || t == "object") =>
          generateSmithyStructure(
            LexiconDef(defName, Map("main" -> defDetails))
          )
      }
    }).mkString("\n")
  }

  def processLexiconDirectory(inputDir: String, outputDir: String): Unit = {
    val inputPath = Paths.get(inputDir)
    val outputPath = Paths.get(outputDir)

    if (Files.notExists(outputPath)) Files.createDirectories(outputPath)

    val files = Files
      .walk(inputPath)
      .iterator()
      .asScala
      .filter(_.toString.endsWith(".json"))
      .toSeq

    val convertedFiles = files.map { path =>
      val relativePath = inputPath.relativize(path.getParent)
      val outputSubdir = outputPath.resolve(relativePath)
      if (Files.notExists(outputSubdir)) Files.createDirectories(outputSubdir)
      val outputFile = outputSubdir.resolve(
        s"${path.getFileName.toString.replace(".json", ".smithy")}"
      )
      val smithyContent = convertLexiconToSmithy(path.toString)
      Files.write(outputFile, smithyContent.getBytes, StandardOpenOption.CREATE)
      outputFile
    }

    println(s"\nConversion Summary:")
    println(s"Total JSON files found: ${files.size}")
    println(s"Successfully converted files: ${convertedFiles.size}")
  }
}

@main
def main(args: String*) = {
  args.toList match
    case List(inputDirectory, outputDirectory) =>
      ConvertLexiconToSmithy.processLexiconDirectory(
        inputDirectory,
        outputDirectory
      )
    case _ =>
      println(
        s"This script needs to be invoked with two arguments: lexicon directory and output smithy directory"
      )

}
