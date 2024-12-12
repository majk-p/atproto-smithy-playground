package chat_bsky_convo_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class DeletedMessageView(id: Option[String] = None, rev: Option[String] = None, sender: Option[String] = None, sentAt: Option[String] = None)

object DeletedMessageView extends ShapeTag.Companion[DeletedMessageView] {
  val id: ShapeId = ShapeId("chat_bsky_convo_defs", "deletedMessageView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(id: Option[String], rev: Option[String], sender: Option[String], sentAt: Option[String]): DeletedMessageView = DeletedMessageView(id, rev, sender, sentAt)

  implicit val schema: Schema[DeletedMessageView] = struct(
    string.optional[DeletedMessageView]("id", _.id),
    string.optional[DeletedMessageView]("rev", _.rev),
    string.optional[DeletedMessageView]("sender", _.sender),
    string.optional[DeletedMessageView]("sentAt", _.sentAt),
  )(make).withId(id).addHints(hints)
}
