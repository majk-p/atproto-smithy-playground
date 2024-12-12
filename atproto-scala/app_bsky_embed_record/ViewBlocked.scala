package app_bsky_embed_record

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ViewBlocked(uri: Option[String] = None, blocked: Option[Boolean] = None, author: Option[String] = None)

object ViewBlocked extends ShapeTag.Companion[ViewBlocked] {
  val id: ShapeId = ShapeId("app_bsky_embed_record", "viewBlocked")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], blocked: Option[Boolean], author: Option[String]): ViewBlocked = ViewBlocked(uri, blocked, author)

  implicit val schema: Schema[ViewBlocked] = struct(
    string.optional[ViewBlocked]("uri", _.uri),
    boolean.optional[ViewBlocked]("blocked", _.blocked),
    string.optional[ViewBlocked]("author", _.author),
  )(make).withId(id).addHints(hints)
}
