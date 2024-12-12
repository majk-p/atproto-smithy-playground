package app_bsky_unspecced_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class SkeletonSearchPost(uri: Option[String] = None)

object SkeletonSearchPost extends ShapeTag.Companion[SkeletonSearchPost] {
  val id: ShapeId = ShapeId("app_bsky_unspecced_defs", "skeletonSearchPost")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String]): SkeletonSearchPost = SkeletonSearchPost(uri)

  implicit val schema: Schema[SkeletonSearchPost] = struct(
    string.optional[SkeletonSearchPost]("uri", _.uri),
  )(make).withId(id).addHints(hints)
}
