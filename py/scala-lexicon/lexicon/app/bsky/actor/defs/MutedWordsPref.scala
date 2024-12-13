package lexicon.app.bsky.actor.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param items
  *   A list of words the account owner has muted.
  */
final case class MutedWordsPref(items: Option[String] = None)

object MutedWordsPref extends ShapeTag.Companion[MutedWordsPref] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.actor.defs", "mutedWordsPref")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(items: Option[String]): MutedWordsPref = MutedWordsPref(items)

  implicit val schema: Schema[MutedWordsPref] = struct(
    string.optional[MutedWordsPref]("items", _.items).addHints(smithy.api.Documentation("A list of words the account owner has muted.")),
  )(make).withId(id).addHints(hints)
}
