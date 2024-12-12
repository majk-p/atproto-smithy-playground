package chat_bsky_convo_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class LogCreateMessage(rev: Option[String] = None, convoId: Option[String] = None, message: Option[String] = None)

object LogCreateMessage extends ShapeTag.Companion[LogCreateMessage] {
  val id: ShapeId = ShapeId("chat_bsky_convo_defs", "logCreateMessage")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(rev: Option[String], convoId: Option[String], message: Option[String]): LogCreateMessage = LogCreateMessage(rev, convoId, message)

  implicit val schema: Schema[LogCreateMessage] = struct(
    string.optional[LogCreateMessage]("rev", _.rev),
    string.optional[LogCreateMessage]("convoId", _.convoId),
    string.optional[LogCreateMessage]("message", _.message),
  )(make).withId(id).addHints(hints)
}
