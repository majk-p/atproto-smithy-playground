package lexicon.app.bsky.graph.defs

import smithy4s.Document
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.document
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon */
final case class StarterPackViewBasic(uri: Option[String] = None, cid: Option[String] = None, record: Option[Document] = None, creator: Option[String] = None, listItemCount: Option[Int] = None, joinedWeekCount: Option[Int] = None, joinedAllTimeCount: Option[Int] = None, labels: Option[String] = None, indexedAt: Option[String] = None)

object StarterPackViewBasic extends ShapeTag.Companion[StarterPackViewBasic] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.graph.defs", "starterPackViewBasic")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], record: Option[Document], creator: Option[String], listItemCount: Option[Int], joinedWeekCount: Option[Int], joinedAllTimeCount: Option[Int], labels: Option[String], indexedAt: Option[String]): StarterPackViewBasic = StarterPackViewBasic(uri, cid, record, creator, listItemCount, joinedWeekCount, joinedAllTimeCount, labels, indexedAt)

  implicit val schema: Schema[StarterPackViewBasic] = struct(
    string.optional[StarterPackViewBasic]("uri", _.uri),
    string.optional[StarterPackViewBasic]("cid", _.cid),
    document.optional[StarterPackViewBasic]("record", _.record),
    string.optional[StarterPackViewBasic]("creator", _.creator),
    int.optional[StarterPackViewBasic]("listItemCount", _.listItemCount),
    int.optional[StarterPackViewBasic]("joinedWeekCount", _.joinedWeekCount),
    int.optional[StarterPackViewBasic]("joinedAllTimeCount", _.joinedAllTimeCount),
    string.optional[StarterPackViewBasic]("labels", _.labels),
    string.optional[StarterPackViewBasic]("indexedAt", _.indexedAt),
  )(make).withId(id).addHints(hints)
}
