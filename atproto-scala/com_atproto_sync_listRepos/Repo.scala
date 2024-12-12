package com_atproto_sync_listRepos

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param head
  *   Current repo commit CID
  * @param status
  *   If active=false, this optional field indicates a possible reason for why the account is not active. If active=false and no status is supplied, then the host makes no claim for why the repository is no longer being hosted.
  */
final case class Repo(did: Option[String] = None, head: Option[String] = None, rev: Option[String] = None, active: Option[Boolean] = None, status: Option[String] = None)

object Repo extends ShapeTag.Companion[Repo] {
  val id: ShapeId = ShapeId("com_atproto_sync_listRepos", "repo")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String], head: Option[String], rev: Option[String], active: Option[Boolean], status: Option[String]): Repo = Repo(did, head, rev, active, status)

  implicit val schema: Schema[Repo] = struct(
    string.optional[Repo]("did", _.did),
    string.optional[Repo]("head", _.head).addHints(smithy.api.Documentation("Current repo commit CID")),
    string.optional[Repo]("rev", _.rev),
    boolean.optional[Repo]("active", _.active),
    string.optional[Repo]("status", _.status).addHints(smithy.api.Documentation("If active=false, this optional field indicates a possible reason for why the account is not active. If active=false and no status is supplied, then the host makes no claim for why the repository is no longer being hosted.")),
  )(make).withId(id).addHints(hints)
}
