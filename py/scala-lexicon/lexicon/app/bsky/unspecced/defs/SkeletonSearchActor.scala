package lexicon.app.bsky.unspecced.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class SkeletonSearchActor(did: Option[String] = None)

object SkeletonSearchActor extends ShapeTag.Companion[SkeletonSearchActor] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.unspecced.defs", "skeletonSearchActor")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String]): SkeletonSearchActor = SkeletonSearchActor(did)

  implicit val schema: Schema[SkeletonSearchActor] = struct(
    string.optional[SkeletonSearchActor]("did", _.did),
  )(make).withId(id).addHints(hints)
}
