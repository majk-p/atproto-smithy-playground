package com_atproto_admin_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class AccountView(did: Option[String] = None, handle: Option[String] = None, email: Option[String] = None, relatedRecords: Option[String] = None, indexedAt: Option[String] = None, invitedBy: Option[String] = None, invites: Option[String] = None, invitesDisabled: Option[Boolean] = None, emailConfirmedAt: Option[String] = None, inviteNote: Option[String] = None, deactivatedAt: Option[String] = None, threatSignatures: Option[String] = None)

object AccountView extends ShapeTag.Companion[AccountView] {
  val id: ShapeId = ShapeId("com_atproto_admin_defs", "accountView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String], handle: Option[String], email: Option[String], relatedRecords: Option[String], indexedAt: Option[String], invitedBy: Option[String], invites: Option[String], invitesDisabled: Option[Boolean], emailConfirmedAt: Option[String], inviteNote: Option[String], deactivatedAt: Option[String], threatSignatures: Option[String]): AccountView = AccountView(did, handle, email, relatedRecords, indexedAt, invitedBy, invites, invitesDisabled, emailConfirmedAt, inviteNote, deactivatedAt, threatSignatures)

  implicit val schema: Schema[AccountView] = struct(
    string.optional[AccountView]("did", _.did),
    string.optional[AccountView]("handle", _.handle),
    string.optional[AccountView]("email", _.email),
    string.optional[AccountView]("relatedRecords", _.relatedRecords),
    string.optional[AccountView]("indexedAt", _.indexedAt),
    string.optional[AccountView]("invitedBy", _.invitedBy),
    string.optional[AccountView]("invites", _.invites),
    boolean.optional[AccountView]("invitesDisabled", _.invitesDisabled),
    string.optional[AccountView]("emailConfirmedAt", _.emailConfirmedAt),
    string.optional[AccountView]("inviteNote", _.inviteNote),
    string.optional[AccountView]("deactivatedAt", _.deactivatedAt),
    string.optional[AccountView]("threatSignatures", _.threatSignatures),
  )(make).withId(id).addHints(hints)
}
