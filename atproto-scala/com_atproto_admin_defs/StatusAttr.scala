package com_atproto_admin_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class StatusAttr(applied: Option[Boolean] = None, ref: Option[String] = None)

object StatusAttr extends ShapeTag.Companion[StatusAttr] {
  val id: ShapeId = ShapeId("com_atproto_admin_defs", "statusAttr")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(applied: Option[Boolean], ref: Option[String]): StatusAttr = StatusAttr(applied, ref)

  implicit val schema: Schema[StatusAttr] = struct(
    boolean.optional[StatusAttr]("applied", _.applied),
    string.optional[StatusAttr]("ref", _.ref),
  )(make).withId(id).addHints(hints)
}
