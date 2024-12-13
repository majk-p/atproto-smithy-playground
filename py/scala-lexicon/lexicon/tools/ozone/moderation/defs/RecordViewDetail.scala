package lexicon.tools.ozone.moderation.defs

import smithy4s.Document
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.document
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class RecordViewDetail(uri: Option[String] = None, cid: Option[String] = None, value: Option[Document] = None, blobs: Option[String] = None, labels: Option[String] = None, indexedAt: Option[String] = None, moderation: Option[String] = None, repo: Option[String] = None)

object RecordViewDetail extends ShapeTag.Companion[RecordViewDetail] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "recordViewDetail")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], value: Option[Document], blobs: Option[String], labels: Option[String], indexedAt: Option[String], moderation: Option[String], repo: Option[String]): RecordViewDetail = RecordViewDetail(uri, cid, value, blobs, labels, indexedAt, moderation, repo)

  implicit val schema: Schema[RecordViewDetail] = struct(
    string.optional[RecordViewDetail]("uri", _.uri),
    string.optional[RecordViewDetail]("cid", _.cid),
    document.optional[RecordViewDetail]("value", _.value),
    string.optional[RecordViewDetail]("blobs", _.blobs),
    string.optional[RecordViewDetail]("labels", _.labels),
    string.optional[RecordViewDetail]("indexedAt", _.indexedAt),
    string.optional[RecordViewDetail]("moderation", _.moderation),
    string.optional[RecordViewDetail]("repo", _.repo),
  )(make).withId(id).addHints(hints)
}
