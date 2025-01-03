package lexicon.app.bsky.embed.recordWithMedia

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class View(record: Option[String] = None, media: Option[String] = None)

object View extends ShapeTag.Companion[View] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.embed.recordWithMedia", "view")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(record: Option[String], media: Option[String]): View = View(record, media)

  implicit val schema: Schema[View] = struct(
    string.optional[View]("record", _.record),
    string.optional[View]("media", _.media),
  )(make).withId(id).addHints(hints)
}
