package lexicon.app.bsky.feed.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param feedContext
  *   Context on a feed item that was originally supplied by the feed generator on getFeedSkeleton.
  */
final case class Interaction(item: Option[String] = None, event: Option[String] = None, feedContext: Option[String] = None)

object Interaction extends ShapeTag.Companion[Interaction] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.defs", "interaction")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(item: Option[String], event: Option[String], feedContext: Option[String]): Interaction = Interaction(item, event, feedContext)

  implicit val schema: Schema[Interaction] = struct(
    string.optional[Interaction]("item", _.item),
    string.optional[Interaction]("event", _.event),
    string.optional[Interaction]("feedContext", _.feedContext).addHints(smithy.api.Documentation("Context on a feed item that was originally supplied by the feed generator on getFeedSkeleton.")),
  )(make).withId(id).addHints(hints)
}
