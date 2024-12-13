package lexicon.com.atproto.repo.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class CommitMeta(cid: Option[String] = None, rev: Option[String] = None)

object CommitMeta extends ShapeTag.Companion[CommitMeta] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.repo.defs", "commitMeta")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(cid: Option[String], rev: Option[String]): CommitMeta = CommitMeta(cid, rev)

  implicit val schema: Schema[CommitMeta] = struct(
    string.optional[CommitMeta]("cid", _.cid),
    string.optional[CommitMeta]("rev", _.rev),
  )(make).withId(id).addHints(hints)
}
