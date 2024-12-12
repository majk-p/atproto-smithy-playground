package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ModEventAcknowledge(comment: Option[String] = None)

object ModEventAcknowledge extends ShapeTag.Companion[ModEventAcknowledge] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "modEventAcknowledge")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String]): ModEventAcknowledge = ModEventAcknowledge(comment)

  implicit val schema: Schema[ModEventAcknowledge] = struct(
    string.optional[ModEventAcknowledge]("comment", _.comment),
  )(make).withId(id).addHints(hints)
}
