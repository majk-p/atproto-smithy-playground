$version: "2.0"
namespace app_bsky_feed_postgate

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    createdAt: String,
    @documentation("Reference (AT-URI) to the post record.")
    post: String,
    @documentation("List of AT-URIs embedding this post that the author has detached from.")
    detachedEmbeddingUris: String,
    embeddingRules: String
}

@documentation("Generated from ATP Lexicon")
structure disableRule {
}
