package chat_bsky_actor_declaration

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Main(allowIncoming: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("chat_bsky_actor_declaration", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(allowIncoming: Option[String]): Main = Main(allowIncoming)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("allowIncoming", _.allowIncoming),
  )(make).withId(id).addHints(hints)
}
