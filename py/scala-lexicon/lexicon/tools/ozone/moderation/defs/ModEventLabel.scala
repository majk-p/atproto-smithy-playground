package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ModEventLabel(comment: Option[String] = None, createLabelVals: Option[String] = None, negateLabelVals: Option[String] = None)

object ModEventLabel extends ShapeTag.Companion[ModEventLabel] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "modEventLabel")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String], createLabelVals: Option[String], negateLabelVals: Option[String]): ModEventLabel = ModEventLabel(comment, createLabelVals, negateLabelVals)

  implicit val schema: Schema[ModEventLabel] = struct(
    string.optional[ModEventLabel]("comment", _.comment),
    string.optional[ModEventLabel]("createLabelVals", _.createLabelVals),
    string.optional[ModEventLabel]("negateLabelVals", _.negateLabelVals),
  )(make).withId(id).addHints(hints)
}
