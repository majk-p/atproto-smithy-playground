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
final case class StarterPackView(uri: Option[String] = None, cid: Option[String] = None, record: Option[Document] = None, creator: Option[String] = None, list: Option[String] = None, listItemsSample: Option[String] = None, feeds: Option[String] = None, joinedWeekCount: Option[Int] = None, joinedAllTimeCount: Option[Int] = None, labels: Option[String] = None, indexedAt: Option[String] = None)

object StarterPackView extends ShapeTag.Companion[StarterPackView] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.graph.defs", "starterPackView")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], record: Option[Document], creator: Option[String], list: Option[String], listItemsSample: Option[String], feeds: Option[String], joinedWeekCount: Option[Int], joinedAllTimeCount: Option[Int], labels: Option[String], indexedAt: Option[String]): StarterPackView = StarterPackView(uri, cid, record, creator, list, listItemsSample, feeds, joinedWeekCount, joinedAllTimeCount, labels, indexedAt)

  implicit val schema: Schema[StarterPackView] = struct(
    string.optional[StarterPackView]("uri", _.uri),
    string.optional[StarterPackView]("cid", _.cid),
    document.optional[StarterPackView]("record", _.record),
    string.optional[StarterPackView]("creator", _.creator),
    string.optional[StarterPackView]("list", _.list),
    string.optional[StarterPackView]("listItemsSample", _.listItemsSample),
    string.optional[StarterPackView]("feeds", _.feeds),
    int.optional[StarterPackView]("joinedWeekCount", _.joinedWeekCount),
    int.optional[StarterPackView]("joinedAllTimeCount", _.joinedAllTimeCount),
    string.optional[StarterPackView]("labels", _.labels),
    string.optional[StarterPackView]("indexedAt", _.indexedAt),
  )(make).withId(id).addHints(hints)
}
