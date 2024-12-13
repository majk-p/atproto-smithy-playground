$version: "2.0"
namespace lexicon.app.bsky.feed.generator

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    did: String,
    displayName: String,
    description: String,
    descriptionFacets: String,
    avatar: String,
    @documentation("Declaration that a feed accepts feedback interactions from a client through app.bsky.feed.sendInteractions")
    acceptsInteractions: Boolean,
    @documentation("Self-label values")
    labels: String,
    createdAt: String
}
