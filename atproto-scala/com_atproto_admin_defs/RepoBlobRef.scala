package com_atproto_admin_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class RepoBlobRef(did: Option[String] = None, cid: Option[String] = None, recordUri: Option[String] = None)

object RepoBlobRef extends ShapeTag.Companion[RepoBlobRef] {
  val id: ShapeId = ShapeId("com_atproto_admin_defs", "repoBlobRef")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String], cid: Option[String], recordUri: Option[String]): RepoBlobRef = RepoBlobRef(did, cid, recordUri)

  implicit val schema: Schema[RepoBlobRef] = struct(
    string.optional[RepoBlobRef]("did", _.did),
    string.optional[RepoBlobRef]("cid", _.cid),
    string.optional[RepoBlobRef]("recordUri", _.recordUri),
  )(make).withId(id).addHints(hints)
}
