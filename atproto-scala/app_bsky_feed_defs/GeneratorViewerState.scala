package app_bsky_feed_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class GeneratorViewerState(like: Option[String] = None)

object GeneratorViewerState extends ShapeTag.Companion[GeneratorViewerState] {
  val id: ShapeId = ShapeId("app_bsky_feed_defs", "generatorViewerState")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(like: Option[String]): GeneratorViewerState = GeneratorViewerState(like)

  implicit val schema: Schema[GeneratorViewerState] = struct(
    string.optional[GeneratorViewerState]("like", _.like),
  )(make).withId(id).addHints(hints)
}
