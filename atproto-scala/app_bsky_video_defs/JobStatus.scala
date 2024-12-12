package app_bsky_video_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param state
  *   The state of the video processing job. All values not listed as a known value indicate that the job is in process.
  * @param progress
  *   Progress within the current processing state.
  */
final case class JobStatus(jobId: Option[String] = None, did: Option[String] = None, state: Option[String] = None, progress: Option[Int] = None, blob: Option[String] = None, error: Option[String] = None, message: Option[String] = None)

object JobStatus extends ShapeTag.Companion[JobStatus] {
  val id: ShapeId = ShapeId("app_bsky_video_defs", "jobStatus")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[String], did: Option[String], state: Option[String], progress: Option[Int], blob: Option[String], error: Option[String], message: Option[String]): JobStatus = JobStatus(jobId, did, state, progress, blob, error, message)

  implicit val schema: Schema[JobStatus] = struct(
    string.optional[JobStatus]("jobId", _.jobId),
    string.optional[JobStatus]("did", _.did),
    string.optional[JobStatus]("state", _.state).addHints(smithy.api.Documentation("The state of the video processing job. All values not listed as a known value indicate that the job is in process.")),
    int.optional[JobStatus]("progress", _.progress).addHints(smithy.api.Documentation("Progress within the current processing state.")),
    string.optional[JobStatus]("blob", _.blob),
    string.optional[JobStatus]("error", _.error),
    string.optional[JobStatus]("message", _.message),
  )(make).withId(id).addHints(hints)
}
