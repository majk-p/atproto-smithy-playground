package app_bsky_richtext_facet

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ByteSlice(byteStart: Option[Int] = None, byteEnd: Option[Int] = None)

object ByteSlice extends ShapeTag.Companion[ByteSlice] {
  val id: ShapeId = ShapeId("app_bsky_richtext_facet", "byteSlice")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(byteStart: Option[Int], byteEnd: Option[Int]): ByteSlice = ByteSlice(byteStart, byteEnd)

  implicit val schema: Schema[ByteSlice] = struct(
    int.optional[ByteSlice]("byteStart", _.byteStart),
    int.optional[ByteSlice]("byteEnd", _.byteEnd),
  )(make).withId(id).addHints(hints)
}
