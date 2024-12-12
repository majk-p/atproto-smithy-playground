package com_atproto_label_subscribeLabels

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Labels(seq: Option[Int] = None, labels: Option[String] = None)

object Labels extends ShapeTag.Companion[Labels] {
  val id: ShapeId = ShapeId("com_atproto_label_subscribeLabels", "labels")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(seq: Option[Int], labels: Option[String]): Labels = Labels(seq, labels)

  implicit val schema: Schema[Labels] = struct(
    int.optional[Labels]("seq", _.seq),
    string.optional[Labels]("labels", _.labels),
  )(make).withId(id).addHints(hints)
}
