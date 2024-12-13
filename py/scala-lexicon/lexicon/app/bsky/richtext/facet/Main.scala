package lexicon.app.bsky.richtext.facet

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Main(index: Option[String] = None, features: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.richtext.facet", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(index: Option[String], features: Option[String]): Main = Main(index, features)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("index", _.index),
    string.optional[Main]("features", _.features),
  )(make).withId(id).addHints(hints)
}
