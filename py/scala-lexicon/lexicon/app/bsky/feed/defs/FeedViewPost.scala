package lexicon.app.bsky.feed.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param feedContext
  *   Context provided by feed generator that may be passed back alongside interactions.
  */
final case class FeedViewPost(post: Option[String] = None, reply: Option[String] = None, reason: Option[String] = None, feedContext: Option[String] = None)

object FeedViewPost extends ShapeTag.Companion[FeedViewPost] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.defs", "feedViewPost")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(post: Option[String], reply: Option[String], reason: Option[String], feedContext: Option[String]): FeedViewPost = FeedViewPost(post, reply, reason, feedContext)

  implicit val schema: Schema[FeedViewPost] = struct(
    string.optional[FeedViewPost]("post", _.post),
    string.optional[FeedViewPost]("reply", _.reply),
    string.optional[FeedViewPost]("reason", _.reason),
    string.optional[FeedViewPost]("feedContext", _.feedContext).addHints(smithy.api.Documentation("Context provided by feed generator that may be passed back alongside interactions.")),
  )(make).withId(id).addHints(hints)
}
