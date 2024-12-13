package lexicon.app.bsky.actor.profile

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param description
  *   Free-form profile description text.
  * @param avatar
  *   Small image to be displayed next to posts from account. AKA, 'profile picture'
  * @param banner
  *   Larger horizontal image to display behind profile view.
  * @param labels
  *   Self-label values, specific to the Bluesky application, on the overall account.
  */
final case class Main(displayName: Option[String] = None, description: Option[String] = None, avatar: Option[String] = None, banner: Option[String] = None, labels: Option[String] = None, joinedViaStarterPack: Option[String] = None, pinnedPost: Option[String] = None, createdAt: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.actor.profile", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(displayName: Option[String], description: Option[String], avatar: Option[String], banner: Option[String], labels: Option[String], joinedViaStarterPack: Option[String], pinnedPost: Option[String], createdAt: Option[String]): Main = Main(displayName, description, avatar, banner, labels, joinedViaStarterPack, pinnedPost, createdAt)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("displayName", _.displayName),
    string.optional[Main]("description", _.description).addHints(smithy.api.Documentation("Free-form profile description text.")),
    string.optional[Main]("avatar", _.avatar).addHints(smithy.api.Documentation("Small image to be displayed next to posts from account. AKA, \'profile picture\'")),
    string.optional[Main]("banner", _.banner).addHints(smithy.api.Documentation("Larger horizontal image to display behind profile view.")),
    string.optional[Main]("labels", _.labels).addHints(smithy.api.Documentation("Self-label values, specific to the Bluesky application, on the overall account.")),
    string.optional[Main]("joinedViaStarterPack", _.joinedViaStarterPack),
    string.optional[Main]("pinnedPost", _.pinnedPost),
    string.optional[Main]("createdAt", _.createdAt),
  )(make).withId(id).addHints(hints)
}
