package lexicon.app.bsky.graph.listblock

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param subject
  *   Reference (AT-URI) to the mod list record.
  */
final case class Main(subject: Option[String] = None, createdAt: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.graph.listblock", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(subject: Option[String], createdAt: Option[String]): Main = Main(subject, createdAt)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("subject", _.subject).addHints(smithy.api.Documentation("Reference (AT-URI) to the mod list record.")),
    string.optional[Main]("createdAt", _.createdAt),
  )(make).withId(id).addHints(hints)
}
