package tools_ozone_signature_findRelatedAccounts

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class RelatedAccount(account: Option[String] = None, similarities: Option[String] = None)

object RelatedAccount extends ShapeTag.Companion[RelatedAccount] {
  val id: ShapeId = ShapeId("tools_ozone_signature_findRelatedAccounts", "relatedAccount")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(account: Option[String], similarities: Option[String]): RelatedAccount = RelatedAccount(account, similarities)

  implicit val schema: Schema[RelatedAccount] = struct(
    string.optional[RelatedAccount]("account", _.account),
    string.optional[RelatedAccount]("similarities", _.similarities),
  )(make).withId(id).addHints(hints)
}
