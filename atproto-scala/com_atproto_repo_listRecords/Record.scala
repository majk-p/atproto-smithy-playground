package com_atproto_repo_listRecords

import smithy4s.Document
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.document
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Record(uri: Option[String] = None, cid: Option[String] = None, value: Option[Document] = None)

object Record extends ShapeTag.Companion[Record] {
  val id: ShapeId = ShapeId("com_atproto_repo_listRecords", "record")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], value: Option[Document]): Record = Record(uri, cid, value)

  implicit val schema: Schema[Record] = struct(
    string.optional[Record]("uri", _.uri),
    string.optional[Record]("cid", _.cid),
    document.optional[Record]("value", _.value),
  )(make).withId(id).addHints(hints)
}
