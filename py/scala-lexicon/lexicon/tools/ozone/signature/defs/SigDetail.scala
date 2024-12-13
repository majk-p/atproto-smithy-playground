package lexicon.tools.ozone.signature.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class SigDetail(property: Option[String] = None, value: Option[String] = None)

object SigDetail extends ShapeTag.Companion[SigDetail] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.signature.defs", "sigDetail")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(property: Option[String], value: Option[String]): SigDetail = SigDetail(property, value)

  implicit val schema: Schema[SigDetail] = struct(
    string.optional[SigDetail]("property", _.property),
    string.optional[SigDetail]("value", _.value),
  )(make).withId(id).addHints(hints)
}
