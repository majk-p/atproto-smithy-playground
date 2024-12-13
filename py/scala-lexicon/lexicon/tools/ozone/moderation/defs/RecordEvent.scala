package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class RecordEvent(comment: Option[String] = None, op: Option[String] = None, cid: Option[String] = None, timestamp: Option[String] = None)

object RecordEvent extends ShapeTag.Companion[RecordEvent] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "recordEvent")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String], op: Option[String], cid: Option[String], timestamp: Option[String]): RecordEvent = RecordEvent(comment, op, cid, timestamp)

  implicit val schema: Schema[RecordEvent] = struct(
    string.optional[RecordEvent]("comment", _.comment),
    string.optional[RecordEvent]("op", _.op),
    string.optional[RecordEvent]("cid", _.cid),
    string.optional[RecordEvent]("timestamp", _.timestamp),
  )(make).withId(id).addHints(hints)
}
