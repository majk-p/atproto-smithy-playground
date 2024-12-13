package lexicon.app.bsky.embed.images

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Main(images: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.embed.images", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(images: Option[String]): Main = Main(images)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("images", _.images),
  )(make).withId(id).addHints(hints)
}
