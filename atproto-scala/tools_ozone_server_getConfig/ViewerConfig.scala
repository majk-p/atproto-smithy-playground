package tools_ozone_server_getConfig

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ViewerConfig(role: Option[String] = None)

object ViewerConfig extends ShapeTag.Companion[ViewerConfig] {
  val id: ShapeId = ShapeId("tools_ozone_server_getConfig", "viewerConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(role: Option[String]): ViewerConfig = ViewerConfig(role)

  implicit val schema: Schema[ViewerConfig] = struct(
    string.optional[ViewerConfig]("role", _.role),
  )(make).withId(id).addHints(hints)
}
