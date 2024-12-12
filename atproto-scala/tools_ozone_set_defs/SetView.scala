package tools_ozone_set_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class SetView(name: Option[String] = None, description: Option[String] = None, setSize: Option[Int] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None)

object SetView extends ShapeTag.Companion[SetView] {
  val id: ShapeId = ShapeId("tools_ozone_set_defs", "setView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(name: Option[String], description: Option[String], setSize: Option[Int], createdAt: Option[String], updatedAt: Option[String]): SetView = SetView(name, description, setSize, createdAt, updatedAt)

  implicit val schema: Schema[SetView] = struct(
    string.optional[SetView]("name", _.name),
    string.optional[SetView]("description", _.description),
    int.optional[SetView]("setSize", _.setSize),
    string.optional[SetView]("createdAt", _.createdAt),
    string.optional[SetView]("updatedAt", _.updatedAt),
  )(make).withId(id).addHints(hints)
}
