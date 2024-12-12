package app_bsky_actor_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param sort
  *   Sorting mode for threads.
  * @param prioritizeFollowedUsers
  *   Show followed users at the top of all replies.
  */
final case class ThreadViewPref(sort: Option[String] = None, prioritizeFollowedUsers: Option[Boolean] = None)

object ThreadViewPref extends ShapeTag.Companion[ThreadViewPref] {
  val id: ShapeId = ShapeId("app_bsky_actor_defs", "threadViewPref")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(sort: Option[String], prioritizeFollowedUsers: Option[Boolean]): ThreadViewPref = ThreadViewPref(sort, prioritizeFollowedUsers)

  implicit val schema: Schema[ThreadViewPref] = struct(
    string.optional[ThreadViewPref]("sort", _.sort).addHints(smithy.api.Documentation("Sorting mode for threads.")),
    boolean.optional[ThreadViewPref]("prioritizeFollowedUsers", _.prioritizeFollowedUsers).addHints(smithy.api.Documentation("Show followed users at the top of all replies.")),
  )(make).withId(id).addHints(hints)
}
