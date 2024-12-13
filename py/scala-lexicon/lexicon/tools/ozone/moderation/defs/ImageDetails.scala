package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ImageDetails(width: Option[Int] = None, height: Option[Int] = None)

object ImageDetails extends ShapeTag.Companion[ImageDetails] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "imageDetails")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(width: Option[Int], height: Option[Int]): ImageDetails = ImageDetails(width, height)

  implicit val schema: Schema[ImageDetails] = struct(
    int.optional[ImageDetails]("width", _.width),
    int.optional[ImageDetails]("height", _.height),
  )(make).withId(id).addHints(hints)
}
