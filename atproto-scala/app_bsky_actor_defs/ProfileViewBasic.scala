package app_bsky_actor_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ProfileViewBasic(did: Option[String] = None, handle: Option[String] = None, displayName: Option[String] = None, avatar: Option[String] = None, associated: Option[String] = None, viewer: Option[String] = None, labels: Option[String] = None, createdAt: Option[String] = None)

object ProfileViewBasic extends ShapeTag.Companion[ProfileViewBasic] {
  val id: ShapeId = ShapeId("app_bsky_actor_defs", "profileViewBasic")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String], handle: Option[String], displayName: Option[String], avatar: Option[String], associated: Option[String], viewer: Option[String], labels: Option[String], createdAt: Option[String]): ProfileViewBasic = ProfileViewBasic(did, handle, displayName, avatar, associated, viewer, labels, createdAt)

  implicit val schema: Schema[ProfileViewBasic] = struct(
    string.optional[ProfileViewBasic]("did", _.did),
    string.optional[ProfileViewBasic]("handle", _.handle),
    string.optional[ProfileViewBasic]("displayName", _.displayName),
    string.optional[ProfileViewBasic]("avatar", _.avatar),
    string.optional[ProfileViewBasic]("associated", _.associated),
    string.optional[ProfileViewBasic]("viewer", _.viewer),
    string.optional[ProfileViewBasic]("labels", _.labels),
    string.optional[ProfileViewBasic]("createdAt", _.createdAt),
  )(make).withId(id).addHints(hints)
}
