package com_atproto_sync_subscribeRepos

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Migrate(seq: Option[Int] = None, did: Option[String] = None, migrateTo: Option[String] = None, time: Option[String] = None)

object Migrate extends ShapeTag.Companion[Migrate] {
  val id: ShapeId = ShapeId("com_atproto_sync_subscribeRepos", "migrate")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(seq: Option[Int], did: Option[String], migrateTo: Option[String], time: Option[String]): Migrate = Migrate(seq, did, migrateTo, time)

  implicit val schema: Schema[Migrate] = struct(
    int.optional[Migrate]("seq", _.seq),
    string.optional[Migrate]("did", _.did),
    string.optional[Migrate]("migrateTo", _.migrateTo),
    string.optional[Migrate]("time", _.time),
  )(make).withId(id).addHints(hints)
}
