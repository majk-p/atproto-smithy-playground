package com_atproto_repo_applyWrites

import smithy4s.Document
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.document
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Update(collection: Option[String] = None, rkey: Option[String] = None, value: Option[Document] = None)

object Update extends ShapeTag.Companion[Update] {
  val id: ShapeId = ShapeId("com_atproto_repo_applyWrites", "update")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(collection: Option[String], rkey: Option[String], value: Option[Document]): Update = Update(collection, rkey, value)

  implicit val schema: Schema[Update] = struct(
    string.optional[Update]("collection", _.collection),
    string.optional[Update]("rkey", _.rkey),
    document.optional[Update]("value", _.value),
  )(make).withId(id).addHints(hints)
}
