package app_bsky_feed_threadgate

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ListRule(list: Option[String] = None)

object ListRule extends ShapeTag.Companion[ListRule] {
  val id: ShapeId = ShapeId("app_bsky_feed_threadgate", "listRule")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(list: Option[String]): ListRule = ListRule(list)

  implicit val schema: Schema[ListRule] = struct(
    string.optional[ListRule]("list", _.list),
  )(make).withId(id).addHints(hints)
}
