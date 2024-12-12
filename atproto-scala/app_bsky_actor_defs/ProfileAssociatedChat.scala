package app_bsky_actor_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ProfileAssociatedChat(allowIncoming: Option[String] = None)

object ProfileAssociatedChat extends ShapeTag.Companion[ProfileAssociatedChat] {
  val id: ShapeId = ShapeId("app_bsky_actor_defs", "profileAssociatedChat")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(allowIncoming: Option[String]): ProfileAssociatedChat = ProfileAssociatedChat(allowIncoming)

  implicit val schema: Schema[ProfileAssociatedChat] = struct(
    string.optional[ProfileAssociatedChat]("allowIncoming", _.allowIncoming),
  )(make).withId(id).addHints(hints)
}
