package lexicon.app.bsky.labeler.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param labelValues
  *   The label values which this labeler publishes. May include global or custom labels.
  * @param labelValueDefinitions
  *   Label values created by this labeler and scoped exclusively to it. Labels defined here will override global label definitions for this labeler.
  */
final case class LabelerPolicies(labelValues: Option[String] = None, labelValueDefinitions: Option[String] = None)

object LabelerPolicies extends ShapeTag.Companion[LabelerPolicies] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.labeler.defs", "labelerPolicies")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(labelValues: Option[String], labelValueDefinitions: Option[String]): LabelerPolicies = LabelerPolicies(labelValues, labelValueDefinitions)

  implicit val schema: Schema[LabelerPolicies] = struct(
    string.optional[LabelerPolicies]("labelValues", _.labelValues).addHints(smithy.api.Documentation("The label values which this labeler publishes. May include global or custom labels.")),
    string.optional[LabelerPolicies]("labelValueDefinitions", _.labelValueDefinitions).addHints(smithy.api.Documentation("Label values created by this labeler and scoped exclusively to it. Labels defined here will override global label definitions for this labeler.")),
  )(make).withId(id).addHints(hints)
}
