package lexicon.app.bsky.actor.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class BskyAppProgressGuide(guide: Option[String] = None)

object BskyAppProgressGuide extends ShapeTag.Companion[BskyAppProgressGuide] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.actor.defs", "bskyAppProgressGuide")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(guide: Option[String]): BskyAppProgressGuide = BskyAppProgressGuide(guide)

  implicit val schema: Schema[BskyAppProgressGuide] = struct(
    string.optional[BskyAppProgressGuide]("guide", _.guide),
  )(make).withId(id).addHints(hints)
}
