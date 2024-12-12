package com_atproto_repo_applyWrites

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class CreateResult(uri: Option[String] = None, cid: Option[String] = None, validationStatus: Option[String] = None)

object CreateResult extends ShapeTag.Companion[CreateResult] {
  val id: ShapeId = ShapeId("com_atproto_repo_applyWrites", "createResult")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], validationStatus: Option[String]): CreateResult = CreateResult(uri, cid, validationStatus)

  implicit val schema: Schema[CreateResult] = struct(
    string.optional[CreateResult]("uri", _.uri),
    string.optional[CreateResult]("cid", _.cid),
    string.optional[CreateResult]("validationStatus", _.validationStatus),
  )(make).withId(id).addHints(hints)
}
