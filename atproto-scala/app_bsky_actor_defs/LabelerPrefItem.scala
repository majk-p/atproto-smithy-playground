package app_bsky_actor_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class LabelerPrefItem(did: Option[String] = None)

object LabelerPrefItem extends ShapeTag.Companion[LabelerPrefItem] {
  val id: ShapeId = ShapeId("app_bsky_actor_defs", "labelerPrefItem")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String]): LabelerPrefItem = LabelerPrefItem(did)

  implicit val schema: Schema[LabelerPrefItem] = struct(
    string.optional[LabelerPrefItem]("did", _.did),
  )(make).withId(id).addHints(hints)
}
