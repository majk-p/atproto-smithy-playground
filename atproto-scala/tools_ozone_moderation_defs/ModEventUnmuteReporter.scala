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
final case class ModEventUnmuteReporter(comment: Option[String] = None)

object ModEventUnmuteReporter extends ShapeTag.Companion[ModEventUnmuteReporter] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "modEventUnmuteReporter")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String]): ModEventUnmuteReporter = ModEventUnmuteReporter(comment)

  implicit val schema: Schema[ModEventUnmuteReporter] = struct(
    string.optional[ModEventUnmuteReporter]("comment", _.comment).addHints(smithy.api.Documentation("Describe reasoning behind the reversal.")),
  )(make).withId(id).addHints(hints)
}
