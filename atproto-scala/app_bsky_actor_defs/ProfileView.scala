package app_bsky_actor_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ProfileView(did: Option[String] = None, handle: Option[String] = None, displayName: Option[String] = None, description: Option[String] = None, avatar: Option[String] = None, associated: Option[String] = None, indexedAt: Option[String] = None, createdAt: Option[String] = None, viewer: Option[String] = None, labels: Option[String] = None)

object ProfileView extends ShapeTag.Companion[ProfileView] {
  val id: ShapeId = ShapeId("app_bsky_actor_defs", "profileView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String], handle: Option[String], displayName: Option[String], description: Option[String], avatar: Option[String], associated: Option[String], indexedAt: Option[String], createdAt: Option[String], viewer: Option[String], labels: Option[String]): ProfileView = ProfileView(did, handle, displayName, description, avatar, associated, indexedAt, createdAt, viewer, labels)

  implicit val schema: Schema[ProfileView] = struct(
    string.optional[ProfileView]("did", _.did),
    string.optional[ProfileView]("handle", _.handle),
    string.optional[ProfileView]("displayName", _.displayName),
    string.optional[ProfileView]("description", _.description),
    string.optional[ProfileView]("avatar", _.avatar),
    string.optional[ProfileView]("associated", _.associated),
    string.optional[ProfileView]("indexedAt", _.indexedAt),
    string.optional[ProfileView]("createdAt", _.createdAt),
    string.optional[ProfileView]("viewer", _.viewer),
    string.optional[ProfileView]("labels", _.labels),
  )(make).withId(id).addHints(hints)
}
