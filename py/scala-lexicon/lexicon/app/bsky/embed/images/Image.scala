package lexicon.app.bsky.embed.images

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param alt
  *   Alt text description of the image, for accessibility.
  */
final case class Image(image: Option[String] = None, alt: Option[String] = None, aspectRatio: Option[String] = None)

object Image extends ShapeTag.Companion[Image] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.embed.images", "image")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(image: Option[String], alt: Option[String], aspectRatio: Option[String]): Image = Image(image, alt, aspectRatio)

  implicit val schema: Schema[Image] = struct(
    string.optional[Image]("image", _.image),
    string.optional[Image]("alt", _.alt).addHints(smithy.api.Documentation("Alt text description of the image, for accessibility.")),
    string.optional[Image]("aspectRatio", _.aspectRatio),
  )(make).withId(id).addHints(hints)
}
