package app_bsky_graph_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ListViewBasic(uri: Option[String] = None, cid: Option[String] = None, name: Option[String] = None, purpose: Option[String] = None, avatar: Option[String] = None, listItemCount: Option[Int] = None, labels: Option[String] = None, viewer: Option[String] = None, indexedAt: Option[String] = None)

object ListViewBasic extends ShapeTag.Companion[ListViewBasic] {
  val id: ShapeId = ShapeId("app_bsky_graph_defs", "listViewBasic")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], name: Option[String], purpose: Option[String], avatar: Option[String], listItemCount: Option[Int], labels: Option[String], viewer: Option[String], indexedAt: Option[String]): ListViewBasic = ListViewBasic(uri, cid, name, purpose, avatar, listItemCount, labels, viewer, indexedAt)

  implicit val schema: Schema[ListViewBasic] = struct(
    string.optional[ListViewBasic]("uri", _.uri),
    string.optional[ListViewBasic]("cid", _.cid),
    string.optional[ListViewBasic]("name", _.name),
    string.optional[ListViewBasic]("purpose", _.purpose),
    string.optional[ListViewBasic]("avatar", _.avatar),
    int.optional[ListViewBasic]("listItemCount", _.listItemCount),
    string.optional[ListViewBasic]("labels", _.labels),
    string.optional[ListViewBasic]("viewer", _.viewer),
    string.optional[ListViewBasic]("indexedAt", _.indexedAt),
  )(make).withId(id).addHints(hints)
}
