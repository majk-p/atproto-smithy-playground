package lexicon.chat.bsky.convo.sendMessageBatch

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class BatchItem(convoId: Option[String] = None, message: Option[String] = None)

object BatchItem extends ShapeTag.Companion[BatchItem] {
  val id: ShapeId = ShapeId("lexicon.chat.bsky.convo.sendMessageBatch", "batchItem")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(convoId: Option[String], message: Option[String]): BatchItem = BatchItem(convoId, message)

  implicit val schema: Schema[BatchItem] = struct(
    string.optional[BatchItem]("convoId", _.convoId),
    string.optional[BatchItem]("message", _.message),
  )(make).withId(id).addHints(hints)
}
