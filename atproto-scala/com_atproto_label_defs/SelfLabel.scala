package com_atproto_label_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param val
  *   The short string name of the value or type of this label.
  */
final case class SelfLabel(_val: Option[String] = None)

object SelfLabel extends ShapeTag.Companion[SelfLabel] {
  val id: ShapeId = ShapeId("com_atproto_label_defs", "selfLabel")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(_val: Option[String]): SelfLabel = SelfLabel(_val)

  implicit val schema: Schema[SelfLabel] = struct(
    string.optional[SelfLabel]("val", _._val).addHints(smithy.api.Documentation("The short string name of the value or type of this label.")),
  )(make).withId(id).addHints(hints)
}
