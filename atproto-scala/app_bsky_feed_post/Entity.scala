package app_bsky_feed_post

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param type
  *   Expected values are 'mention' and 'link'.
  */
final case class Entity(index: Option[String] = None, _type: Option[String] = None, value: Option[String] = None)

object Entity extends ShapeTag.Companion[Entity] {
  val id: ShapeId = ShapeId("app_bsky_feed_post", "entity")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(index: Option[String], _type: Option[String], value: Option[String]): Entity = Entity(index, _type, value)

  implicit val schema: Schema[Entity] = struct(
    string.optional[Entity]("index", _.index),
    string.optional[Entity]("type", _._type).addHints(smithy.api.Documentation("Expected values are \'mention\' and \'link\'.")),
    string.optional[Entity]("value", _.value),
  )(make).withId(id).addHints(hints)
}
