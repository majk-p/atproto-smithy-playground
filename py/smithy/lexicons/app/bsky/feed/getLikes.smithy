$version: "2.0"
namespace lexicon.app.bsky.feed.getLikes

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure like {
    indexedAt: String,
    createdAt: String,
    actor: String
}
