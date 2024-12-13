package lexicon.app.bsky.feed.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ReasonRepost(by: Option[String] = None, indexedAt: Option[String] = None)

object ReasonRepost extends ShapeTag.Companion[ReasonRepost] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.defs", "reasonRepost")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(by: Option[String], indexedAt: Option[String]): ReasonRepost = ReasonRepost(by, indexedAt)

  implicit val schema: Schema[ReasonRepost] = struct(
    string.optional[ReasonRepost]("by", _.by),
    string.optional[ReasonRepost]("indexedAt", _.indexedAt),
  )(make).withId(id).addHints(hints)
}
