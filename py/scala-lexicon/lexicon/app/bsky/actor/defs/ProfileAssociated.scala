package lexicon.app.bsky.actor.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class ProfileAssociated(lists: Option[Int] = None, feedgens: Option[Int] = None, starterPacks: Option[Int] = None, labeler: Option[Boolean] = None, chat: Option[String] = None)

object ProfileAssociated extends ShapeTag.Companion[ProfileAssociated] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.actor.defs", "profileAssociated")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(lists: Option[Int], feedgens: Option[Int], starterPacks: Option[Int], labeler: Option[Boolean], chat: Option[String]): ProfileAssociated = ProfileAssociated(lists, feedgens, starterPacks, labeler, chat)

  implicit val schema: Schema[ProfileAssociated] = struct(
    int.optional[ProfileAssociated]("lists", _.lists),
    int.optional[ProfileAssociated]("feedgens", _.feedgens),
    int.optional[ProfileAssociated]("starterPacks", _.starterPacks),
    boolean.optional[ProfileAssociated]("labeler", _.labeler),
    string.optional[ProfileAssociated]("chat", _.chat),
  )(make).withId(id).addHints(hints)
}
