package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param comment
  *   Describe reasoning behind the reversal.
  */
final case class ModEventReverseTakedown(comment: Option[String] = None)

object ModEventReverseTakedown extends ShapeTag.Companion[ModEventReverseTakedown] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "modEventReverseTakedown")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String]): ModEventReverseTakedown = ModEventReverseTakedown(comment)

  implicit val schema: Schema[ModEventReverseTakedown] = struct(
    string.optional[ModEventReverseTakedown]("comment", _.comment).addHints(smithy.api.Documentation("Describe reasoning behind the reversal.")),
  )(make).withId(id).addHints(hints)
}
