package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ModEventView(id: Option[Int] = None, event: Option[String] = None, subject: Option[String] = None, subjectBlobCids: Option[String] = None, createdBy: Option[String] = None, createdAt: Option[String] = None, creatorHandle: Option[String] = None, subjectHandle: Option[String] = None)

object ModEventView extends ShapeTag.Companion[ModEventView] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "modEventView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(id: Option[Int], event: Option[String], subject: Option[String], subjectBlobCids: Option[String], createdBy: Option[String], createdAt: Option[String], creatorHandle: Option[String], subjectHandle: Option[String]): ModEventView = ModEventView(id, event, subject, subjectBlobCids, createdBy, createdAt, creatorHandle, subjectHandle)

  implicit val schema: Schema[ModEventView] = struct(
    int.optional[ModEventView]("id", _.id),
    string.optional[ModEventView]("event", _.event),
    string.optional[ModEventView]("subject", _.subject),
    string.optional[ModEventView]("subjectBlobCids", _.subjectBlobCids),
    string.optional[ModEventView]("createdBy", _.createdBy),
    string.optional[ModEventView]("createdAt", _.createdAt),
    string.optional[ModEventView]("creatorHandle", _.creatorHandle),
    string.optional[ModEventView]("subjectHandle", _.subjectHandle),
  )(make).withId(id).addHints(hints)
}
