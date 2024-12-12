package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class RepoViewDetail(did: Option[String] = None, handle: Option[String] = None, email: Option[String] = None, relatedRecords: Option[String] = None, indexedAt: Option[String] = None, moderation: Option[String] = None, labels: Option[String] = None, invitedBy: Option[String] = None, invites: Option[String] = None, invitesDisabled: Option[Boolean] = None, inviteNote: Option[String] = None, emailConfirmedAt: Option[String] = None, deactivatedAt: Option[String] = None, threatSignatures: Option[String] = None)

object RepoViewDetail extends ShapeTag.Companion[RepoViewDetail] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "repoViewDetail")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String], handle: Option[String], email: Option[String], relatedRecords: Option[String], indexedAt: Option[String], moderation: Option[String], labels: Option[String], invitedBy: Option[String], invites: Option[String], invitesDisabled: Option[Boolean], inviteNote: Option[String], emailConfirmedAt: Option[String], deactivatedAt: Option[String], threatSignatures: Option[String]): RepoViewDetail = RepoViewDetail(did, handle, email, relatedRecords, indexedAt, moderation, labels, invitedBy, invites, invitesDisabled, inviteNote, emailConfirmedAt, deactivatedAt, threatSignatures)

  implicit val schema: Schema[RepoViewDetail] = struct(
    string.optional[RepoViewDetail]("did", _.did),
    string.optional[RepoViewDetail]("handle", _.handle),
    string.optional[RepoViewDetail]("email", _.email),
    string.optional[RepoViewDetail]("relatedRecords", _.relatedRecords),
    string.optional[RepoViewDetail]("indexedAt", _.indexedAt),
    string.optional[RepoViewDetail]("moderation", _.moderation),
    string.optional[RepoViewDetail]("labels", _.labels),
    string.optional[RepoViewDetail]("invitedBy", _.invitedBy),
    string.optional[RepoViewDetail]("invites", _.invites),
    boolean.optional[RepoViewDetail]("invitesDisabled", _.invitesDisabled),
    string.optional[RepoViewDetail]("inviteNote", _.inviteNote),
    string.optional[RepoViewDetail]("emailConfirmedAt", _.emailConfirmedAt),
    string.optional[RepoViewDetail]("deactivatedAt", _.deactivatedAt),
    string.optional[RepoViewDetail]("threatSignatures", _.threatSignatures),
  )(make).withId(id).addHints(hints)
}
