package chat_bsky_convo_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class MessageViewSender(did: Option[String] = None)

object MessageViewSender extends ShapeTag.Companion[MessageViewSender] {
  val id: ShapeId = ShapeId("chat_bsky_convo_defs", "messageViewSender")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String]): MessageViewSender = MessageViewSender(did)

  implicit val schema: Schema[MessageViewSender] = struct(
    string.optional[MessageViewSender]("did", _.did),
  )(make).withId(id).addHints(hints)
}
