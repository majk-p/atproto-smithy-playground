package lexicon.app.bsky.embed.external

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ViewExternal(uri: Option[String] = None, title: Option[String] = None, description: Option[String] = None, thumb: Option[String] = None)

object ViewExternal extends ShapeTag.Companion[ViewExternal] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.embed.external", "viewExternal")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], title: Option[String], description: Option[String], thumb: Option[String]): ViewExternal = ViewExternal(uri, title, description, thumb)

  implicit val schema: Schema[ViewExternal] = struct(
    string.optional[ViewExternal]("uri", _.uri),
    string.optional[ViewExternal]("title", _.title),
    string.optional[ViewExternal]("description", _.description),
    string.optional[ViewExternal]("thumb", _.thumb),
  )(make).withId(id).addHints(hints)
}
