package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param durationInHours
  *   Indicates how long the takedown should be in effect before automatically expiring.
  * @param acknowledgeAccountSubjects
  *   If true, all other reports on content authored by this account will be resolved (acknowledged).
  */
final case class ModEventTakedown(comment: Option[String] = None, durationInHours: Option[Int] = None, acknowledgeAccountSubjects: Option[Boolean] = None)

object ModEventTakedown extends ShapeTag.Companion[ModEventTakedown] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "modEventTakedown")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String], durationInHours: Option[Int], acknowledgeAccountSubjects: Option[Boolean]): ModEventTakedown = ModEventTakedown(comment, durationInHours, acknowledgeAccountSubjects)

  implicit val schema: Schema[ModEventTakedown] = struct(
    string.optional[ModEventTakedown]("comment", _.comment),
    int.optional[ModEventTakedown]("durationInHours", _.durationInHours).addHints(smithy.api.Documentation("Indicates how long the takedown should be in effect before automatically expiring.")),
    boolean.optional[ModEventTakedown]("acknowledgeAccountSubjects", _.acknowledgeAccountSubjects).addHints(smithy.api.Documentation("If true, all other reports on content authored by this account will be resolved (acknowledged).")),
  )(make).withId(id).addHints(hints)
}
