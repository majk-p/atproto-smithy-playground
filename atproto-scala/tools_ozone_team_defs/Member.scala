package tools_ozone_team_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Member(did: Option[String] = None, disabled: Option[Boolean] = None, profile: Option[String] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, lastUpdatedBy: Option[String] = None, role: Option[String] = None)

object Member extends ShapeTag.Companion[Member] {
  val id: ShapeId = ShapeId("tools_ozone_team_defs", "member")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String], disabled: Option[Boolean], profile: Option[String], createdAt: Option[String], updatedAt: Option[String], lastUpdatedBy: Option[String], role: Option[String]): Member = Member(did, disabled, profile, createdAt, updatedAt, lastUpdatedBy, role)

  implicit val schema: Schema[Member] = struct(
    string.optional[Member]("did", _.did),
    boolean.optional[Member]("disabled", _.disabled),
    string.optional[Member]("profile", _.profile),
    string.optional[Member]("createdAt", _.createdAt),
    string.optional[Member]("updatedAt", _.updatedAt),
    string.optional[Member]("lastUpdatedBy", _.lastUpdatedBy),
    string.optional[Member]("role", _.role),
  )(make).withId(id).addHints(hints)
}
