package tools_ozone_communication_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param name
  *   Name of the template.
  * @param subject
  *   Content of the template, can contain markdown and variable placeholders.
  * @param contentMarkdown
  *   Subject of the message, used in emails.
  * @param lastUpdatedBy
  *   DID of the user who last updated the template.
  * @param lang
  *   Message language.
  */
final case class TemplateView(id: Option[String] = None, name: Option[String] = None, subject: Option[String] = None, contentMarkdown: Option[String] = None, disabled: Option[Boolean] = None, lang: Option[String] = None, lastUpdatedBy: Option[String] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None)

object TemplateView extends ShapeTag.Companion[TemplateView] {
  val id: ShapeId = ShapeId("tools_ozone_communication_defs", "templateView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(id: Option[String], name: Option[String], subject: Option[String], contentMarkdown: Option[String], disabled: Option[Boolean], lang: Option[String], lastUpdatedBy: Option[String], createdAt: Option[String], updatedAt: Option[String]): TemplateView = TemplateView(id, name, subject, contentMarkdown, disabled, lang, lastUpdatedBy, createdAt, updatedAt)

  implicit val schema: Schema[TemplateView] = struct(
    string.optional[TemplateView]("id", _.id),
    string.optional[TemplateView]("name", _.name).addHints(smithy.api.Documentation("Name of the template.")),
    string.optional[TemplateView]("subject", _.subject).addHints(smithy.api.Documentation("Content of the template, can contain markdown and variable placeholders.")),
    string.optional[TemplateView]("contentMarkdown", _.contentMarkdown).addHints(smithy.api.Documentation("Subject of the message, used in emails.")),
    boolean.optional[TemplateView]("disabled", _.disabled),
    string.optional[TemplateView]("lang", _.lang).addHints(smithy.api.Documentation("Message language.")),
    string.optional[TemplateView]("lastUpdatedBy", _.lastUpdatedBy).addHints(smithy.api.Documentation("DID of the user who last updated the template.")),
    string.optional[TemplateView]("createdAt", _.createdAt),
    string.optional[TemplateView]("updatedAt", _.updatedAt),
  )(make).withId(id).addHints(hints)
}
