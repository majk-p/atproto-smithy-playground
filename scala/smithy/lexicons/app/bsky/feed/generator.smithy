$version: "2.0"
namespace lexicon.app.bsky.feed.generator

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {    displayName: String,
    avatar: String,
    description: String,
    @documentation("Declaration that a feed accepts feedback interactions from a client through app.bsky.feed.sendInteractions")
	acceptsInteractions: Boolean,
    did: String,
    @documentation("Self-label values")
	labels: String,
    createdAt: String,
    descriptionFacets: List<String>}