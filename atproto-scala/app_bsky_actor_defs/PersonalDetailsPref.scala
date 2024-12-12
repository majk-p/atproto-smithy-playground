package app_bsky_actor_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param birthDate
  *   The birth date of account owner.
  */
final case class PersonalDetailsPref(birthDate: Option[String] = None)

object PersonalDetailsPref extends ShapeTag.Companion[PersonalDetailsPref] {
  val id: ShapeId = ShapeId("app_bsky_actor_defs", "personalDetailsPref")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(birthDate: Option[String]): PersonalDetailsPref = PersonalDetailsPref(birthDate)

  implicit val schema: Schema[PersonalDetailsPref] = struct(
    string.optional[PersonalDetailsPref]("birthDate", _.birthDate).addHints(smithy.api.Documentation("The birth date of account owner.")),
  )(make).withId(id).addHints(hints)
}
