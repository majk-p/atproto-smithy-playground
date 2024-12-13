package lexicon.app.bsky.feed.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class GeneratorView(uri: Option[String] = None, cid: Option[String] = None, did: Option[String] = None, creator: Option[String] = None, displayName: Option[String] = None, description: Option[String] = None, descriptionFacets: Option[String] = None, avatar: Option[String] = None, likeCount: Option[Int] = None, acceptsInteractions: Option[Boolean] = None, labels: Option[String] = None, viewer: Option[String] = None, indexedAt: Option[String] = None)

object GeneratorView extends ShapeTag.Companion[GeneratorView] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.feed.defs", "generatorView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], did: Option[String], creator: Option[String], displayName: Option[String], description: Option[String], descriptionFacets: Option[String], avatar: Option[String], likeCount: Option[Int], acceptsInteractions: Option[Boolean], labels: Option[String], viewer: Option[String], indexedAt: Option[String]): GeneratorView = GeneratorView(uri, cid, did, creator, displayName, description, descriptionFacets, avatar, likeCount, acceptsInteractions, labels, viewer, indexedAt)

  implicit val schema: Schema[GeneratorView] = struct(
    string.optional[GeneratorView]("uri", _.uri),
    string.optional[GeneratorView]("cid", _.cid),
    string.optional[GeneratorView]("did", _.did),
    string.optional[GeneratorView]("creator", _.creator),
    string.optional[GeneratorView]("displayName", _.displayName),
    string.optional[GeneratorView]("description", _.description),
    string.optional[GeneratorView]("descriptionFacets", _.descriptionFacets),
    string.optional[GeneratorView]("avatar", _.avatar),
    int.optional[GeneratorView]("likeCount", _.likeCount),
    boolean.optional[GeneratorView]("acceptsInteractions", _.acceptsInteractions),
    string.optional[GeneratorView]("labels", _.labels),
    string.optional[GeneratorView]("viewer", _.viewer),
    string.optional[GeneratorView]("indexedAt", _.indexedAt),
  )(make).withId(id).addHints(hints)
}
