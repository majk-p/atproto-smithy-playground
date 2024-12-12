package com_atproto_sync_subscribeRepos

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param handle
  *   The current handle for the account, or 'handle.invalid' if validation fails. This field is optional, might have been validated or passed-through from an upstream source. Semantics and behaviors for PDS vs Relay may evolve in the future; see atproto specs for more details.
  */
final case class Identity(seq: Option[Int] = None, did: Option[String] = None, time: Option[String] = None, handle: Option[String] = None)

object Identity extends ShapeTag.Companion[Identity] {
  val id: ShapeId = ShapeId("com_atproto_sync_subscribeRepos", "identity")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(seq: Option[Int], did: Option[String], time: Option[String], handle: Option[String]): Identity = Identity(seq, did, time, handle)

  implicit val schema: Schema[Identity] = struct(
    int.optional[Identity]("seq", _.seq),
    string.optional[Identity]("did", _.did),
    string.optional[Identity]("time", _.time),
    string.optional[Identity]("handle", _.handle).addHints(smithy.api.Documentation("The current handle for the account, or \'handle.invalid\' if validation fails. This field is optional, might have been validated or passed-through from an upstream source. Semantics and behaviors for PDS vs Relay may evolve in the future; see atproto specs for more details.")),
  )(make).withId(id).addHints(hints)
}
