package lexicon.com.atproto.server.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class InviteCodeUse(usedBy: Option[String] = None, usedAt: Option[String] = None)

object InviteCodeUse extends ShapeTag.Companion[InviteCodeUse] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.server.defs", "inviteCodeUse")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(usedBy: Option[String], usedAt: Option[String]): InviteCodeUse = InviteCodeUse(usedBy, usedAt)

  implicit val schema: Schema[InviteCodeUse] = struct(
    string.optional[InviteCodeUse]("usedBy", _.usedBy),
    string.optional[InviteCodeUse]("usedAt", _.usedAt),
  )(make).withId(id).addHints(hints)
}
