package lexicon.tools.ozone.moderation.defs

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
final case class ModEventUnmute(comment: Option[String] = None)

object ModEventUnmute extends ShapeTag.Companion[ModEventUnmute] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "modEventUnmute")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String]): ModEventUnmute = ModEventUnmute(comment)

  implicit val schema: Schema[ModEventUnmute] = struct(
    string.optional[ModEventUnmute]("comment", _.comment).addHints(smithy.api.Documentation("Describe reasoning behind the reversal.")),
  )(make).withId(id).addHints(hints)
}
