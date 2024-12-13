package lexicon.com.atproto.sync.subscribeRepos

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Tombstone(seq: Option[Int] = None, did: Option[String] = None, time: Option[String] = None)

object Tombstone extends ShapeTag.Companion[Tombstone] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.sync.subscribeRepos", "tombstone")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(seq: Option[Int], did: Option[String], time: Option[String]): Tombstone = Tombstone(seq, did, time)

  implicit val schema: Schema[Tombstone] = struct(
    int.optional[Tombstone]("seq", _.seq),
    string.optional[Tombstone]("did", _.did),
    string.optional[Tombstone]("time", _.time),
  )(make).withId(id).addHints(hints)
}
