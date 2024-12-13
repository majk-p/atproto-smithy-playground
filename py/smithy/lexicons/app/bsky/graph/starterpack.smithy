$version: "2.0"
namespace lexicon.app.bsky.graph.starterpack

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    @documentation("Display name for starter pack; can not be empty.")
    name: String,
    description: String,
    descriptionFacets: String,
    @documentation("Reference (AT-URI) to the list record.")
    list: String,
    feeds: String,
    createdAt: String
}

@documentation("Generated from ATP Lexicon")
structure feedItem {
    uri: String
}
