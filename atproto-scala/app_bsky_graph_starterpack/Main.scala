package app_bsky_graph_starterpack

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param name
  *   Display name for starter pack; can not be empty.
  * @param list
  *   Reference (AT-URI) to the list record.
  */
final case class Main(name: Option[String] = None, description: Option[String] = None, descriptionFacets: Option[String] = None, list: Option[String] = None, feeds: Option[String] = None, createdAt: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("app_bsky_graph_starterpack", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(name: Option[String], description: Option[String], descriptionFacets: Option[String], list: Option[String], feeds: Option[String], createdAt: Option[String]): Main = Main(name, description, descriptionFacets, list, feeds, createdAt)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("name", _.name).addHints(smithy.api.Documentation("Display name for starter pack; can not be empty.")),
    string.optional[Main]("description", _.description),
    string.optional[Main]("descriptionFacets", _.descriptionFacets),
    string.optional[Main]("list", _.list).addHints(smithy.api.Documentation("Reference (AT-URI) to the list record.")),
    string.optional[Main]("feeds", _.feeds),
    string.optional[Main]("createdAt", _.createdAt),
  )(make).withId(id).addHints(hints)
}
