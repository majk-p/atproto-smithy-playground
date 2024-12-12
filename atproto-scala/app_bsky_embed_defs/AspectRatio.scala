package app_bsky_embed_defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class AspectRatio(width: Option[Int] = None, height: Option[Int] = None)

object AspectRatio extends ShapeTag.Companion[AspectRatio] {
  val id: ShapeId = ShapeId("app_bsky_embed_defs", "aspectRatio")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(width: Option[Int], height: Option[Int]): AspectRatio = AspectRatio(width, height)

  implicit val schema: Schema[AspectRatio] = struct(
    int.optional[AspectRatio]("width", _.width),
    int.optional[AspectRatio]("height", _.height),
  )(make).withId(id).addHints(hints)
}
