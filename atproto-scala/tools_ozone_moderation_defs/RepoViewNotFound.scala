package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class RepoViewNotFound(did: Option[String] = None)

object RepoViewNotFound extends ShapeTag.Companion[RepoViewNotFound] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "repoViewNotFound")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String]): RepoViewNotFound = RepoViewNotFound(did)

  implicit val schema: Schema[RepoViewNotFound] = struct(
    string.optional[RepoViewNotFound]("did", _.did),
  )(make).withId(id).addHints(hints)
}
