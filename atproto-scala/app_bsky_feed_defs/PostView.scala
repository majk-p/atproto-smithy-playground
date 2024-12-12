package app_bsky_feed_defs

import smithy4s.Document
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.document
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class PostView(uri: Option[String] = None, cid: Option[String] = None, author: Option[String] = None, record: Option[Document] = None, embed: Option[String] = None, replyCount: Option[Int] = None, repostCount: Option[Int] = None, likeCount: Option[Int] = None, quoteCount: Option[Int] = None, indexedAt: Option[String] = None, viewer: Option[String] = None, labels: Option[String] = None, threadgate: Option[String] = None)

object PostView extends ShapeTag.Companion[PostView] {
  val id: ShapeId = ShapeId("app_bsky_feed_defs", "postView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], author: Option[String], record: Option[Document], embed: Option[String], replyCount: Option[Int], repostCount: Option[Int], likeCount: Option[Int], quoteCount: Option[Int], indexedAt: Option[String], viewer: Option[String], labels: Option[String], threadgate: Option[String]): PostView = PostView(uri, cid, author, record, embed, replyCount, repostCount, likeCount, quoteCount, indexedAt, viewer, labels, threadgate)

  implicit val schema: Schema[PostView] = struct(
    string.optional[PostView]("uri", _.uri),
    string.optional[PostView]("cid", _.cid),
    string.optional[PostView]("author", _.author),
    document.optional[PostView]("record", _.record),
    string.optional[PostView]("embed", _.embed),
    int.optional[PostView]("replyCount", _.replyCount),
    int.optional[PostView]("repostCount", _.repostCount),
    int.optional[PostView]("likeCount", _.likeCount),
    int.optional[PostView]("quoteCount", _.quoteCount),
    string.optional[PostView]("indexedAt", _.indexedAt),
    string.optional[PostView]("viewer", _.viewer),
    string.optional[PostView]("labels", _.labels),
    string.optional[PostView]("threadgate", _.threadgate),
  )(make).withId(id).addHints(hints)
}
