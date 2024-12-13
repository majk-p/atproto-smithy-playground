package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ModEventEscalate(comment: Option[String] = None)

object ModEventEscalate extends ShapeTag.Companion[ModEventEscalate] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "modEventEscalate")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String]): ModEventEscalate = ModEventEscalate(comment)

  implicit val schema: Schema[ModEventEscalate] = struct(
    string.optional[ModEventEscalate]("comment", _.comment),
  )(make).withId(id).addHints(hints)
}
