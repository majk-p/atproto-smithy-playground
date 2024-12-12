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
  *   Indicates how long the account should remain muted. Falsy value here means a permanent mute.
  */
final case class ModEventMuteReporter(comment: Option[String] = None, durationInHours: Option[Int] = None)

object ModEventMuteReporter extends ShapeTag.Companion[ModEventMuteReporter] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "modEventMuteReporter")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String], durationInHours: Option[Int]): ModEventMuteReporter = ModEventMuteReporter(comment, durationInHours)

  implicit val schema: Schema[ModEventMuteReporter] = struct(
    string.optional[ModEventMuteReporter]("comment", _.comment),
    int.optional[ModEventMuteReporter]("durationInHours", _.durationInHours).addHints(smithy.api.Documentation("Indicates how long the account should remain muted. Falsy value here means a permanent mute.")),
  )(make).withId(id).addHints(hints)
}
