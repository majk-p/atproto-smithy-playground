package lexicon.app.bsky.feed.threadgate

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

/** Generated from ATP Lexicon */
final case class MentionRule()

object MentionRule extends ShapeTag.Companion[MentionRule] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.threadgate", "mentionRule")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily


  implicit val schema: Schema[MentionRule] = constant(MentionRule()).withId(id).addHints(hints)
}
