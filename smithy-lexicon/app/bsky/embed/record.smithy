$version: "2.0"
namespace app_bsky_embed_record

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    record: String
}

@documentation("Generated from ATP Lexicon")
structure view {
    record: String
}

@documentation("Generated from ATP Lexicon")
structure viewRecord {
    uri: String,
    cid: String,
    author: String,
    @documentation("The record data itself.")
    value: Document,
    labels: String,
    replyCount: Integer,
    repostCount: Integer,
    likeCount: Integer,
    quoteCount: Integer,
    embeds: String,
    indexedAt: String
}

@documentation("Generated from ATP Lexicon")
structure viewNotFound {
    uri: String,
    notFound: Boolean
}

@documentation("Generated from ATP Lexicon")
structure viewBlocked {
    uri: String,
    blocked: Boolean,
    author: String
}

@documentation("Generated from ATP Lexicon")
structure viewDetached {
    uri: String,
    detached: Boolean
}
