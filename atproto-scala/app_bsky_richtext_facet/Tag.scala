package app_bsky_richtext_facet

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Tag(tag: Option[String] = None)

object Tag extends ShapeTag.Companion[Tag] {
  val id: ShapeId = ShapeId("app_bsky_richtext_facet", "tag")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(tag: Option[String]): Tag = Tag(tag)

  implicit val schema: Schema[Tag] = struct(
    string.optional[Tag]("tag", _.tag),
  )(make).withId(id).addHints(hints)
}
