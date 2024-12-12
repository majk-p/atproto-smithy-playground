package app_bsky_feed_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param feedContext
  *   Context that will be passed through to client and may be passed to feed generator back alongside interactions.
  */
final case class SkeletonFeedPost(post: Option[String] = None, reason: Option[String] = None, feedContext: Option[String] = None)

object SkeletonFeedPost extends ShapeTag.Companion[SkeletonFeedPost] {
  val id: ShapeId = ShapeId("app_bsky_feed_defs", "skeletonFeedPost")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(post: Option[String], reason: Option[String], feedContext: Option[String]): SkeletonFeedPost = SkeletonFeedPost(post, reason, feedContext)

  implicit val schema: Schema[SkeletonFeedPost] = struct(
    string.optional[SkeletonFeedPost]("post", _.post),
    string.optional[SkeletonFeedPost]("reason", _.reason),
    string.optional[SkeletonFeedPost]("feedContext", _.feedContext).addHints(smithy.api.Documentation("Context that will be passed through to client and may be passed to feed generator back alongside interactions.")),
  )(make).withId(id).addHints(hints)
}
