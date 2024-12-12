package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class RepoView(did: Option[String] = None, handle: Option[String] = None, email: Option[String] = None, relatedRecords: Option[String] = None, indexedAt: Option[String] = None, moderation: Option[String] = None, invitedBy: Option[String] = None, invitesDisabled: Option[Boolean] = None, inviteNote: Option[String] = None, deactivatedAt: Option[String] = None, threatSignatures: Option[String] = None)

object RepoView extends ShapeTag.Companion[RepoView] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "repoView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String], handle: Option[String], email: Option[String], relatedRecords: Option[String], indexedAt: Option[String], moderation: Option[String], invitedBy: Option[String], invitesDisabled: Option[Boolean], inviteNote: Option[String], deactivatedAt: Option[String], threatSignatures: Option[String]): RepoView = RepoView(did, handle, email, relatedRecords, indexedAt, moderation, invitedBy, invitesDisabled, inviteNote, deactivatedAt, threatSignatures)

  implicit val schema: Schema[RepoView] = struct(
    string.optional[RepoView]("did", _.did),
    string.optional[RepoView]("handle", _.handle),
    string.optional[RepoView]("email", _.email),
    string.optional[RepoView]("relatedRecords", _.relatedRecords),
    string.optional[RepoView]("indexedAt", _.indexedAt),
    string.optional[RepoView]("moderation", _.moderation),
    string.optional[RepoView]("invitedBy", _.invitedBy),
    boolean.optional[RepoView]("invitesDisabled", _.invitesDisabled),
    string.optional[RepoView]("inviteNote", _.inviteNote),
    string.optional[RepoView]("deactivatedAt", _.deactivatedAt),
    string.optional[RepoView]("threatSignatures", _.threatSignatures),
  )(make).withId(id).addHints(hints)
}
