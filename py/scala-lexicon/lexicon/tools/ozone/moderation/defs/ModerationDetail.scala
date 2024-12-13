package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ModerationDetail(subjectStatus: Option[String] = None)

object ModerationDetail extends ShapeTag.Companion[ModerationDetail] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "moderationDetail")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(subjectStatus: Option[String]): ModerationDetail = ModerationDetail(subjectStatus)

  implicit val schema: Schema[ModerationDetail] = struct(
    string.optional[ModerationDetail]("subjectStatus", _.subjectStatus),
  )(make).withId(id).addHints(hints)
}
