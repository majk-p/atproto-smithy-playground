package lexicon.com.atproto.admin.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class RepoRef(did: Option[String] = None)

object RepoRef extends ShapeTag.Companion[RepoRef] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.admin.defs", "repoRef")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String]): RepoRef = RepoRef(did)

  implicit val schema: Schema[RepoRef] = struct(
    string.optional[RepoRef]("did", _.did),
  )(make).withId(id).addHints(hints)
}
