package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ModEventViewDetail(id: Option[Int] = None, event: Option[String] = None, subject: Option[String] = None, subjectBlobs: Option[String] = None, createdBy: Option[String] = None, createdAt: Option[String] = None)

object ModEventViewDetail extends ShapeTag.Companion[ModEventViewDetail] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "modEventViewDetail")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(id: Option[Int], event: Option[String], subject: Option[String], subjectBlobs: Option[String], createdBy: Option[String], createdAt: Option[String]): ModEventViewDetail = ModEventViewDetail(id, event, subject, subjectBlobs, createdBy, createdAt)

  implicit val schema: Schema[ModEventViewDetail] = struct(
    int.optional[ModEventViewDetail]("id", _.id),
    string.optional[ModEventViewDetail]("event", _.event),
    string.optional[ModEventViewDetail]("subject", _.subject),
    string.optional[ModEventViewDetail]("subjectBlobs", _.subjectBlobs),
    string.optional[ModEventViewDetail]("createdBy", _.createdBy),
    string.optional[ModEventViewDetail]("createdAt", _.createdAt),
  )(make).withId(id).addHints(hints)
}
