package app_bsky_graph_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ListItemView(uri: Option[String] = None, subject: Option[String] = None)

object ListItemView extends ShapeTag.Companion[ListItemView] {
  val id: ShapeId = ShapeId("app_bsky_graph_defs", "listItemView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], subject: Option[String]): ListItemView = ListItemView(uri, subject)

  implicit val schema: Schema[ListItemView] = struct(
    string.optional[ListItemView]("uri", _.uri),
    string.optional[ListItemView]("subject", _.subject),
  )(make).withId(id).addHints(hints)
}
