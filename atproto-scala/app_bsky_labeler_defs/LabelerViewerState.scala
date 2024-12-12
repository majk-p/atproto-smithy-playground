package app_bsky_labeler_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class LabelerViewerState(like: Option[String] = None)

object LabelerViewerState extends ShapeTag.Companion[LabelerViewerState] {
  val id: ShapeId = ShapeId("app_bsky_labeler_defs", "labelerViewerState")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(like: Option[String]): LabelerViewerState = LabelerViewerState(like)

  implicit val schema: Schema[LabelerViewerState] = struct(
    string.optional[LabelerViewerState]("like", _.like),
  )(make).withId(id).addHints(hints)
}
