package lexicon.app.bsky.feed.post

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param entities
  *   DEPRECATED: replaced by app.bsky.richtext.facet.
  * @param tags
  *   Additional hashtags, in addition to any included in post text and facets.
  * @param langs
  *   Indicates human language of post primary text content.
  * @param text
  *   The primary post content. May be an empty string, if there are embeds.
  * @param labels
  *   Self-label values for this post. Effectively content warnings.
  * @param createdAt
  *   Client-declared timestamp when this post was originally created.
  * @param facets
  *   Annotations of text (mentions, URLs, hashtags, etc)
  */
final case class Main(text: Option[String] = None, entities: Option[String] = None, facets: Option[String] = None, reply: Option[String] = None, embed: Option[String] = None, langs: Option[String] = None, labels: Option[String] = None, tags: Option[String] = None, createdAt: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.post", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(text: Option[String], entities: Option[String], facets: Option[String], reply: Option[String], embed: Option[String], langs: Option[String], labels: Option[String], tags: Option[String], createdAt: Option[String]): Main = Main(text, entities, facets, reply, embed, langs, labels, tags, createdAt)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("text", _.text).addHints(smithy.api.Documentation("The primary post content. May be an empty string, if there are embeds.")),
    string.optional[Main]("entities", _.entities).addHints(smithy.api.Documentation("DEPRECATED: replaced by app.bsky.richtext.facet.")),
    string.optional[Main]("facets", _.facets).addHints(smithy.api.Documentation("Annotations of text (mentions, URLs, hashtags, etc)")),
    string.optional[Main]("reply", _.reply),
    string.optional[Main]("embed", _.embed),
    string.optional[Main]("langs", _.langs).addHints(smithy.api.Documentation("Indicates human language of post primary text content.")),
    string.optional[Main]("labels", _.labels).addHints(smithy.api.Documentation("Self-label values for this post. Effectively content warnings.")),
    string.optional[Main]("tags", _.tags).addHints(smithy.api.Documentation("Additional hashtags, in addition to any included in post text and facets.")),
    string.optional[Main]("createdAt", _.createdAt).addHints(smithy.api.Documentation("Client-declared timestamp when this post was originally created.")),
  )(make).withId(id).addHints(hints)
}
