package lexicon.app.bsky.notification.listNotifications

import smithy4s.Document
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.document
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param reason
  *   Expected values are 'like', 'repost', 'follow', 'mention', 'reply', 'quote', and 'starterpack-joined'.
  */
final case class Notification(uri: Option[String] = None, cid: Option[String] = None, author: Option[String] = None, reason: Option[String] = None, reasonSubject: Option[String] = None, record: Option[Document] = None, isRead: Option[Boolean] = None, indexedAt: Option[String] = None, labels: Option[String] = None)

object Notification extends ShapeTag.Companion[Notification] {
  val id: ShapeId = ShapeId("lexicon.app.bsky.notification.listNotifications", "notification")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(uri: Option[String], cid: Option[String], author: Option[String], reason: Option[String], reasonSubject: Option[String], record: Option[Document], isRead: Option[Boolean], indexedAt: Option[String], labels: Option[String]): Notification = Notification(uri, cid, author, reason, reasonSubject, record, isRead, indexedAt, labels)

  implicit val schema: Schema[Notification] = struct(
    string.optional[Notification]("uri", _.uri),
    string.optional[Notification]("cid", _.cid),
    string.optional[Notification]("author", _.author),
    string.optional[Notification]("reason", _.reason).addHints(smithy.api.Documentation("Expected values are \'like\', \'repost\', \'follow\', \'mention\', \'reply\', \'quote\', and \'starterpack-joined\'.")),
    string.optional[Notification]("reasonSubject", _.reasonSubject),
    document.optional[Notification]("record", _.record),
    boolean.optional[Notification]("isRead", _.isRead),
    string.optional[Notification]("indexedAt", _.indexedAt),
    string.optional[Notification]("labels", _.labels),
  )(make).withId(id).addHints(hints)
}
