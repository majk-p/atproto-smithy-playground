$version: "2.0"
namespace lexicon.app.bsky.feed.defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure postView {
    uri: String,
    cid: String,
    author: String,
    record: Document,
    embed: String,
    replyCount: Integer,
    repostCount: Integer,
    likeCount: Integer,
    quoteCount: Integer,
    indexedAt: String,
    viewer: String,
    labels: String,
    threadgate: String
}

@documentation("Generated from ATP Lexicon")
structure viewerState {
    repost: String,
    like: String,
    threadMuted: Boolean,
    replyDisabled: Boolean,
    embeddingDisabled: Boolean,
    pinned: Boolean
}

@documentation("Generated from ATP Lexicon")
structure feedViewPost {
    post: String,
    reply: String,
    reason: String,
    @documentation("Context provided by feed generator that may be passed back alongside interactions.")
    feedContext: String
}

@documentation("Generated from ATP Lexicon")
structure replyRef {
    root: String,
    parent: String,
    @documentation("When parent is a reply to another post, this is the author of that post.")
    grandparentAuthor: String
}

@documentation("Generated from ATP Lexicon")
structure reasonRepost {
    by: String,
    indexedAt: String
}

@documentation("Generated from ATP Lexicon")
structure reasonPin {
}

@documentation("Generated from ATP Lexicon")
structure threadViewPost {
    post: String,
    parent: String,
    replies: String
}

@documentation("Generated from ATP Lexicon")
structure notFoundPost {
    uri: String,
    notFound: Boolean
}

@documentation("Generated from ATP Lexicon")
structure blockedPost {
    uri: String,
    blocked: Boolean,
    author: String
}

@documentation("Generated from ATP Lexicon")
structure blockedAuthor {
    did: String,
    viewer: String
}

@documentation("Generated from ATP Lexicon")
structure generatorView {
    uri: String,
    cid: String,
    did: String,
    creator: String,
    displayName: String,
    description: String,
    descriptionFacets: String,
    avatar: String,
    likeCount: Integer,
    acceptsInteractions: Boolean,
    labels: String,
    viewer: String,
    indexedAt: String
}

@documentation("Generated from ATP Lexicon")
structure generatorViewerState {
    like: String
}

@documentation("Generated from ATP Lexicon")
structure skeletonFeedPost {
    post: String,
    reason: String,
    @documentation("Context that will be passed through to client and may be passed to feed generator back alongside interactions.")
    feedContext: String
}

@documentation("Generated from ATP Lexicon")
structure skeletonReasonRepost {
    repost: String
}

@documentation("Generated from ATP Lexicon")
structure skeletonReasonPin {
}

@documentation("Generated from ATP Lexicon")
structure threadgateView {
    uri: String,
    cid: String,
    record: Document,
    lists: String
}

@documentation("Generated from ATP Lexicon")
structure interaction {
    item: String,
    event: String,
    @documentation("Context on a feed item that was originally supplied by the feed generator on getFeedSkeleton.")
    feedContext: String
}
