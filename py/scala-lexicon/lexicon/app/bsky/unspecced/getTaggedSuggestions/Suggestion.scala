package lexicon.app.bsky.unspecced.getTaggedSuggestions

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Suggestion(tag: Option[String] = None, subjectType: Option[String] = None, subject: Option[String] = None)

object Suggestion extends ShapeTag.Companion[Suggestion] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.unspecced.getTaggedSuggestions", "suggestion")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(tag: Option[String], subjectType: Option[String], subject: Option[String]): Suggestion = Suggestion(tag, subjectType, subject)

  implicit val schema: Schema[Suggestion] = struct(
    string.optional[Suggestion]("tag", _.tag),
    string.optional[Suggestion]("subjectType", _.subjectType),
    string.optional[Suggestion]("subject", _.subject),
  )(make).withId(id).addHints(hints)
}
