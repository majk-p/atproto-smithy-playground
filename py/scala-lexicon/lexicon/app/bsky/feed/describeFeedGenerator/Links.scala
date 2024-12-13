package lexicon.app.bsky.feed.describeFeedGenerator

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class Links(privacyPolicy: Option[String] = None, termsOfService: Option[String] = None)

object Links extends ShapeTag.Companion[Links] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.describeFeedGenerator", "links")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(privacyPolicy: Option[String], termsOfService: Option[String]): Links = Links(privacyPolicy, termsOfService)

  implicit val schema: Schema[Links] = struct(
    string.optional[Links]("privacyPolicy", _.privacyPolicy),
    string.optional[Links]("termsOfService", _.termsOfService),
  )(make).withId(id).addHints(hints)
}
