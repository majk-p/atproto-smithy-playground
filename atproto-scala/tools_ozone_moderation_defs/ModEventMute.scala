package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param durationInHours
  *   Indicates how long the subject should remain muted.
  */
final case class ModEventMute(comment: Option[String] = None, durationInHours: Option[Int] = None)

object ModEventMute extends ShapeTag.Companion[ModEventMute] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "modEventMute")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String], durationInHours: Option[Int]): ModEventMute = ModEventMute(comment, durationInHours)

  implicit val schema: Schema[ModEventMute] = struct(
    string.optional[ModEventMute]("comment", _.comment),
    int.optional[ModEventMute]("durationInHours", _.durationInHours).addHints(smithy.api.Documentation("Indicates how long the subject should remain muted.")),
  )(make).withId(id).addHints(hints)
}
