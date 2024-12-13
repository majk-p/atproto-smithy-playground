package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class IdentityEvent(comment: Option[String] = None, handle: Option[String] = None, pdsHost: Option[String] = None, tombstone: Option[Boolean] = None, timestamp: Option[String] = None)

object IdentityEvent extends ShapeTag.Companion[IdentityEvent] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "identityEvent")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(comment: Option[String], handle: Option[String], pdsHost: Option[String], tombstone: Option[Boolean], timestamp: Option[String]): IdentityEvent = IdentityEvent(comment, handle, pdsHost, tombstone, timestamp)

  implicit val schema: Schema[IdentityEvent] = struct(
    string.optional[IdentityEvent]("comment", _.comment),
    string.optional[IdentityEvent]("handle", _.handle),
    string.optional[IdentityEvent]("pdsHost", _.pdsHost),
    boolean.optional[IdentityEvent]("tombstone", _.tombstone),
    string.optional[IdentityEvent]("timestamp", _.timestamp),
  )(make).withId(id).addHints(hints)
}
