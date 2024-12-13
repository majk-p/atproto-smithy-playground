package lexicon.app.bsky.actor.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ProfileViewDetailed(did: Option[String] = None, handle: Option[String] = None, displayName: Option[String] = None, description: Option[String] = None, avatar: Option[String] = None, banner: Option[String] = None, followersCount: Option[Int] = None, followsCount: Option[Int] = None, postsCount: Option[Int] = None, associated: Option[String] = None, joinedViaStarterPack: Option[String] = None, indexedAt: Option[String] = None, createdAt: Option[String] = None, viewer: Option[String] = None, labels: Option[String] = None, pinnedPost: Option[String] = None)

object ProfileViewDetailed extends ShapeTag.Companion[ProfileViewDetailed] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.actor.defs", "profileViewDetailed")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String], handle: Option[String], displayName: Option[String], description: Option[String], avatar: Option[String], banner: Option[String], followersCount: Option[Int], followsCount: Option[Int], postsCount: Option[Int], associated: Option[String], joinedViaStarterPack: Option[String], indexedAt: Option[String], createdAt: Option[String], viewer: Option[String], labels: Option[String], pinnedPost: Option[String]): ProfileViewDetailed = ProfileViewDetailed(did, handle, displayName, description, avatar, banner, followersCount, followsCount, postsCount, associated, joinedViaStarterPack, indexedAt, createdAt, viewer, labels, pinnedPost)

  implicit val schema: Schema[ProfileViewDetailed] = struct(
    string.optional[ProfileViewDetailed]("did", _.did),
    string.optional[ProfileViewDetailed]("handle", _.handle),
    string.optional[ProfileViewDetailed]("displayName", _.displayName),
    string.optional[ProfileViewDetailed]("description", _.description),
    string.optional[ProfileViewDetailed]("avatar", _.avatar),
    string.optional[ProfileViewDetailed]("banner", _.banner),
    int.optional[ProfileViewDetailed]("followersCount", _.followersCount),
    int.optional[ProfileViewDetailed]("followsCount", _.followsCount),
    int.optional[ProfileViewDetailed]("postsCount", _.postsCount),
    string.optional[ProfileViewDetailed]("associated", _.associated),
    string.optional[ProfileViewDetailed]("joinedViaStarterPack", _.joinedViaStarterPack),
    string.optional[ProfileViewDetailed]("indexedAt", _.indexedAt),
    string.optional[ProfileViewDetailed]("createdAt", _.createdAt),
    string.optional[ProfileViewDetailed]("viewer", _.viewer),
    string.optional[ProfileViewDetailed]("labels", _.labels),
    string.optional[ProfileViewDetailed]("pinnedPost", _.pinnedPost),
  )(make).withId(id).addHints(hints)
}
