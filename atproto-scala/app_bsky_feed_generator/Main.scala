package app_bsky_feed_generator

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param acceptsInteractions
  *   Declaration that a feed accepts feedback interactions from a client through app.bsky.feed.sendInteractions
  * @param labels
  *   Self-label values
  */
final case class Main(did: Option[String] = None, displayName: Option[String] = None, description: Option[String] = None, descriptionFacets: Option[String] = None, avatar: Option[String] = None, acceptsInteractions: Option[Boolean] = None, labels: Option[String] = None, createdAt: Option[String] = None)

object Main extends ShapeTag.Companion[Main] {
  val id: ShapeId = ShapeId("app_bsky_feed_generator", "main")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(did: Option[String], displayName: Option[String], description: Option[String], descriptionFacets: Option[String], avatar: Option[String], acceptsInteractions: Option[Boolean], labels: Option[String], createdAt: Option[String]): Main = Main(did, displayName, description, descriptionFacets, avatar, acceptsInteractions, labels, createdAt)

  implicit val schema: Schema[Main] = struct(
    string.optional[Main]("did", _.did),
    string.optional[Main]("displayName", _.displayName),
    string.optional[Main]("description", _.description),
    string.optional[Main]("descriptionFacets", _.descriptionFacets),
    string.optional[Main]("avatar", _.avatar),
    boolean.optional[Main]("acceptsInteractions", _.acceptsInteractions).addHints(smithy.api.Documentation("Declaration that a feed accepts feedback interactions from a client through app.bsky.feed.sendInteractions")),
    string.optional[Main]("labels", _.labels).addHints(smithy.api.Documentation("Self-label values")),
    string.optional[Main]("createdAt", _.createdAt),
  )(make).withId(id).addHints(hints)
}
