package app_bsky_actor_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param items
  *   A list of URIs of posts the account owner has hidden.
  */
final case class HiddenPostsPref(items: Option[String] = None)

object HiddenPostsPref extends ShapeTag.Companion[HiddenPostsPref] {
  val id: ShapeId = ShapeId("app_bsky_actor_defs", "hiddenPostsPref")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(items: Option[String]): HiddenPostsPref = HiddenPostsPref(items)

  implicit val schema: Schema[HiddenPostsPref] = struct(
    string.optional[HiddenPostsPref]("items", _.items).addHints(smithy.api.Documentation("A list of URIs of posts the account owner has hidden.")),
  )(make).withId(id).addHints(hints)
}
