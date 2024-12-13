package lexicon.app.bsky.actor.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class LabelersPref(labelers: Option[String] = None)

object LabelersPref extends ShapeTag.Companion[LabelersPref] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.actor.defs", "labelersPref")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(labelers: Option[String]): LabelersPref = LabelersPref(labelers)

  implicit val schema: Schema[LabelersPref] = struct(
    string.optional[LabelersPref]("labelers", _.labelers),
  )(make).withId(id).addHints(hints)
}
