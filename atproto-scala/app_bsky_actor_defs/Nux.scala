package app_bsky_actor_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param data
  *   Arbitrary data for the NUX. The structure is defined by the NUX itself. Limited to 300 characters.
  * @param expiresAt
  *   The date and time at which the NUX will expire and should be considered completed.
  */
final case class Nux(id: Option[String] = None, completed: Option[Boolean] = None, data: Option[String] = None, expiresAt: Option[String] = None)

object Nux extends ShapeTag.Companion[Nux] {
  val id: ShapeId = ShapeId("app_bsky_actor_defs", "nux")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(id: Option[String], completed: Option[Boolean], data: Option[String], expiresAt: Option[String]): Nux = Nux(id, completed, data, expiresAt)

  implicit val schema: Schema[Nux] = struct(
    string.optional[Nux]("id", _.id),
    boolean.optional[Nux]("completed", _.completed),
    string.optional[Nux]("data", _.data).addHints(smithy.api.Documentation("Arbitrary data for the NUX. The structure is defined by the NUX itself. Limited to 300 characters.")),
    string.optional[Nux]("expiresAt", _.expiresAt).addHints(smithy.api.Documentation("The date and time at which the NUX will expire and should be considered completed.")),
  )(make).withId(id).addHints(hints)
}
