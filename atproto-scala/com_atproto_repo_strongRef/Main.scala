package com_atproto_repo_strongRef

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Main(uri: Option[String] = None, cid: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("com_atproto_repo_strongRef", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String]): Main = Main(uri, cid)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("uri", _.uri),
    string.optional[Main]("cid", _.cid),
  )(make).withId(id).addHints(hints)
}
