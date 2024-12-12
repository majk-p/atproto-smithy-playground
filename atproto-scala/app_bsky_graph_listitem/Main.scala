package app_bsky_graph_listitem

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param subject
  *   The account which is included on the list.
  * @param list
  *   Reference (AT-URI) to the list record (app.bsky.graph.list).
  */
final case class Main(subject: Option[String] = None, list: Option[String] = None, createdAt: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("app_bsky_graph_listitem", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(subject: Option[String], list: Option[String], createdAt: Option[String]): Main = Main(subject, list, createdAt)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("subject", _.subject).addHints(smithy.api.Documentation("The account which is included on the list.")),
    string.optional[Main]("list", _.list).addHints(smithy.api.Documentation("Reference (AT-URI) to the list record (app.bsky.graph.list).")),
    string.optional[Main]("createdAt", _.createdAt),
  )(make).withId(id).addHints(hints)
}
