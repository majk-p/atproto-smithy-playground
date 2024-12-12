package com_atproto_label_subscribeLabels

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Info(name: Option[String] = None, message: Option[String] = None)

object Info extends ShapeTag.Companion[Info] {
  val id: ShapeId = ShapeId("com_atproto_label_subscribeLabels", "info")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(name: Option[String], message: Option[String]): Info = Info(name, message)

  implicit val schema: Schema[Info] = struct(
    string.optional[Info]("name", _.name),
    string.optional[Info]("message", _.message),
  )(make).withId(id).addHints(hints)
}
