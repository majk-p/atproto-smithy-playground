package app_bsky_labeler_service

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Main(policies: Option[String] = None, labels: Option[String] = None, createdAt: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("app_bsky_labeler_service", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(policies: Option[String], labels: Option[String], createdAt: Option[String]): Main = Main(policies, labels, createdAt)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("policies", _.policies),
    string.optional[Main]("labels", _.labels),
    string.optional[Main]("createdAt", _.createdAt),
  )(make).withId(id).addHints(hints)
}
