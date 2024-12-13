$version: "2.0"
namespace lexicon.app.bsky.graph.defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure listViewBasic {
    uri: String,
    cid: String,
    name: String,
    purpose: String,
    avatar: String,
    listItemCount: Integer,
    labels: String,
    viewer: String,
    indexedAt: String
}

@documentation("Generated from ATP Lexicon")
structure listView {
    uri: String,
    cid: String,
    creator: String,
    name: String,
    purpose: String,
    description: String,
    descriptionFacets: String,
    avatar: String,
    listItemCount: Integer,
    labels: String,
    viewer: String,
    indexedAt: String
}

@documentation("Generated from ATP Lexicon")
structure listItemView {
    uri: String,
    subject: String
}

@documentation("Generated from ATP Lexicon")
structure starterPackView {
    uri: String,
    cid: String,
    record: Document,
    creator: String,
    list: String,
    listItemsSample: String,
    feeds: String,
    joinedWeekCount: Integer,
    joinedAllTimeCount: Integer,
    labels: String,
    indexedAt: String
}

@documentation("Generated from ATP Lexicon")
structure starterPackViewBasic {
    uri: String,
    cid: String,
    record: Document,
    creator: String,
    listItemCount: Integer,
    joinedWeekCount: Integer,
    joinedAllTimeCount: Integer,
    labels: String,
    indexedAt: String
}

@documentation("Generated from ATP Lexicon")
structure listViewerState {
    muted: Boolean,
    blocked: String
}

@documentation("Generated from ATP Lexicon")
structure notFoundActor {
    actor: String,
    notFound: Boolean
}

@documentation("Generated from ATP Lexicon")
structure relationship {
    did: String,
    @documentation("if the actor follows this DID, this is the AT-URI of the follow record")
    following: String,
    @documentation("if the actor is followed by this DID, contains the AT-URI of the follow record")
    followedBy: String
}
