package lexicon.com.atproto.server.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class InviteCode(code: Option[String] = None, available: Option[Int] = None, disabled: Option[Boolean] = None, forAccount: Option[String] = None, createdBy: Option[String] = None, createdAt: Option[String] = None, uses: Option[String] = None)

object InviteCode extends ShapeTag.Companion[InviteCode] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.server.defs", "inviteCode")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(code: Option[String], available: Option[Int], disabled: Option[Boolean], forAccount: Option[String], createdBy: Option[String], createdAt: Option[String], uses: Option[String]): InviteCode = InviteCode(code, available, disabled, forAccount, createdBy, createdAt, uses)

  implicit val schema: Schema[InviteCode] = struct(
    string.optional[InviteCode]("code", _.code),
    int.optional[InviteCode]("available", _.available),
    boolean.optional[InviteCode]("disabled", _.disabled),
    string.optional[InviteCode]("forAccount", _.forAccount),
    string.optional[InviteCode]("createdBy", _.createdBy),
    string.optional[InviteCode]("createdAt", _.createdAt),
    string.optional[InviteCode]("uses", _.uses),
  )(make).withId(id).addHints(hints)
}
