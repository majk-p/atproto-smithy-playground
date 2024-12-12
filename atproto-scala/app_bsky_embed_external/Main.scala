package app_bsky_embed_external

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Main(external: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("app_bsky_embed_external", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(external: Option[String]): Main = Main(external)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("external", _.external),
  )(make).withId(id).addHints(hints)
}
