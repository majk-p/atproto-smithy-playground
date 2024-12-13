package lexicon.tools.ozone.moderation.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param updatedAt
  *   Timestamp referencing when the last update was made to the moderation status of the subject
  * @param appealed
  *   True indicates that the a previously taken moderator action was appealed against, by the author of the content. False indicates last appeal was resolved by moderators.
  * @param comment
  *   Sticky comment on the subject.
  * @param createdAt
  *   Timestamp referencing the first moderation status impacting event was emitted on the subject
  * @param lastAppealedAt
  *   Timestamp referencing when the author of the subject appealed a moderation action
  */
final case class SubjectStatusView(id: Option[Int] = None, subject: Option[String] = None, hosting: Option[String] = None, subjectBlobCids: Option[String] = None, subjectRepoHandle: Option[String] = None, updatedAt: Option[String] = None, createdAt: Option[String] = None, reviewState: Option[String] = None, comment: Option[String] = None, muteUntil: Option[String] = None, muteReportingUntil: Option[String] = None, lastReviewedBy: Option[String] = None, lastReviewedAt: Option[String] = None, lastReportedAt: Option[String] = None, lastAppealedAt: Option[String] = None, takendown: Option[Boolean] = None, appealed: Option[Boolean] = None, suspendUntil: Option[String] = None, tags: Option[String] = None)

object SubjectStatusView extends ShapeTag.Companion[SubjectStatusView] {
  val id: ShapeId = ShapeId("lexicon.tools.ozone.moderation.defs", "subjectStatusView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(id: Option[Int], subject: Option[String], hosting: Option[String], subjectBlobCids: Option[String], subjectRepoHandle: Option[String], updatedAt: Option[String], createdAt: Option[String], reviewState: Option[String], comment: Option[String], muteUntil: Option[String], muteReportingUntil: Option[String], lastReviewedBy: Option[String], lastReviewedAt: Option[String], lastReportedAt: Option[String], lastAppealedAt: Option[String], takendown: Option[Boolean], appealed: Option[Boolean], suspendUntil: Option[String], tags: Option[String]): SubjectStatusView = SubjectStatusView(id, subject, hosting, subjectBlobCids, subjectRepoHandle, updatedAt, createdAt, reviewState, comment, muteUntil, muteReportingUntil, lastReviewedBy, lastReviewedAt, lastReportedAt, lastAppealedAt, takendown, appealed, suspendUntil, tags)

  implicit val schema: Schema[SubjectStatusView] = struct(
    int.optional[SubjectStatusView]("id", _.id),
    string.optional[SubjectStatusView]("subject", _.subject),
    string.optional[SubjectStatusView]("hosting", _.hosting),
    string.optional[SubjectStatusView]("subjectBlobCids", _.subjectBlobCids),
    string.optional[SubjectStatusView]("subjectRepoHandle", _.subjectRepoHandle),
    string.optional[SubjectStatusView]("updatedAt", _.updatedAt).addHints(smithy.api.Documentation("Timestamp referencing when the last update was made to the moderation status of the subject")),
    string.optional[SubjectStatusView]("createdAt", _.createdAt).addHints(smithy.api.Documentation("Timestamp referencing the first moderation status impacting event was emitted on the subject")),
    string.optional[SubjectStatusView]("reviewState", _.reviewState),
    string.optional[SubjectStatusView]("comment", _.comment).addHints(smithy.api.Documentation("Sticky comment on the subject.")),
    string.optional[SubjectStatusView]("muteUntil", _.muteUntil),
    string.optional[SubjectStatusView]("muteReportingUntil", _.muteReportingUntil),
    string.optional[SubjectStatusView]("lastReviewedBy", _.lastReviewedBy),
    string.optional[SubjectStatusView]("lastReviewedAt", _.lastReviewedAt),
    string.optional[SubjectStatusView]("lastReportedAt", _.lastReportedAt),
    string.optional[SubjectStatusView]("lastAppealedAt", _.lastAppealedAt).addHints(smithy.api.Documentation("Timestamp referencing when the author of the subject appealed a moderation action")),
    boolean.optional[SubjectStatusView]("takendown", _.takendown),
    boolean.optional[SubjectStatusView]("appealed", _.appealed).addHints(smithy.api.Documentation("True indicates that the a previously taken moderator action was appealed against, by the author of the content. False indicates last appeal was resolved by moderators.")),
    string.optional[SubjectStatusView]("suspendUntil", _.suspendUntil),
    string.optional[SubjectStatusView]("tags", _.tags),
  )(make).withId(id).addHints(hints)
}
