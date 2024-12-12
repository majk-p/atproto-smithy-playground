package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param active
  *   Indicates that the account has a repository which can be fetched from the host that emitted this event.
  */
final case class AccountEvent(comment: Option[String] = None, active: Option[Boolean] = None, status: Option[String] = None, timestamp: Option[String] = None)

object AccountEvent extends ShapeTag.Companion[AccountEvent] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "accountEvent")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String], active: Option[Boolean], status: Option[String], timestamp: Option[String]): AccountEvent = AccountEvent(comment, active, status, timestamp)

  implicit val schema: Schema[AccountEvent] = struct(
    string.optional[AccountEvent]("comment", _.comment),
    boolean.optional[AccountEvent]("active", _.active).addHints(smithy.api.Documentation("Indicates that the account has a repository which can be fetched from the host that emitted this event.")),
    string.optional[AccountEvent]("status", _.status),
    string.optional[AccountEvent]("timestamp", _.timestamp),
  )(make).withId(id).addHints(hints)
}
