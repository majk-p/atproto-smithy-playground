package lexicon.app.bsky.feed.post

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class TextSlice(start: Option[Int] = None, end: Option[Int] = None)

object TextSlice extends ShapeTag.Companion[TextSlice] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.post", "textSlice")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(start: Option[Int], end: Option[Int]): TextSlice = TextSlice(start, end)

  implicit val schema: Schema[TextSlice] = struct(
    int.optional[TextSlice]("start", _.start),
    int.optional[TextSlice]("end", _.end),
  )(make).withId(id).addHints(hints)
}
