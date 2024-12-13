package lexicon.app.bsky.embed.external

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class View(external: Option[String] = None)

object View extends ShapeTag.Companion[View] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.embed.external", "view")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(external: Option[String]): View = View(external)

  implicit val schema: Schema[View] = struct(
    string.optional[View]("external", _.external),
  )(make).withId(id).addHints(hints)
}
