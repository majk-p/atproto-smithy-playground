package lexicon.chat.bsky.convo.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param facets
  *   Annotations of text (mentions, URLs, hashtags, etc)
  */
final case class MessageInput(text: Option[String] = None, facets: Option[String] = None, embed: Option[String] = None)

object MessageInput extends ShapeTag.Companion[MessageInput] {
  val id: ShapeId = ShapeId("lexicon.chat.bsky.convo.defs", "messageInput")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(text: Option[String], facets: Option[String], embed: Option[String]): MessageInput = MessageInput(text, facets, embed)

  implicit val schema: Schema[MessageInput] = struct(
    string.optional[MessageInput]("text", _.text),
    string.optional[MessageInput]("facets", _.facets).addHints(smithy.api.Documentation("Annotations of text (mentions, URLs, hashtags, etc)")),
    string.optional[MessageInput]("embed", _.embed),
  )(make).withId(id).addHints(hints)
}
