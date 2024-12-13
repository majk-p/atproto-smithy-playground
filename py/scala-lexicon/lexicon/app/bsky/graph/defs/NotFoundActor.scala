package lexicon.app.bsky.graph.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class NotFoundActor(actor: Option[String] = None, notFound: Option[Boolean] = None)

object NotFoundActor extends ShapeTag.Companion[NotFoundActor] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.graph.defs", "notFoundActor")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(actor: Option[String], notFound: Option[Boolean]): NotFoundActor = NotFoundActor(actor, notFound)

  implicit val schema: Schema[NotFoundActor] = struct(
    string.optional[NotFoundActor]("actor", _.actor),
    boolean.optional[NotFoundActor]("notFound", _.notFound),
  )(make).withId(id).addHints(hints)
}
