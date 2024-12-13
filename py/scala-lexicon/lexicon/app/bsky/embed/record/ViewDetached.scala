package lexicon.app.bsky.embed.record

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ViewDetached(uri: Option[String] = None, detached: Option[Boolean] = None)

object ViewDetached extends ShapeTag.Companion[ViewDetached] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.embed.record", "viewDetached")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], detached: Option[Boolean]): ViewDetached = ViewDetached(uri, detached)

  implicit val schema: Schema[ViewDetached] = struct(
    string.optional[ViewDetached]("uri", _.uri),
    boolean.optional[ViewDetached]("detached", _.detached),
  )(make).withId(id).addHints(hints)
}
