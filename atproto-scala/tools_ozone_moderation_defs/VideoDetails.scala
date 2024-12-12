package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class VideoDetails(width: Option[Int] = None, height: Option[Int] = None, length: Option[Int] = None)

object VideoDetails extends ShapeTag.Companion[VideoDetails] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "videoDetails")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(width: Option[Int], height: Option[Int], length: Option[Int]): VideoDetails = VideoDetails(width, height, length)

  implicit val schema: Schema[VideoDetails] = struct(
    int.optional[VideoDetails]("width", _.width),
    int.optional[VideoDetails]("height", _.height),
    int.optional[VideoDetails]("length", _.length),
  )(make).withId(id).addHints(hints)
}
