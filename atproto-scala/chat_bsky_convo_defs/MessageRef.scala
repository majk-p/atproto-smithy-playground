package chat_bsky_convo_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class MessageRef(did: Option[String] = None, convoId: Option[String] = None, messageId: Option[String] = None)

object MessageRef extends ShapeTag.Companion[MessageRef] {
  val id: ShapeId = ShapeId("chat_bsky_convo_defs", "messageRef")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String], convoId: Option[String], messageId: Option[String]): MessageRef = MessageRef(did, convoId, messageId)

  implicit val schema: Schema[MessageRef] = struct(
    string.optional[MessageRef]("did", _.did),
    string.optional[MessageRef]("convoId", _.convoId),
    string.optional[MessageRef]("messageId", _.messageId),
  )(make).withId(id).addHints(hints)
}
