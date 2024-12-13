package lexicon.com.atproto.repo.applyWrites

import smithy4s.Document
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.document
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Create(collection: Option[String] = None, rkey: Option[String] = None, value: Option[Document] = None)

object Create extends ShapeTag.Companion[Create] {
  val id: ShapeId = ShapeId("lexicon.com.atproto.repo.applyWrites", "create")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(collection: Option[String], rkey: Option[String], value: Option[Document]): Create = Create(collection, rkey, value)

  implicit val schema: Schema[Create] = struct(
    string.optional[Create]("collection", _.collection),
    string.optional[Create]("rkey", _.rkey),
    document.optional[Create]("value", _.value),
  )(make).withId(id).addHints(hints)
}
