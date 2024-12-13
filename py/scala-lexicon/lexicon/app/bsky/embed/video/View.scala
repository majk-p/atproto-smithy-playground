package lexicon.app.bsky.embed.video

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class View(cid: Option[String] = None, playlist: Option[String] = None, thumbnail: Option[String] = None, alt: Option[String] = None, aspectRatio: Option[String] = None)

object View extends ShapeTag.Companion[View] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.embed.video", "view")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(cid: Option[String], playlist: Option[String], thumbnail: Option[String], alt: Option[String], aspectRatio: Option[String]): View = View(cid, playlist, thumbnail, alt, aspectRatio)

  implicit val schema: Schema[View] = struct(
    string.optional[View]("cid", _.cid),
    string.optional[View]("playlist", _.playlist),
    string.optional[View]("thumbnail", _.thumbnail),
    string.optional[View]("alt", _.alt),
    string.optional[View]("aspectRatio", _.aspectRatio),
  )(make).withId(id).addHints(hints)
}
