package app_bsky_feed_defs

import smithy4s.Document
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.document
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ThreadgateView(uri: Option[String] = None, cid: Option[String] = None, record: Option[Document] = None, lists: Option[String] = None)

object ThreadgateView extends ShapeTag.Companion[ThreadgateView] {
  val id: ShapeId = ShapeId("app_bsky_feed_defs", "threadgateView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], record: Option[Document], lists: Option[String]): ThreadgateView = ThreadgateView(uri, cid, record, lists)

  implicit val schema: Schema[ThreadgateView] = struct(
    string.optional[ThreadgateView]("uri", _.uri),
    string.optional[ThreadgateView]("cid", _.cid),
    document.optional[ThreadgateView]("record", _.record),
    string.optional[ThreadgateView]("lists", _.lists),
  )(make).withId(id).addHints(hints)
}
