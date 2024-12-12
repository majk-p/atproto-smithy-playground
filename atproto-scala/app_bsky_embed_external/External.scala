package app_bsky_embed_external

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class External(uri: Option[String] = None, title: Option[String] = None, description: Option[String] = None, thumb: Option[String] = None)

object External extends ShapeTag.Companion[External] {
  val id: ShapeId = ShapeId("app_bsky_embed_external", "external")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], title: Option[String], description: Option[String], thumb: Option[String]): External = External(uri, title, description, thumb)

  implicit val schema: Schema[External] = struct(
    string.optional[External]("uri", _.uri),
    string.optional[External]("title", _.title),
    string.optional[External]("description", _.description),
    string.optional[External]("thumb", _.thumb),
  )(make).withId(id).addHints(hints)
}
