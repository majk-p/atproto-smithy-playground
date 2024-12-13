package lexicon.app.bsky.feed.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ThreadViewPost(post: Option[String] = None, parent: Option[String] = None, replies: Option[String] = None)

object ThreadViewPost extends ShapeTag.Companion[ThreadViewPost] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.defs", "threadViewPost")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(post: Option[String], parent: Option[String], replies: Option[String]): ThreadViewPost = ThreadViewPost(post, parent, replies)

  implicit val schema: Schema[ThreadViewPost] = struct(
    string.optional[ThreadViewPost]("post", _.post),
    string.optional[ThreadViewPost]("parent", _.parent),
    string.optional[ThreadViewPost]("replies", _.replies),
  )(make).withId(id).addHints(hints)
}
