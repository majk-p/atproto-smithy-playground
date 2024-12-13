package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param subjectLine
  *   The subject line of the email sent to the user.
  * @param content
  *   The content of the email sent to the user.
  * @param comment
  *   Additional comment about the outgoing comm.
  */
final case class ModEventEmail(subjectLine: Option[String] = None, content: Option[String] = None, comment: Option[String] = None)

object ModEventEmail extends ShapeTag.Companion[ModEventEmail] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "modEventEmail")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(subjectLine: Option[String], content: Option[String], comment: Option[String]): ModEventEmail = ModEventEmail(subjectLine, content, comment)

  implicit val schema: Schema[ModEventEmail] = struct(
    string.optional[ModEventEmail]("subjectLine", _.subjectLine).addHints(smithy.api.Documentation("The subject line of the email sent to the user.")),
    string.optional[ModEventEmail]("content", _.content).addHints(smithy.api.Documentation("The content of the email sent to the user.")),
    string.optional[ModEventEmail]("comment", _.comment).addHints(smithy.api.Documentation("Additional comment about the outgoing comm.")),
  )(make).withId(id).addHints(hints)
}
