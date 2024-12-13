package lexicon.app.bsky.labeler.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class LabelerViewDetailed(uri: Option[String] = None, cid: Option[String] = None, creator: Option[String] = None, policies: Option[String] = None, likeCount: Option[Int] = None, viewer: Option[String] = None, indexedAt: Option[String] = None, labels: Option[String] = None)

object LabelerViewDetailed extends ShapeTag.Companion[LabelerViewDetailed] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.labeler.defs", "labelerViewDetailed")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], creator: Option[String], policies: Option[String], likeCount: Option[Int], viewer: Option[String], indexedAt: Option[String], labels: Option[String]): LabelerViewDetailed = LabelerViewDetailed(uri, cid, creator, policies, likeCount, viewer, indexedAt, labels)

  implicit val schema: Schema[LabelerViewDetailed] = struct(
    string.optional[LabelerViewDetailed]("uri", _.uri),
    string.optional[LabelerViewDetailed]("cid", _.cid),
    string.optional[LabelerViewDetailed]("creator", _.creator),
    string.optional[LabelerViewDetailed]("policies", _.policies),
    int.optional[LabelerViewDetailed]("likeCount", _.likeCount),
    string.optional[LabelerViewDetailed]("viewer", _.viewer),
    string.optional[LabelerViewDetailed]("indexedAt", _.indexedAt),
    string.optional[LabelerViewDetailed]("labels", _.labels),
  )(make).withId(id).addHints(hints)
}
