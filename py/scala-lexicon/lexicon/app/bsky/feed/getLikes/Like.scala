package lexicon.app.bsky.feed.getLikes

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Like(indexedAt: Option[String] = None, createdAt: Option[String] = None, actor: Option[String] = None)

object Like extends ShapeTag.Companion[Like] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.getLikes", "like")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(indexedAt: Option[String], createdAt: Option[String], actor: Option[String]): Like = Like(indexedAt, createdAt, actor)

  implicit val schema: Schema[Like] = struct(
    string.optional[Like]("indexedAt", _.indexedAt),
    string.optional[Like]("createdAt", _.createdAt),
    string.optional[Like]("actor", _.actor),
  )(make).withId(id).addHints(hints)
}
