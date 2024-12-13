package lexicon.app.bsky.feed.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

/** Generated from ATP Lexicon */
final case class SkeletonReasonPin()

object SkeletonReasonPin extends ShapeTag.Companion[SkeletonReasonPin] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.defs", "skeletonReasonPin")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily


  implicit val schema: Schema[SkeletonReasonPin] = constant(SkeletonReasonPin()).withId(id).addHints(hints)
}
