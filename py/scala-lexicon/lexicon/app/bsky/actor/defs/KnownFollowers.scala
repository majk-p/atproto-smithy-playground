package lexicon.app.bsky.actor.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class KnownFollowers(count: Option[Int] = None, followers: Option[String] = None)

object KnownFollowers extends ShapeTag.Companion[KnownFollowers] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.actor.defs", "knownFollowers")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(count: Option[Int], followers: Option[String]): KnownFollowers = KnownFollowers(count, followers)

  implicit val schema: Schema[KnownFollowers] = struct(
    int.optional[KnownFollowers]("count", _.count),
    string.optional[KnownFollowers]("followers", _.followers),
  )(make).withId(id).addHints(hints)
}
