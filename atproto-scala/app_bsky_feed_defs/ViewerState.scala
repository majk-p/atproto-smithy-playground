package app_bsky_feed_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ViewerState(repost: Option[String] = None, like: Option[String] = None, threadMuted: Option[Boolean] = None, replyDisabled: Option[Boolean] = None, embeddingDisabled: Option[Boolean] = None, pinned: Option[Boolean] = None)

object ViewerState extends ShapeTag.Companion[ViewerState] {
  val id: ShapeId = ShapeId("app_bsky_feed_defs", "viewerState")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(repost: Option[String], like: Option[String], threadMuted: Option[Boolean], replyDisabled: Option[Boolean], embeddingDisabled: Option[Boolean], pinned: Option[Boolean]): ViewerState = ViewerState(repost, like, threadMuted, replyDisabled, embeddingDisabled, pinned)

  implicit val schema: Schema[ViewerState] = struct(
    string.optional[ViewerState]("repost", _.repost),
    string.optional[ViewerState]("like", _.like),
    boolean.optional[ViewerState]("threadMuted", _.threadMuted),
    boolean.optional[ViewerState]("replyDisabled", _.replyDisabled),
    boolean.optional[ViewerState]("embeddingDisabled", _.embeddingDisabled),
    boolean.optional[ViewerState]("pinned", _.pinned),
  )(make).withId(id).addHints(hints)
}
