package app_bsky_embed_record

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ViewNotFound(uri: Option[String] = None, notFound: Option[Boolean] = None)

object ViewNotFound extends ShapeTag.Companion[ViewNotFound] {
  val id: ShapeId = ShapeId("app_bsky_embed_record", "viewNotFound")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], notFound: Option[Boolean]): ViewNotFound = ViewNotFound(uri, notFound)

  implicit val schema: Schema[ViewNotFound] = struct(
    string.optional[ViewNotFound]("uri", _.uri),
    boolean.optional[ViewNotFound]("notFound", _.notFound),
  )(make).withId(id).addHints(hints)
}
