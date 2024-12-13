package lexicon.app.bsky.feed.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class NotFoundPost(uri: Option[String] = None, notFound: Option[Boolean] = None)

object NotFoundPost extends ShapeTag.Companion[NotFoundPost] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.defs", "notFoundPost")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], notFound: Option[Boolean]): NotFoundPost = NotFoundPost(uri, notFound)

  implicit val schema: Schema[NotFoundPost] = struct(
    string.optional[NotFoundPost]("uri", _.uri),
    boolean.optional[NotFoundPost]("notFound", _.notFound),
  )(make).withId(id).addHints(hints)
}
