package lexicon.com.atproto.server.createInviteCodes

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class AccountCodes(account: Option[String] = None, codes: Option[String] = None)

object AccountCodes extends ShapeTag.Companion[AccountCodes] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.server.createInviteCodes", "accountCodes")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(account: Option[String], codes: Option[String]): AccountCodes = AccountCodes(account, codes)

  implicit val schema: Schema[AccountCodes] = struct(
    string.optional[AccountCodes]("account", _.account),
    string.optional[AccountCodes]("codes", _.codes),
  )(make).withId(id).addHints(hints)
}
