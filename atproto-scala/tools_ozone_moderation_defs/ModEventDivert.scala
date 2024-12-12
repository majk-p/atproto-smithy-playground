package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ModEventDivert(comment: Option[String] = None)

object ModEventDivert extends ShapeTag.Companion[ModEventDivert] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "modEventDivert")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String]): ModEventDivert = ModEventDivert(comment)

  implicit val schema: Schema[ModEventDivert] = struct(
    string.optional[ModEventDivert]("comment", _.comment),
  )(make).withId(id).addHints(hints)
}
