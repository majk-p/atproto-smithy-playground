package chat_bsky_convo_defs

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
final case class MessageView(id: Option[String] = None, rev: Option[String] = None, text: Option[String] = None, facets: Option[String] = None, embed: Option[String] = None, sender: Option[String] = None, sentAt: Option[String] = None)

object MessageView extends ShapeTag.Companion[MessageView] {
  val id: ShapeId = ShapeId("chat_bsky_convo_defs", "messageView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(id: Option[String], rev: Option[String], text: Option[String], facets: Option[String], embed: Option[String], sender: Option[String], sentAt: Option[String]): MessageView = MessageView(id, rev, text, facets, embed, sender, sentAt)

  implicit val schema: Schema[MessageView] = struct(
    string.optional[MessageView]("id", _.id),
    string.optional[MessageView]("rev", _.rev),
    string.optional[MessageView]("text", _.text),
    string.optional[MessageView]("facets", _.facets).addHints(smithy.api.Documentation("Annotations of text (mentions, URLs, hashtags, etc)")),
    string.optional[MessageView]("embed", _.embed),
    string.optional[MessageView]("sender", _.sender),
    string.optional[MessageView]("sentAt", _.sentAt),
  )(make).withId(id).addHints(hints)
}
