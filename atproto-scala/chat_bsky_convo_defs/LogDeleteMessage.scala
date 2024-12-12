package chat_bsky_convo_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class LogDeleteMessage(rev: Option[String] = None, convoId: Option[String] = None, message: Option[String] = None)

object LogDeleteMessage extends ShapeTag.Companion[LogDeleteMessage] {
  val id: ShapeId = ShapeId("chat_bsky_convo_defs", "logDeleteMessage")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(rev: Option[String], convoId: Option[String], message: Option[String]): LogDeleteMessage = LogDeleteMessage(rev, convoId, message)

  implicit val schema: Schema[LogDeleteMessage] = struct(
    string.optional[LogDeleteMessage]("rev", _.rev),
    string.optional[LogDeleteMessage]("convoId", _.convoId),
    string.optional[LogDeleteMessage]("message", _.message),
  )(make).withId(id).addHints(hints)
}
