package app_bsky_feed_threadgate

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param post
  *   Reference (AT-URI) to the post record.
  * @param hiddenReplies
  *   List of hidden reply URIs.
  */
final case class Main(post: Option[String] = None, allow: Option[String] = None, createdAt: Option[String] = None, hiddenReplies: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("app_bsky_feed_threadgate", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(post: Option[String], allow: Option[String], createdAt: Option[String], hiddenReplies: Option[String]): Main = Main(post, allow, createdAt, hiddenReplies)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("post", _.post).addHints(smithy.api.Documentation("Reference (AT-URI) to the post record.")),
    string.optional[Main]("allow", _.allow),
    string.optional[Main]("createdAt", _.createdAt),
    string.optional[Main]("hiddenReplies", _.hiddenReplies).addHints(smithy.api.Documentation("List of hidden reply URIs.")),
  )(make).withId(id).addHints(hints)
}
