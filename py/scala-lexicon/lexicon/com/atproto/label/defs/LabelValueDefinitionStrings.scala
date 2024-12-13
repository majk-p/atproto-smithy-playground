package lexicon.com.atproto.label.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param lang
  *   The code of the language these strings are written in.
  * @param name
  *   A short human-readable name for the label.
  * @param description
  *   A longer description of what the label means and why it might be applied.
  */
final case class LabelValueDefinitionStrings(lang: Option[String] = None, name: Option[String] = None, description: Option[String] = None)

object LabelValueDefinitionStrings extends ShapeTag.Companion[LabelValueDefinitionStrings] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.label.defs", "labelValueDefinitionStrings")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(lang: Option[String], name: Option[String], description: Option[String]): LabelValueDefinitionStrings = LabelValueDefinitionStrings(lang, name, description)

  implicit val schema: Schema[LabelValueDefinitionStrings] = struct(
    string.optional[LabelValueDefinitionStrings]("lang", _.lang).addHints(smithy.api.Documentation("The code of the language these strings are written in.")),
    string.optional[LabelValueDefinitionStrings]("name", _.name).addHints(smithy.api.Documentation("A short human-readable name for the label.")),
    string.optional[LabelValueDefinitionStrings]("description", _.description).addHints(smithy.api.Documentation("A longer description of what the label means and why it might be applied.")),
  )(make).withId(id).addHints(hints)
}
