package com_atproto_admin_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ThreatSignature(property: Option[String] = None, value: Option[String] = None)

object ThreatSignature extends ShapeTag.Companion[ThreatSignature] {
  val id: ShapeId = ShapeId("com_atproto_admin_defs", "threatSignature")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(property: Option[String], value: Option[String]): ThreatSignature = ThreatSignature(property, value)

  implicit val schema: Schema[ThreatSignature] = struct(
    string.optional[ThreatSignature]("property", _.property),
    string.optional[ThreatSignature]("value", _.value),
  )(make).withId(id).addHints(hints)
}
