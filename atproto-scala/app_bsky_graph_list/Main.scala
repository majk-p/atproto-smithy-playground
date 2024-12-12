package app_bsky_graph_list

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param purpose
  *   Defines the purpose of the list (aka, moderation-oriented or curration-oriented)
  * @param name
  *   Display name for list; can not be empty.
  */
final case class Main(purpose: Option[String] = None, name: Option[String] = None, description: Option[String] = None, descriptionFacets: Option[String] = None, avatar: Option[String] = None, labels: Option[String] = None, createdAt: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("app_bsky_graph_list", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(purpose: Option[String], name: Option[String], description: Option[String], descriptionFacets: Option[String], avatar: Option[String], labels: Option[String], createdAt: Option[String]): Main = Main(purpose, name, description, descriptionFacets, avatar, labels, createdAt)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("purpose", _.purpose).addHints(smithy.api.Documentation("Defines the purpose of the list (aka, moderation-oriented or curration-oriented)")),
    string.optional[Main]("name", _.name).addHints(smithy.api.Documentation("Display name for list; can not be empty.")),
    string.optional[Main]("description", _.description),
    string.optional[Main]("descriptionFacets", _.descriptionFacets),
    string.optional[Main]("avatar", _.avatar),
    string.optional[Main]("labels", _.labels),
    string.optional[Main]("createdAt", _.createdAt),
  )(make).withId(id).addHints(hints)
}
