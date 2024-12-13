package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param sticky
  *   Make the comment persistent on the subject
  */
final case class ModEventComment(comment: Option[String] = None, sticky: Option[Boolean] = None)

object ModEventComment extends ShapeTag.Companion[ModEventComment] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "modEventComment")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String], sticky: Option[Boolean]): ModEventComment = ModEventComment(comment, sticky)

  implicit val schema: Schema[ModEventComment] = struct(
    string.optional[ModEventComment]("comment", _.comment),
    boolean.optional[ModEventComment]("sticky", _.sticky).addHints(smithy.api.Documentation("Make the comment persistent on the subject")),
  )(make).withId(id).addHints(hints)
}
