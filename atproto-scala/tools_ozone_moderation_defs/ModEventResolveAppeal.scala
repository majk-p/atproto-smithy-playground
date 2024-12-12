package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param comment
  *   Describe resolution.
  */
final case class ModEventResolveAppeal(comment: Option[String] = None)

object ModEventResolveAppeal extends ShapeTag.Companion[ModEventResolveAppeal] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "modEventResolveAppeal")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String]): ModEventResolveAppeal = ModEventResolveAppeal(comment)

  implicit val schema: Schema[ModEventResolveAppeal] = struct(
    string.optional[ModEventResolveAppeal]("comment", _.comment).addHints(smithy.api.Documentation("Describe resolution.")),
  )(make).withId(id).addHints(hints)
}
