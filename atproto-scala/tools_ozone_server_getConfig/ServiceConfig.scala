package tools_ozone_server_getConfig

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ServiceConfig(url: Option[String] = None)

object ServiceConfig extends ShapeTag.Companion[ServiceConfig] {
  val id: ShapeId = ShapeId("tools_ozone_server_getConfig", "serviceConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(url: Option[String]): ServiceConfig = ServiceConfig(url)

  implicit val schema: Schema[ServiceConfig] = struct(
    string.optional[ServiceConfig]("url", _.url),
  )(make).withId(id).addHints(hints)
}
