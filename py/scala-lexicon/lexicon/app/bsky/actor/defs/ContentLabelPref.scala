package lexicon.app.bsky.actor.defs

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param labelerDid
  *   Which labeler does this preference apply to? If undefined, applies globally.
  */
final case class ContentLabelPref(labelerDid: Option[String] = None, label: Option[String] = None, visibility: Option[String] = None)

object ContentLabelPref extends ShapeTag.Companion[ContentLabelPref] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.actor.defs", "contentLabelPref")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(labelerDid: Option[String], label: Option[String], visibility: Option[String]): ContentLabelPref = ContentLabelPref(labelerDid, label, visibility)

  implicit val schema: Schema[ContentLabelPref] = struct(
    string.optional[ContentLabelPref]("labelerDid", _.labelerDid).addHints(smithy.api.Documentation("Which labeler does this preference apply to? If undefined, applies globally.")),
    string.optional[ContentLabelPref]("label", _.label),
    string.optional[ContentLabelPref]("visibility", _.visibility),
  )(make).withId(id).addHints(hints)
}
