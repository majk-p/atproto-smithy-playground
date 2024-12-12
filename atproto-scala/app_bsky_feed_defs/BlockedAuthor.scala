package app_bsky_feed_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class BlockedAuthor(did: Option[String] = None, viewer: Option[String] = None)

object BlockedAuthor extends ShapeTag.Companion[BlockedAuthor] {
  val id: ShapeId = ShapeId("app_bsky_feed_defs", "blockedAuthor")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String], viewer: Option[String]): BlockedAuthor = BlockedAuthor(did, viewer)

  implicit val schema: Schema[BlockedAuthor] = struct(
    string.optional[BlockedAuthor]("did", _.did),
    string.optional[BlockedAuthor]("viewer", _.viewer),
  )(make).withId(id).addHints(hints)
}
