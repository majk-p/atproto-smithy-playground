package lexicon.app.bsky.actor.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class SavedFeedsPrefV2(items: Option[String] = None)

object SavedFeedsPrefV2 extends ShapeTag.Companion[SavedFeedsPrefV2] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.actor.defs", "savedFeedsPrefV2")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(items: Option[String]): SavedFeedsPrefV2 = SavedFeedsPrefV2(items)

  implicit val schema: Schema[SavedFeedsPrefV2] = struct(
    string.optional[SavedFeedsPrefV2]("items", _.items),
  )(make).withId(id).addHints(hints)
}
