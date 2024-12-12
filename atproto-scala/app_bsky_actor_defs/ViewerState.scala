package app_bsky_actor_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ViewerState(muted: Option[Boolean] = None, mutedByList: Option[String] = None, blockedBy: Option[Boolean] = None, blocking: Option[String] = None, blockingByList: Option[String] = None, following: Option[String] = None, followedBy: Option[String] = None, knownFollowers: Option[String] = None)

object ViewerState extends ShapeTag.Companion[ViewerState] {
  val id: ShapeId = ShapeId("app_bsky_actor_defs", "viewerState")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(muted: Option[Boolean], mutedByList: Option[String], blockedBy: Option[Boolean], blocking: Option[String], blockingByList: Option[String], following: Option[String], followedBy: Option[String], knownFollowers: Option[String]): ViewerState = ViewerState(muted, mutedByList, blockedBy, blocking, blockingByList, following, followedBy, knownFollowers)

  implicit val schema: Schema[ViewerState] = struct(
    boolean.optional[ViewerState]("muted", _.muted),
    string.optional[ViewerState]("mutedByList", _.mutedByList),
    boolean.optional[ViewerState]("blockedBy", _.blockedBy),
    string.optional[ViewerState]("blocking", _.blocking),
    string.optional[ViewerState]("blockingByList", _.blockingByList),
    string.optional[ViewerState]("following", _.following),
    string.optional[ViewerState]("followedBy", _.followedBy),
    string.optional[ViewerState]("knownFollowers", _.knownFollowers),
  )(make).withId(id).addHints(hints)
}
