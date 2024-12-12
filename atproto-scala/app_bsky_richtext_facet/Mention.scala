package app_bsky_richtext_facet

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Mention(did: Option[String] = None)

object Mention extends ShapeTag.Companion[Mention] {
  val id: ShapeId = ShapeId("app_bsky_richtext_facet", "mention")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String]): Mention = Mention(did)

  implicit val schema: Schema[Mention] = struct(
    string.optional[Mention]("did", _.did),
  )(make).withId(id).addHints(hints)
}
