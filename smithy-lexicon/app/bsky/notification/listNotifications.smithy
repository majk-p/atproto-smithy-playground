$version: "2.0"
namespace app_bsky_notification_listNotifications

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure notification {
    uri: String,
    cid: String,
    author: String,
    @documentation("Expected values are 'like', 'repost', 'follow', 'mention', 'reply', 'quote', and 'starterpack-joined'.")
    reason: String,
    reasonSubject: String,
    record: Document,
    isRead: Boolean,
    indexedAt: String,
    labels: String
}
