package lexicon.app.bsky.feed.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param grandparentAuthor
  *   When parent is a reply to another post, this is the author of that post.
  */
final case class ReplyRef(root: Option[String] = None, parent: Option[String] = None, grandparentAuthor: Option[String] = None)

object ReplyRef extends ShapeTag.Companion[ReplyRef] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.defs", "replyRef")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(root: Option[String], parent: Option[String], grandparentAuthor: Option[String]): ReplyRef = ReplyRef(root, parent, grandparentAuthor)

  implicit val schema: Schema[ReplyRef] = struct(
    string.optional[ReplyRef]("root", _.root),
    string.optional[ReplyRef]("parent", _.parent),
    string.optional[ReplyRef]("grandparentAuthor", _.grandparentAuthor).addHints(smithy.api.Documentation("When parent is a reply to another post, this is the author of that post.")),
  )(make).withId(id).addHints(hints)
}
