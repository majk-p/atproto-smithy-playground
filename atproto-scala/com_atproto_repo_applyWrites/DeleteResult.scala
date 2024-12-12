package com_atproto_repo_applyWrites

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

/** Generated from ATP Lexicon */
final case class DeleteResult()

object DeleteResult extends ShapeTag.Companion[DeleteResult] {
  val id: ShapeId = ShapeId("com_atproto_repo_applyWrites", "deleteResult")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily


  implicit val schema: Schema[DeleteResult] = constant(DeleteResult()).withId(id).addHints(hints)
}
