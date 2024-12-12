package com_atproto_repo_listMissingBlobs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class RecordBlob(cid: Option[String] = None, recordUri: Option[String] = None)

object RecordBlob extends ShapeTag.Companion[RecordBlob] {
  val id: ShapeId = ShapeId("com_atproto_repo_listMissingBlobs", "recordBlob")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(cid: Option[String], recordUri: Option[String]): RecordBlob = RecordBlob(cid, recordUri)

  implicit val schema: Schema[RecordBlob] = struct(
    string.optional[RecordBlob]("cid", _.cid),
    string.optional[RecordBlob]("recordUri", _.recordUri),
  )(make).withId(id).addHints(hints)
}
