package app_bsky_graph_starterpack

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class FeedItem(uri: Option[String] = None)

object FeedItem extends ShapeTag.Companion[FeedItem] {
  val id: ShapeId = ShapeId("app_bsky_graph_starterpack", "feedItem")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String]): FeedItem = FeedItem(uri)

  implicit val schema: Schema[FeedItem] = struct(
    string.optional[FeedItem]("uri", _.uri),
  )(make).withId(id).addHints(hints)
}
