package lexicon.app.bsky.embed.video

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Caption(lang: Option[String] = None, file: Option[String] = None)

object Caption extends ShapeTag.Companion[Caption] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.embed.video", "caption")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(lang: Option[String], file: Option[String]): Caption = Caption(lang, file)

  implicit val schema: Schema[Caption] = struct(
    string.optional[Caption]("lang", _.lang),
    string.optional[Caption]("file", _.file),
  )(make).withId(id).addHints(hints)
}
