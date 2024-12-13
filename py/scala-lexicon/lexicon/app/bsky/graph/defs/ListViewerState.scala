package lexicon.app.bsky.graph.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ListViewerState(muted: Option[Boolean] = None, blocked: Option[String] = None)

object ListViewerState extends ShapeTag.Companion[ListViewerState] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.graph.defs", "listViewerState")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(muted: Option[Boolean], blocked: Option[String]): ListViewerState = ListViewerState(muted, blocked)

  implicit val schema: Schema[ListViewerState] = struct(
    boolean.optional[ListViewerState]("muted", _.muted),
    string.optional[ListViewerState]("blocked", _.blocked),
  )(make).withId(id).addHints(hints)
}
