package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class AccountHosting(status: Option[String] = None, updatedAt: Option[String] = None, createdAt: Option[String] = None, deletedAt: Option[String] = None, deactivatedAt: Option[String] = None, reactivatedAt: Option[String] = None)

object AccountHosting extends ShapeTag.Companion[AccountHosting] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "accountHosting")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(status: Option[String], updatedAt: Option[String], createdAt: Option[String], deletedAt: Option[String], deactivatedAt: Option[String], reactivatedAt: Option[String]): AccountHosting = AccountHosting(status, updatedAt, createdAt, deletedAt, deactivatedAt, reactivatedAt)

  implicit val schema: Schema[AccountHosting] = struct(
    string.optional[AccountHosting]("status", _.status),
    string.optional[AccountHosting]("updatedAt", _.updatedAt),
    string.optional[AccountHosting]("createdAt", _.createdAt),
    string.optional[AccountHosting]("deletedAt", _.deletedAt),
    string.optional[AccountHosting]("deactivatedAt", _.deactivatedAt),
    string.optional[AccountHosting]("reactivatedAt", _.reactivatedAt),
  )(make).withId(id).addHints(hints)
}
