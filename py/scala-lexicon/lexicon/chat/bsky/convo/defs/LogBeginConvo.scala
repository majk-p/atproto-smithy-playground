package lexicon.chat.bsky.convo.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class LogBeginConvo(rev: Option[String] = None, convoId: Option[String] = None)

object LogBeginConvo extends ShapeTag.Companion[LogBeginConvo] {
  val id: ShapeId = ShapeId("lexicon.chat.bsky.convo.defs", "logBeginConvo")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(rev: Option[String], convoId: Option[String]): LogBeginConvo = LogBeginConvo(rev, convoId)

  implicit val schema: Schema[LogBeginConvo] = struct(
    string.optional[LogBeginConvo]("rev", _.rev),
    string.optional[LogBeginConvo]("convoId", _.convoId),
  )(make).withId(id).addHints(hints)
}
