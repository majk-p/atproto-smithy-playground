package lexicon.com.atproto.sync.subscribeRepos

import smithy4s.Blob
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.bytes
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param commit
  *   Repo commit object CID.
  * @param blocks
  *   CAR file containing relevant blocks, as a diff since the previous repo state.
  * @param prev
  *   DEPRECATED -- unused. WARNING -- nullable and optional; stick with optional to ensure golang interoperability.
  * @param rev
  *   The rev of the emitted commit. Note that this information is also in the commit object included in blocks, unless this is a tooBig event.
  * @param rebase
  *   DEPRECATED -- unused
  * @param seq
  *   The stream sequence number of this message.
  * @param time
  *   Timestamp of when this message was originally broadcast.
  * @param repo
  *   The repo this event comes from.
  * @param since
  *   The rev of the last emitted commit from this repo (if any).
  * @param tooBig
  *   Indicates that this commit contained too many ops, or data size was too large. Consumers will need to make a separate request to get missing data.
  */
final case class Commit(seq: Option[Int] = None, rebase: Option[Boolean] = None, tooBig: Option[Boolean] = None, repo: Option[String] = None, commit: Option[String] = None, prev: Option[String] = None, rev: Option[String] = None, since: Option[String] = None, blocks: Option[Blob] = None, ops: Option[String] = None, blobs: Option[String] = None, time: Option[String] = None)

object Commit extends ShapeTag.Companion[Commit] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.sync.subscribeRepos", "commit")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(seq: Option[Int], rebase: Option[Boolean], tooBig: Option[Boolean], repo: Option[String], commit: Option[String], prev: Option[String], rev: Option[String], since: Option[String], blocks: Option[Blob], ops: Option[String], blobs: Option[String], time: Option[String]): Commit = Commit(seq, rebase, tooBig, repo, commit, prev, rev, since, blocks, ops, blobs, time)

  implicit val schema: Schema[Commit] = struct(
    int.optional[Commit]("seq", _.seq).addHints(smithy.api.Documentation("The stream sequence number of this message.")),
    boolean.optional[Commit]("rebase", _.rebase).addHints(smithy.api.Documentation("DEPRECATED -- unused")),
    boolean.optional[Commit]("tooBig", _.tooBig).addHints(smithy.api.Documentation("Indicates that this commit contained too many ops, or data size was too large. Consumers will need to make a separate request to get missing data.")),
    string.optional[Commit]("repo", _.repo).addHints(smithy.api.Documentation("The repo this event comes from.")),
    string.optional[Commit]("commit", _.commit).addHints(smithy.api.Documentation("Repo commit object CID.")),
    string.optional[Commit]("prev", _.prev).addHints(smithy.api.Documentation("DEPRECATED -- unused. WARNING -- nullable and optional; stick with optional to ensure golang interoperability.")),
    string.optional[Commit]("rev", _.rev).addHints(smithy.api.Documentation("The rev of the emitted commit. Note that this information is also in the commit object included in blocks, unless this is a tooBig event.")),
    string.optional[Commit]("since", _.since).addHints(smithy.api.Documentation("The rev of the last emitted commit from this repo (if any).")),
    bytes.optional[Commit]("blocks", _.blocks).addHints(smithy.api.Documentation("CAR file containing relevant blocks, as a diff since the previous repo state.")),
    string.optional[Commit]("ops", _.ops),
    string.optional[Commit]("blobs", _.blobs),
    string.optional[Commit]("time", _.time).addHints(smithy.api.Documentation("Timestamp of when this message was originally broadcast.")),
  )(make).withId(id).addHints(hints)
}
