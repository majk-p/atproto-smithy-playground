package lexicon.app.bsky.feed.postgate

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

/** Generated from ATP Lexicon */
final case class DisableRule()

object DisableRule extends ShapeTag.Companion[DisableRule] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.postgate", "disableRule")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily


  implicit val schema: Schema[DisableRule] = constant(DisableRule()).withId(id).addHints(hints)
}
