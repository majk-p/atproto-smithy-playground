package lexicon.app.bsky.richtext.facet

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Link(uri: Option[String] = None)

object Link extends ShapeTag.Companion[Link] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.richtext.facet", "link")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String]): Link = Link(uri)

  implicit val schema: Schema[Link] = struct(
    string.optional[Link]("uri", _.uri),
  )(make).withId(id).addHints(hints)
}
