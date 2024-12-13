package lexicon.app.bsky.labeler.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class LabelerView(uri: Option[String] = None, cid: Option[String] = None, creator: Option[String] = None, likeCount: Option[Int] = None, viewer: Option[String] = None, indexedAt: Option[String] = None, labels: Option[String] = None)

object LabelerView extends ShapeTag.Companion[LabelerView] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.labeler.defs", "labelerView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], creator: Option[String], likeCount: Option[Int], viewer: Option[String], indexedAt: Option[String], labels: Option[String]): LabelerView = LabelerView(uri, cid, creator, likeCount, viewer, indexedAt, labels)

  implicit val schema: Schema[LabelerView] = struct(
    string.optional[LabelerView]("uri", _.uri),
    string.optional[LabelerView]("cid", _.cid),
    string.optional[LabelerView]("creator", _.creator),
    int.optional[LabelerView]("likeCount", _.likeCount),
    string.optional[LabelerView]("viewer", _.viewer),
    string.optional[LabelerView]("indexedAt", _.indexedAt),
    string.optional[LabelerView]("labels", _.labels),
  )(make).withId(id).addHints(hints)
}
