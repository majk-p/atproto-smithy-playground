package lexicon.app.bsky.graph.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ListView(uri: Option[String] = None, cid: Option[String] = None, creator: Option[String] = None, name: Option[String] = None, purpose: Option[String] = None, description: Option[String] = None, descriptionFacets: Option[String] = None, avatar: Option[String] = None, listItemCount: Option[Int] = None, labels: Option[String] = None, viewer: Option[String] = None, indexedAt: Option[String] = None)

object ListView extends ShapeTag.Companion[ListView] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.graph.defs", "listView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], creator: Option[String], name: Option[String], purpose: Option[String], description: Option[String], descriptionFacets: Option[String], avatar: Option[String], listItemCount: Option[Int], labels: Option[String], viewer: Option[String], indexedAt: Option[String]): ListView = ListView(uri, cid, creator, name, purpose, description, descriptionFacets, avatar, listItemCount, labels, viewer, indexedAt)

  implicit val schema: Schema[ListView] = struct(
    string.optional[ListView]("uri", _.uri),
    string.optional[ListView]("cid", _.cid),
    string.optional[ListView]("creator", _.creator),
    string.optional[ListView]("name", _.name),
    string.optional[ListView]("purpose", _.purpose),
    string.optional[ListView]("description", _.description),
    string.optional[ListView]("descriptionFacets", _.descriptionFacets),
    string.optional[ListView]("avatar", _.avatar),
    int.optional[ListView]("listItemCount", _.listItemCount),
    string.optional[ListView]("labels", _.labels),
    string.optional[ListView]("viewer", _.viewer),
    string.optional[ListView]("indexedAt", _.indexedAt),
  )(make).withId(id).addHints(hints)
}
