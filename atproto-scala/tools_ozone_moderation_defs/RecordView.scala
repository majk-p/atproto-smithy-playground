package tools_ozone_moderation_defs

import smithy4s.Document
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.document
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class RecordView(uri: Option[String] = None, cid: Option[String] = None, value: Option[Document] = None, blobCids: Option[String] = None, indexedAt: Option[String] = None, moderation: Option[String] = None, repo: Option[String] = None)

object RecordView extends ShapeTag.Companion[RecordView] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "recordView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], value: Option[Document], blobCids: Option[String], indexedAt: Option[String], moderation: Option[String], repo: Option[String]): RecordView = RecordView(uri, cid, value, blobCids, indexedAt, moderation, repo)

  implicit val schema: Schema[RecordView] = struct(
    string.optional[RecordView]("uri", _.uri),
    string.optional[RecordView]("cid", _.cid),
    document.optional[RecordView]("value", _.value),
    string.optional[RecordView]("blobCids", _.blobCids),
    string.optional[RecordView]("indexedAt", _.indexedAt),
    string.optional[RecordView]("moderation", _.moderation),
    string.optional[RecordView]("repo", _.repo),
  )(make).withId(id).addHints(hints)
}
