package lexicon.app.bsky.embed.images

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param thumb
  *   Fully-qualified URL where a thumbnail of the image can be fetched. For example, CDN location provided by the App View.
  * @param fullsize
  *   Fully-qualified URL where a large version of the image can be fetched. May or may not be the exact original blob. For example, CDN location provided by the App View.
  * @param alt
  *   Alt text description of the image, for accessibility.
  */
final case class ViewImage(thumb: Option[String] = None, fullsize: Option[String] = None, alt: Option[String] = None, aspectRatio: Option[String] = None)

object ViewImage extends ShapeTag.Companion[ViewImage] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.embed.images", "viewImage")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(thumb: Option[String], fullsize: Option[String], alt: Option[String], aspectRatio: Option[String]): ViewImage = ViewImage(thumb, fullsize, alt, aspectRatio)

  implicit val schema: Schema[ViewImage] = struct(
    string.optional[ViewImage]("thumb", _.thumb).addHints(smithy.api.Documentation("Fully-qualified URL where a thumbnail of the image can be fetched. For example, CDN location provided by the App View.")),
    string.optional[ViewImage]("fullsize", _.fullsize).addHints(smithy.api.Documentation("Fully-qualified URL where a large version of the image can be fetched. May or may not be the exact original blob. For example, CDN location provided by the App View.")),
    string.optional[ViewImage]("alt", _.alt).addHints(smithy.api.Documentation("Alt text description of the image, for accessibility.")),
    string.optional[ViewImage]("aspectRatio", _.aspectRatio),
  )(make).withId(id).addHints(hints)
}
