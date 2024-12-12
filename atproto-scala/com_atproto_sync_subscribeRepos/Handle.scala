package com_atproto_sync_subscribeRepos

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Handle(seq: Option[Int] = None, did: Option[String] = None, handle: Option[String] = None, time: Option[String] = None)

object Handle extends ShapeTag.Companion[Handle] {
  val id: ShapeId = ShapeId("com_atproto_sync_subscribeRepos", "handle")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(seq: Option[Int], did: Option[String], handle: Option[String], time: Option[String]): Handle = Handle(seq, did, handle, time)

  implicit val schema: Schema[Handle] = struct(
    int.optional[Handle]("seq", _.seq),
    string.optional[Handle]("did", _.did),
    string.optional[Handle]("handle", _.handle),
    string.optional[Handle]("time", _.time),
  )(make).withId(id).addHints(hints)
}
