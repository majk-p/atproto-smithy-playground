package lexicon.app.bsky.feed.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class BlockedPost(uri: Option[String] = None, blocked: Option[Boolean] = None, author: Option[String] = None)

object BlockedPost extends ShapeTag.Companion[BlockedPost] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.defs", "blockedPost")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], blocked: Option[Boolean], author: Option[String]): BlockedPost = BlockedPost(uri, blocked, author)

  implicit val schema: Schema[BlockedPost] = struct(
    string.optional[BlockedPost]("uri", _.uri),
    boolean.optional[BlockedPost]("blocked", _.blocked),
    string.optional[BlockedPost]("author", _.author),
  )(make).withId(id).addHints(hints)
}
