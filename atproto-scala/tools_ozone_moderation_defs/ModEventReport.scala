package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param isReporterMuted
  *   Set to true if the reporter was muted from reporting at the time of the event. These reports won't impact the reviewState of the subject.
  */
final case class ModEventReport(comment: Option[String] = None, isReporterMuted: Option[Boolean] = None, reportType: Option[String] = None)

object ModEventReport extends ShapeTag.Companion[ModEventReport] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "modEventReport")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String], isReporterMuted: Option[Boolean], reportType: Option[String]): ModEventReport = ModEventReport(comment, isReporterMuted, reportType)

  implicit val schema: Schema[ModEventReport] = struct(
    string.optional[ModEventReport]("comment", _.comment),
    boolean.optional[ModEventReport]("isReporterMuted", _.isReporterMuted).addHints(smithy.api.Documentation("Set to true if the reporter was muted from reporting at the time of the event. These reports won\'t impact the reviewState of the subject.")),
    string.optional[ModEventReport]("reportType", _.reportType),
  )(make).withId(id).addHints(hints)
}
