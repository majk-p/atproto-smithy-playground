package lexicon.app.bsky.feed.post

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ReplyRef(root: Option[String] = None, parent: Option[String] = None)

object ReplyRef extends ShapeTag.Companion[ReplyRef] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.post", "replyRef")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(root: Option[String], parent: Option[String]): ReplyRef = ReplyRef(root, parent)

  implicit val schema: Schema[ReplyRef] = struct(
    string.optional[ReplyRef]("root", _.root),
    string.optional[ReplyRef]("parent", _.parent),
  )(make).withId(id).addHints(hints)
}
