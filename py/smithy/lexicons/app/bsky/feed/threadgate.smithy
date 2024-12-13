$version: "2.0"
namespace lexicon.app.bsky.feed.threadgate

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    @documentation("Reference (AT-URI) to the post record.")
    post: String,
    allow: String,
    createdAt: String,
    @documentation("List of hidden reply URIs.")
    hiddenReplies: String
}

@documentation("Generated from ATP Lexicon")
structure mentionRule {
}

@documentation("Generated from ATP Lexicon")
structure followingRule {
}

@documentation("Generated from ATP Lexicon")
structure listRule {
    list: String
}
