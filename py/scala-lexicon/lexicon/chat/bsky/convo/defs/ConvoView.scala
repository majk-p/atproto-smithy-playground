package lexicon.chat.bsky.convo.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ConvoView(id: Option[String] = None, rev: Option[String] = None, members: Option[String] = None, lastMessage: Option[String] = None, muted: Option[Boolean] = None, opened: Option[Boolean] = None, unreadCount: Option[Int] = None)

object ConvoView extends ShapeTag.Companion[ConvoView] {
  val id: ShapeId = ShapeId("lexicon.chat.bsky.convo.defs", "convoView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(id: Option[String], rev: Option[String], members: Option[String], lastMessage: Option[String], muted: Option[Boolean], opened: Option[Boolean], unreadCount: Option[Int]): ConvoView = ConvoView(id, rev, members, lastMessage, muted, opened, unreadCount)

  implicit val schema: Schema[ConvoView] = struct(
    string.optional[ConvoView]("id", _.id),
    string.optional[ConvoView]("rev", _.rev),
    string.optional[ConvoView]("members", _.members),
    string.optional[ConvoView]("lastMessage", _.lastMessage),
    boolean.optional[ConvoView]("muted", _.muted),
    boolean.optional[ConvoView]("opened", _.opened),
    int.optional[ConvoView]("unreadCount", _.unreadCount),
  )(make).withId(id).addHints(hints)
}
