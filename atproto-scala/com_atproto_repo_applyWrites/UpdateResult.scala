package com_atproto_repo_applyWrites

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class UpdateResult(uri: Option[String] = None, cid: Option[String] = None, validationStatus: Option[String] = None)

object UpdateResult extends ShapeTag.Companion[UpdateResult] {
  val id: ShapeId = ShapeId("com_atproto_repo_applyWrites", "updateResult")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], validationStatus: Option[String]): UpdateResult = UpdateResult(uri, cid, validationStatus)

  implicit val schema: Schema[UpdateResult] = struct(
    string.optional[UpdateResult]("uri", _.uri),
    string.optional[UpdateResult]("cid", _.cid),
    string.optional[UpdateResult]("validationStatus", _.validationStatus),
  )(make).withId(id).addHints(hints)
}
