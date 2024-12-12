package app_bsky_actor_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param hideRepliesByUnfollowed
  *   Hide replies in the feed if they are not by followed users.
  * @param hideQuotePosts
  *   Hide quote posts in the feed.
  * @param hideRepliesByLikeCount
  *   Hide replies in the feed if they do not have this number of likes.
  * @param hideReposts
  *   Hide reposts in the feed.
  * @param hideReplies
  *   Hide replies in the feed.
  * @param feed
  *   The URI of the feed, or an identifier which describes the feed.
  */
final case class FeedViewPref(feed: Option[String] = None, hideReplies: Option[Boolean] = None, hideRepliesByUnfollowed: Option[Boolean] = None, hideRepliesByLikeCount: Option[Int] = None, hideReposts: Option[Boolean] = None, hideQuotePosts: Option[Boolean] = None)

object FeedViewPref extends ShapeTag.Companion[FeedViewPref] {
  val id: ShapeId = ShapeId("app_bsky_actor_defs", "feedViewPref")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(feed: Option[String], hideReplies: Option[Boolean], hideRepliesByUnfollowed: Option[Boolean], hideRepliesByLikeCount: Option[Int], hideReposts: Option[Boolean], hideQuotePosts: Option[Boolean]): FeedViewPref = FeedViewPref(feed, hideReplies, hideRepliesByUnfollowed, hideRepliesByLikeCount, hideReposts, hideQuotePosts)

  implicit val schema: Schema[FeedViewPref] = struct(
    string.optional[FeedViewPref]("feed", _.feed).addHints(smithy.api.Documentation("The URI of the feed, or an identifier which describes the feed.")),
    boolean.optional[FeedViewPref]("hideReplies", _.hideReplies).addHints(smithy.api.Documentation("Hide replies in the feed.")),
    boolean.optional[FeedViewPref]("hideRepliesByUnfollowed", _.hideRepliesByUnfollowed).addHints(smithy.api.Documentation("Hide replies in the feed if they are not by followed users.")),
    int.optional[FeedViewPref]("hideRepliesByLikeCount", _.hideRepliesByLikeCount).addHints(smithy.api.Documentation("Hide replies in the feed if they do not have this number of likes.")),
    boolean.optional[FeedViewPref]("hideReposts", _.hideReposts).addHints(smithy.api.Documentation("Hide reposts in the feed.")),
    boolean.optional[FeedViewPref]("hideQuotePosts", _.hideQuotePosts).addHints(smithy.api.Documentation("Hide quote posts in the feed.")),
  )(make).withId(id).addHints(hints)
}
