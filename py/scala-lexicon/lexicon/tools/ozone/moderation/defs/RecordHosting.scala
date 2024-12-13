package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class RecordHosting(status: Option[String] = None, updatedAt: Option[String] = None, createdAt: Option[String] = None, deletedAt: Option[String] = None)

object RecordHosting extends ShapeTag.Companion[RecordHosting] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "recordHosting")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(status: Option[String], updatedAt: Option[String], createdAt: Option[String], deletedAt: Option[String]): RecordHosting = RecordHosting(status, updatedAt, createdAt, deletedAt)

  implicit val schema: Schema[RecordHosting] = struct(
    string.optional[RecordHosting]("status", _.status),
    string.optional[RecordHosting]("updatedAt", _.updatedAt),
    string.optional[RecordHosting]("createdAt", _.createdAt),
    string.optional[RecordHosting]("deletedAt", _.deletedAt),
  )(make).withId(id).addHints(hints)
}
