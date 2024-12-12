package app_bsky_feed_postgate

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param post
  *   Reference (AT-URI) to the post record.
  * @param detachedEmbeddingUris
  *   List of AT-URIs embedding this post that the author has detached from.
  */
final case class Main(createdAt: Option[String] = None, post: Option[String] = None, detachedEmbeddingUris: Option[String] = None, embeddingRules: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("app_bsky_feed_postgate", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(createdAt: Option[String], post: Option[String], detachedEmbeddingUris: Option[String], embeddingRules: Option[String]): Main = Main(createdAt, post, detachedEmbeddingUris, embeddingRules)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("createdAt", _.createdAt),
    string.optional[Main]("post", _.post).addHints(smithy.api.Documentation("Reference (AT-URI) to the post record.")),
    string.optional[Main]("detachedEmbeddingUris", _.detachedEmbeddingUris).addHints(smithy.api.Documentation("List of AT-URIs embedding this post that the author has detached from.")),
    string.optional[Main]("embeddingRules", _.embeddingRules),
  )(make).withId(id).addHints(hints)
}
