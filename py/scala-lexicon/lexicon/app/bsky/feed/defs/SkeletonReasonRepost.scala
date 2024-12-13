package lexicon.app.bsky.feed.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class SkeletonReasonRepost(repost: Option[String] = None)

object SkeletonReasonRepost extends ShapeTag.Companion[SkeletonReasonRepost] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.defs", "skeletonReasonRepost")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(repost: Option[String]): SkeletonReasonRepost = SkeletonReasonRepost(repost)

  implicit val schema: Schema[SkeletonReasonRepost] = struct(
    string.optional[SkeletonReasonRepost]("repost", _.repost),
  )(make).withId(id).addHints(hints)
}
