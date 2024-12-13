$version: "2.0"
namespace lexicon.app.bsky.labeler.defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure labelerView {
    uri: String,
    cid: String,
    creator: String,
    likeCount: Integer,
    viewer: String,
    indexedAt: String,
    labels: String
}

@documentation("Generated from ATP Lexicon")
structure labelerViewDetailed {
    uri: String,
    cid: String,
    creator: String,
    policies: String,
    likeCount: Integer,
    viewer: String,
    indexedAt: String,
    labels: String
}

@documentation("Generated from ATP Lexicon")
structure labelerViewerState {
    like: String
}

@documentation("Generated from ATP Lexicon")
structure labelerPolicies {
    @documentation("The label values which this labeler publishes. May include global or custom labels.")
    labelValues: String,
    @documentation("Label values created by this labeler and scoped exclusively to it. Labels defined here will override global label definitions for this labeler.")
    labelValueDefinitions: String
}
