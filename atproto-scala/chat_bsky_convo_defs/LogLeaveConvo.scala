package chat_bsky_convo_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class LogLeaveConvo(rev: Option[String] = None, convoId: Option[String] = None)

object LogLeaveConvo extends ShapeTag.Companion[LogLeaveConvo] {
  val id: ShapeId = ShapeId("chat_bsky_convo_defs", "logLeaveConvo")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(rev: Option[String], convoId: Option[String]): LogLeaveConvo = LogLeaveConvo(rev, convoId)

  implicit val schema: Schema[LogLeaveConvo] = struct(
    string.optional[LogLeaveConvo]("rev", _.rev),
    string.optional[LogLeaveConvo]("convoId", _.convoId),
  )(make).withId(id).addHints(hints)
}
