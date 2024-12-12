package app_bsky_actor_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param tags
  *   A list of tags which describe the account owner's interests gathered during onboarding.
  */
final case class InterestsPref(tags: Option[String] = None)

object InterestsPref extends ShapeTag.Companion[InterestsPref] {
  val id: ShapeId = ShapeId("app_bsky_actor_defs", "interestsPref")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(tags: Option[String]): InterestsPref = InterestsPref(tags)

  implicit val schema: Schema[InterestsPref] = struct(
    string.optional[InterestsPref]("tags", _.tags).addHints(smithy.api.Documentation("A list of tags which describe the account owner\'s interests gathered during onboarding.")),
  )(make).withId(id).addHints(hints)
}
