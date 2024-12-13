package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param add
  *   Tags to be added to the subject. If already exists, won't be duplicated.
  * @param remove
  *   Tags to be removed to the subject. Ignores a tag If it doesn't exist, won't be duplicated.
  * @param comment
  *   Additional comment about added/removed tags.
  */
final case class ModEventTag(add: Option[String] = None, remove: Option[String] = None, comment: Option[String] = None)

object ModEventTag extends ShapeTag.Companion[ModEventTag] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "modEventTag")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(add: Option[String], remove: Option[String], comment: Option[String]): ModEventTag = ModEventTag(add, remove, comment)

  implicit val schema: Schema[ModEventTag] = struct(
    string.optional[ModEventTag]("add", _.add).addHints(smithy.api.Documentation("Tags to be added to the subject. If already exists, won\'t be duplicated.")),
    string.optional[ModEventTag]("remove", _.remove).addHints(smithy.api.Documentation("Tags to be removed to the subject. Ignores a tag If it doesn\'t exist, won\'t be duplicated.")),
    string.optional[ModEventTag]("comment", _.comment).addHints(smithy.api.Documentation("Additional comment about added/removed tags.")),
  )(make).withId(id).addHints(hints)
}
