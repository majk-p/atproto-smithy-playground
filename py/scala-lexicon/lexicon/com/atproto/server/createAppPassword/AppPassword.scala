package lexicon.com.atproto.server.createAppPassword

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class AppPassword(name: Option[String] = None, password: Option[String] = None, createdAt: Option[String] = None, privileged: Option[Boolean] = None)

object AppPassword extends ShapeTag.Companion[AppPassword] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.server.createAppPassword", "appPassword")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(name: Option[String], password: Option[String], createdAt: Option[String], privileged: Option[Boolean]): AppPassword = AppPassword(name, password, createdAt, privileged)

  implicit val schema: Schema[AppPassword] = struct(
    string.optional[AppPassword]("name", _.name),
    string.optional[AppPassword]("password", _.password),
    string.optional[AppPassword]("createdAt", _.createdAt),
    boolean.optional[AppPassword]("privileged", _.privileged),
  )(make).withId(id).addHints(hints)
}
