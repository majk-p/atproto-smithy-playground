package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class RecordViewNotFound(uri: Option[String] = None)

object RecordViewNotFound extends ShapeTag.Companion[RecordViewNotFound] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "recordViewNotFound")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String]): RecordViewNotFound = RecordViewNotFound(uri)

  implicit val schema: Schema[RecordViewNotFound] = struct(
    string.optional[RecordViewNotFound]("uri", _.uri),
  )(make).withId(id).addHints(hints)
}
