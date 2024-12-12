package app_bsky_feed_describeFeedGenerator

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Feed(uri: Option[String] = None)

object Feed extends ShapeTag.Companion[Feed] {
  val id: ShapeId = ShapeId("app_bsky_feed_describeFeedGenerator", "feed")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String]): Feed = Feed(uri)

  implicit val schema: Schema[Feed] = struct(
    string.optional[Feed]("uri", _.uri),
  )(make).withId(id).addHints(hints)
}
