package com_atproto_sync_subscribeRepos

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param cid
  *   For creates and updates, the new record CID. For deletions, null.
  */
final case class RepoOp(action: Option[String] = None, path: Option[String] = None, cid: Option[String] = None)

object RepoOp extends ShapeTag.Companion[RepoOp] {
  val id: ShapeId = ShapeId("com_atproto_sync_subscribeRepos", "repoOp")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(action: Option[String], path: Option[String], cid: Option[String]): RepoOp = RepoOp(action, path, cid)

  implicit val schema: Schema[RepoOp] = struct(
    string.optional[RepoOp]("action", _.action),
    string.optional[RepoOp]("path", _.path),
    string.optional[RepoOp]("cid", _.cid).addHints(smithy.api.Documentation("For creates and updates, the new record CID. For deletions, null.")),
  )(make).withId(id).addHints(hints)
}
