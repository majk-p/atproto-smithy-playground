package lexicon.com.atproto.label.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param blurs
  *   What should this label hide in the UI, if applied? 'content' hides all of the target; 'media' hides the images/video/audio; 'none' hides nothing.
  * @param adultOnly
  *   Does the user need to have adult content enabled in order to configure this label?
  * @param identifier
  *   The value of the label being defined. Must only include lowercase ascii and the '-' character ([a-z-]+).
  * @param defaultSetting
  *   The default setting for this label.
  * @param severity
  *   How should a client visually convey this label? 'inform' means neutral and informational; 'alert' means negative and warning; 'none' means show nothing.
  */
final case class LabelValueDefinition(identifier: Option[String] = None, severity: Option[String] = None, blurs: Option[String] = None, defaultSetting: Option[String] = None, adultOnly: Option[Boolean] = None, locales: Option[String] = None)

object LabelValueDefinition extends ShapeTag.Companion[LabelValueDefinition] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.label.defs", "labelValueDefinition")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(identifier: Option[String], severity: Option[String], blurs: Option[String], defaultSetting: Option[String], adultOnly: Option[Boolean], locales: Option[String]): LabelValueDefinition = LabelValueDefinition(identifier, severity, blurs, defaultSetting, adultOnly, locales)

  implicit val schema: Schema[LabelValueDefinition] = struct(
    string.optional[LabelValueDefinition]("identifier", _.identifier).addHints(smithy.api.Documentation("The value of the label being defined. Must only include lowercase ascii and the \'-\' character ([a-z-]+).")),
    string.optional[LabelValueDefinition]("severity", _.severity).addHints(smithy.api.Documentation("How should a client visually convey this label? \'inform\' means neutral and informational; \'alert\' means negative and warning; \'none\' means show nothing.")),
    string.optional[LabelValueDefinition]("blurs", _.blurs).addHints(smithy.api.Documentation("What should this label hide in the UI, if applied? \'content\' hides all of the target; \'media\' hides the images/video/audio; \'none\' hides nothing.")),
    string.optional[LabelValueDefinition]("defaultSetting", _.defaultSetting).addHints(smithy.api.Documentation("The default setting for this label.")),
    boolean.optional[LabelValueDefinition]("adultOnly", _.adultOnly).addHints(smithy.api.Documentation("Does the user need to have adult content enabled in order to configure this label?")),
    string.optional[LabelValueDefinition]("locales", _.locales),
  )(make).withId(id).addHints(hints)
}
