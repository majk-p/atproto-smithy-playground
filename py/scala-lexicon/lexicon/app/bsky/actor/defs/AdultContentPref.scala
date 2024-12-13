package lexicon.app.bsky.actor.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class AdultContentPref(enabled: Option[Boolean] = None)

object AdultContentPref extends ShapeTag.Companion[AdultContentPref] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.actor.defs", "adultContentPref")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(enabled: Option[Boolean]): AdultContentPref = AdultContentPref(enabled)

  implicit val schema: Schema[AdultContentPref] = struct(
    boolean.optional[AdultContentPref]("enabled", _.enabled),
  )(make).withId(id).addHints(hints)
}
