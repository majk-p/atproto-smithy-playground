package lexicon.com.atproto.server.describeServer

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Contact(email: Option[String] = None)

object Contact extends ShapeTag.Companion[Contact] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.server.describeServer", "contact")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(email: Option[String]): Contact = Contact(email)

  implicit val schema: Schema[Contact] = struct(
    string.optional[Contact]("email", _.email),
  )(make).withId(id).addHints(hints)
}
