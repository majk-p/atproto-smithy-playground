package app_bsky_graph_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param following
  *   if the actor follows this DID, this is the AT-URI of the follow record
  * @param followedBy
  *   if the actor is followed by this DID, contains the AT-URI of the follow record
  */
final case class Relationship(did: Option[String] = None, following: Option[String] = None, followedBy: Option[String] = None)

object Relationship extends ShapeTag.Companion[Relationship] {
  val id: ShapeId = ShapeId("app_bsky_graph_defs", "relationship")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String], following: Option[String], followedBy: Option[String]): Relationship = Relationship(did, following, followedBy)

  implicit val schema: Schema[Relationship] = struct(
    string.optional[Relationship]("did", _.did),
    string.optional[Relationship]("following", _.following).addHints(smithy.api.Documentation("if the actor follows this DID, this is the AT-URI of the follow record")),
    string.optional[Relationship]("followedBy", _.followedBy).addHints(smithy.api.Documentation("if the actor is followed by this DID, contains the AT-URI of the follow record")),
  )(make).withId(id).addHints(hints)
}
