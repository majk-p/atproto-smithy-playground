package lexicon.com.atproto.sync.subscribeRepos

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param active
  *   Indicates that the account has a repository which can be fetched from the host that emitted this event.
  * @param status
  *   If active=false, this optional field indicates a reason for why the account is not active.
  */
final case class Account(seq: Option[Int] = None, did: Option[String] = None, time: Option[String] = None, active: Option[Boolean] = None, status: Option[String] = None)

object Account extends ShapeTag.Companion[Account] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.sync.subscribeRepos", "account")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(seq: Option[Int], did: Option[String], time: Option[String], active: Option[Boolean], status: Option[String]): Account = Account(seq, did, time, active, status)

  implicit val schema: Schema[Account] = struct(
    int.optional[Account]("seq", _.seq),
    string.optional[Account]("did", _.did),
    string.optional[Account]("time", _.time),
    boolean.optional[Account]("active", _.active).addHints(smithy.api.Documentation("Indicates that the account has a repository which can be fetched from the host that emitted this event.")),
    string.optional[Account]("status", _.status).addHints(smithy.api.Documentation("If active=false, this optional field indicates a reason for why the account is not active.")),
  )(make).withId(id).addHints(hints)
}
