package app_bsky_actor_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param queuedNudges
  *   An array of tokens which identify nudges (modals, popups, tours, highlight dots) that should be shown to the user.
  * @param nuxs
  *   Storage for NUXs the user has encountered.
  */
final case class BskyAppStatePref(activeProgressGuide: Option[String] = None, queuedNudges: Option[String] = None, nuxs: Option[String] = None)

object BskyAppStatePref extends ShapeTag.Companion[BskyAppStatePref] {
  val id: ShapeId = ShapeId("app_bsky_actor_defs", "bskyAppStatePref")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(activeProgressGuide: Option[String], queuedNudges: Option[String], nuxs: Option[String]): BskyAppStatePref = BskyAppStatePref(activeProgressGuide, queuedNudges, nuxs)

  implicit val schema: Schema[BskyAppStatePref] = struct(
    string.optional[BskyAppStatePref]("activeProgressGuide", _.activeProgressGuide),
    string.optional[BskyAppStatePref]("queuedNudges", _.queuedNudges).addHints(smithy.api.Documentation("An array of tokens which identify nudges (modals, popups, tours, highlight dots) that should be shown to the user.")),
    string.optional[BskyAppStatePref]("nuxs", _.nuxs).addHints(smithy.api.Documentation("Storage for NUXs the user has encountered.")),
  )(make).withId(id).addHints(hints)
}
