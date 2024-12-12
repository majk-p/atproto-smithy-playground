package app_bsky_actor_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param value
  *   The muted word itself.
  * @param targets
  *   The intended targets of the muted word.
  * @param actorTarget
  *   Groups of users to apply the muted word to. If undefined, applies to all users.
  * @param expiresAt
  *   The date and time at which the muted word will expire and no longer be applied.
  */
final case class MutedWord(id: Option[String] = None, value: Option[String] = None, targets: Option[String] = None, actorTarget: Option[String] = None, expiresAt: Option[String] = None)

object MutedWord extends ShapeTag.Companion[MutedWord] {
  val id: ShapeId = ShapeId("app_bsky_actor_defs", "mutedWord")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(id: Option[String], value: Option[String], targets: Option[String], actorTarget: Option[String], expiresAt: Option[String]): MutedWord = MutedWord(id, value, targets, actorTarget, expiresAt)

  implicit val schema: Schema[MutedWord] = struct(
    string.optional[MutedWord]("id", _.id),
    string.optional[MutedWord]("value", _.value).addHints(smithy.api.Documentation("The muted word itself.")),
    string.optional[MutedWord]("targets", _.targets).addHints(smithy.api.Documentation("The intended targets of the muted word.")),
    string.optional[MutedWord]("actorTarget", _.actorTarget).addHints(smithy.api.Documentation("Groups of users to apply the muted word to. If undefined, applies to all users.")),
    string.optional[MutedWord]("expiresAt", _.expiresAt).addHints(smithy.api.Documentation("The date and time at which the muted word will expire and no longer be applied.")),
  )(make).withId(id).addHints(hints)
}
