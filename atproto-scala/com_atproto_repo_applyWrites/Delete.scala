package com_atproto_repo_applyWrites

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Delete(collection: Option[String] = None, rkey: Option[String] = None)

object Delete extends ShapeTag.Companion[Delete] {
  val id: ShapeId = ShapeId("com_atproto_repo_applyWrites", "delete")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(collection: Option[String], rkey: Option[String]): Delete = Delete(collection, rkey)

  implicit val schema: Schema[Delete] = struct(
    string.optional[Delete]("collection", _.collection),
    string.optional[Delete]("rkey", _.rkey),
  )(make).withId(id).addHints(hints)
}
