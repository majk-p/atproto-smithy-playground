package lexicon.app.bsky.unspecced.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class SkeletonSearchStarterPack(uri: Option[String] = None)

object SkeletonSearchStarterPack extends ShapeTag.Companion[SkeletonSearchStarterPack] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.unspecced.defs", "skeletonSearchStarterPack")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String]): SkeletonSearchStarterPack = SkeletonSearchStarterPack(uri)

  implicit val schema: Schema[SkeletonSearchStarterPack] = struct(
    string.optional[SkeletonSearchStarterPack]("uri", _.uri),
  )(make).withId(id).addHints(hints)
}
