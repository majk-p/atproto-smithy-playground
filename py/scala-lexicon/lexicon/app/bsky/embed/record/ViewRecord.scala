package lexicon.app.bsky.embed.record

import smithy4s.Document
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.document
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param value
  *   The record data itself.
  */
final case class ViewRecord(uri: Option[String] = None, cid: Option[String] = None, author: Option[String] = None, value: Option[Document] = None, labels: Option[String] = None, replyCount: Option[Int] = None, repostCount: Option[Int] = None, likeCount: Option[Int] = None, quoteCount: Option[Int] = None, embeds: Option[String] = None, indexedAt: Option[String] = None)

object ViewRecord extends ShapeTag.Companion[ViewRecord] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.embed.record", "viewRecord")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], author: Option[String], value: Option[Document], labels: Option[String], replyCount: Option[Int], repostCount: Option[Int], likeCount: Option[Int], quoteCount: Option[Int], embeds: Option[String], indexedAt: Option[String]): ViewRecord = ViewRecord(uri, cid, author, value, labels, replyCount, repostCount, likeCount, quoteCount, embeds, indexedAt)

  implicit val schema: Schema[ViewRecord] = struct(
    string.optional[ViewRecord]("uri", _.uri),
    string.optional[ViewRecord]("cid", _.cid),
    string.optional[ViewRecord]("author", _.author),
    document.optional[ViewRecord]("value", _.value).addHints(smithy.api.Documentation("The record data itself.")),
    string.optional[ViewRecord]("labels", _.labels),
    int.optional[ViewRecord]("replyCount", _.replyCount),
    int.optional[ViewRecord]("repostCount", _.repostCount),
    int.optional[ViewRecord]("likeCount", _.likeCount),
    int.optional[ViewRecord]("quoteCount", _.quoteCount),
    string.optional[ViewRecord]("embeds", _.embeds),
    string.optional[ViewRecord]("indexedAt", _.indexedAt),
  )(make).withId(id).addHints(hints)
}
