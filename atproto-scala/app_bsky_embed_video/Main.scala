package app_bsky_embed_video

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param alt
  *   Alt text description of the video, for accessibility.
  */
final case class Main(video: Option[String] = None, captions: Option[String] = None, alt: Option[String] = None, aspectRatio: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("app_bsky_embed_video", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(video: Option[String], captions: Option[String], alt: Option[String], aspectRatio: Option[String]): Main = Main(video, captions, alt, aspectRatio)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("video", _.video),
    string.optional[Main]("captions", _.captions),
    string.optional[Main]("alt", _.alt).addHints(smithy.api.Documentation("Alt text description of the video, for accessibility.")),
    string.optional[Main]("aspectRatio", _.aspectRatio),
  )(make).withId(id).addHints(hints)
}
