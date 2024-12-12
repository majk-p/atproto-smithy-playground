package chat_bsky_moderation_getActorMetadata

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Metadata(messagesSent: Option[Int] = None, messagesReceived: Option[Int] = None, convos: Option[Int] = None, convosStarted: Option[Int] = None)

object Metadata extends ShapeTag.Companion[Metadata] {
  val id: ShapeId = ShapeId("chat_bsky_moderation_getActorMetadata", "metadata")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(messagesSent: Option[Int], messagesReceived: Option[Int], convos: Option[Int], convosStarted: Option[Int]): Metadata = Metadata(messagesSent, messagesReceived, convos, convosStarted)

  implicit val schema: Schema[Metadata] = struct(
    int.optional[Metadata]("messagesSent", _.messagesSent),
    int.optional[Metadata]("messagesReceived", _.messagesReceived),
    int.optional[Metadata]("convos", _.convos),
    int.optional[Metadata]("convosStarted", _.convosStarted),
  )(make).withId(id).addHints(hints)
}
