package tools_ozone_moderation_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class BlobView(cid: Option[String] = None, mimeType: Option[String] = None, size: Option[Int] = None, createdAt: Option[String] = None, details: Option[String] = None, moderation: Option[String] = None)

object BlobView extends ShapeTag.Companion[BlobView] {
  val id: ShapeId = ShapeId("tools_ozone_moderation_defs", "blobView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(cid: Option[String], mimeType: Option[String], size: Option[Int], createdAt: Option[String], details: Option[String], moderation: Option[String]): BlobView = BlobView(cid, mimeType, size, createdAt, details, moderation)

  implicit val schema: Schema[BlobView] = struct(
    string.optional[BlobView]("cid", _.cid),
    string.optional[BlobView]("mimeType", _.mimeType),
    int.optional[BlobView]("size", _.size),
    string.optional[BlobView]("createdAt", _.createdAt),
    string.optional[BlobView]("details", _.details),
    string.optional[BlobView]("moderation", _.moderation),
  )(make).withId(id).addHints(hints)
}
