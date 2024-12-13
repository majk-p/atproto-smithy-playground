package lexicon.app.bsky.actor.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class SavedFeed(id: Option[String] = None, _type: Option[String] = None, value: Option[String] = None, pinned: Option[Boolean] = None)

object SavedFeed extends ShapeTag.Companion[SavedFeed] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.actor.defs", "savedFeed")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(id: Option[String], _type: Option[String], value: Option[String], pinned: Option[Boolean]): SavedFeed = SavedFeed(id, _type, value, pinned)

  implicit val schema: Schema[SavedFeed] = struct(
    string.optional[SavedFeed]("id", _.id),
    string.optional[SavedFeed]("type", _._type),
    string.optional[SavedFeed]("value", _.value),
    boolean.optional[SavedFeed]("pinned", _.pinned),
  )(make).withId(id).addHints(hints)
}
