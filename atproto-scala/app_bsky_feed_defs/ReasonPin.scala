package app_bsky_feed_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

/** Generated from ATP Lexicon */
final case class ReasonPin()

object ReasonPin extends ShapeTag.Companion[ReasonPin] {
  val id: ShapeId = ShapeId("app_bsky_feed_defs", "reasonPin")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily


  implicit val schema: Schema[ReasonPin] = constant(ReasonPin()).withId(id).addHints(hints)
}
