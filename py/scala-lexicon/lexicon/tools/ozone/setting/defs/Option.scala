package lexicon.tools.ozone.setting.defs

import smithy4s.Document
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.document
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Option(key: scala.Option[String] = None, did: scala.Option[String] = None, value: scala.Option[Document] = None, description: scala.Option[String] = None, createdAt: scala.Option[String] = None, updatedAt: scala.Option[String] = None, managerRole: scala.Option[String] = None, scope: scala.Option[String] = None, createdBy: scala.Option[String] = None, lastUpdatedBy: scala.Option[String] = None)

object Option extends ShapeTag.Companion[Option] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.setting.defs", "option")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(key: scala.Option[String], did: scala.Option[String], value: scala.Option[Document], description: scala.Option[String], createdAt: scala.Option[String], updatedAt: scala.Option[String], managerRole: scala.Option[String], scope: scala.Option[String], createdBy: scala.Option[String], lastUpdatedBy: scala.Option[String]): Option = Option(key, did, value, description, createdAt, updatedAt, managerRole, scope, createdBy, lastUpdatedBy)

  implicit val schema: Schema[Option] = struct(
    string.optional[Option]("key", _.key),
    string.optional[Option]("did", _.did),
    document.optional[Option]("value", _.value),
    string.optional[Option]("description", _.description),
    string.optional[Option]("createdAt", _.createdAt),
    string.optional[Option]("updatedAt", _.updatedAt),
    string.optional[Option]("managerRole", _.managerRole),
    string.optional[Option]("scope", _.scope),
    string.optional[Option]("createdBy", _.createdBy),
    string.optional[Option]("lastUpdatedBy", _.lastUpdatedBy),
  )(make).withId(id).addHints(hints)
}
