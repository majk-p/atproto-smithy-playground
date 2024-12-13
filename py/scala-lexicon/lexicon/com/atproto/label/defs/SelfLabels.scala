package lexicon.com.atproto.label.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class SelfLabels(values: Option[String] = None)

object SelfLabels extends ShapeTag.Companion[SelfLabels] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.label.defs", "selfLabels")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(values: Option[String]): SelfLabels = SelfLabels(values)

  implicit val schema: Schema[SelfLabels] = struct(
    string.optional[SelfLabels]("values", _.values),
  )(make).withId(id).addHints(hints)
}
