package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Moderation(subjectStatus: Option[String] = None)

object Moderation extends ShapeTag.Companion[Moderation] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "moderation")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(subjectStatus: Option[String]): Moderation = Moderation(subjectStatus)

  implicit val schema: Schema[Moderation] = struct(
    string.optional[Moderation]("subjectStatus", _.subjectStatus),
  )(make).withId(id).addHints(hints)
}
