package lexicon.tools.ozone.set.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Set(name: Option[String] = None, description: Option[String] = None)

object Set extends ShapeTag.Companion[Set] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.set.defs", "set")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(name: Option[String], description: Option[String]): Set = Set(name, description)

  implicit val schema: Schema[Set] = struct(
    string.optional[Set]("name", _.name),
    string.optional[Set]("description", _.description),
  )(make).withId(id).addHints(hints)
}
