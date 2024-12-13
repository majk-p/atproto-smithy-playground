package lexicon.app.bsky.actor.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class SavedFeedsPref(pinned: Option[String] = None, saved: Option[String] = None, timelineIndex: Option[Int] = None)

object SavedFeedsPref extends ShapeTag.Companion[SavedFeedsPref] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.actor.defs", "savedFeedsPref")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(pinned: Option[String], saved: Option[String], timelineIndex: Option[Int]): SavedFeedsPref = SavedFeedsPref(pinned, saved, timelineIndex)

  implicit val schema: Schema[SavedFeedsPref] = struct(
    string.optional[SavedFeedsPref]("pinned", _.pinned),
    string.optional[SavedFeedsPref]("saved", _.saved),
    int.optional[SavedFeedsPref]("timelineIndex", _.timelineIndex),
  )(make).withId(id).addHints(hints)
}
