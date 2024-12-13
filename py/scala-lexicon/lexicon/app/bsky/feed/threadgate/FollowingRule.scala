package lexicon.app.bsky.feed.threadgate

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

/** Generated from ATP Lexicon */
final case class FollowingRule()

object FollowingRule extends ShapeTag.Companion[FollowingRule] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.threadgate", "followingRule")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily


  implicit val schema: Schema[FollowingRule] = constant(FollowingRule()).withId(id).addHints(hints)
}
