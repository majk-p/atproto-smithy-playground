$version: "2.0"
namespace app_bsky_actor_defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure profileViewBasic {
    did: String,
    handle: String,
    displayName: String,
    avatar: String,
    associated: String,
    viewer: String,
    labels: String,
    createdAt: String
}

@documentation("Generated from ATP Lexicon")
structure profileView {
    did: String,
    handle: String,
    displayName: String,
    description: String,
    avatar: String,
    associated: String,
    indexedAt: String,
    createdAt: String,
    viewer: String,
    labels: String
}

@documentation("Generated from ATP Lexicon")
structure profileViewDetailed {
    did: String,
    handle: String,
    displayName: String,
    description: String,
    avatar: String,
    banner: String,
    followersCount: Integer,
    followsCount: Integer,
    postsCount: Integer,
    associated: String,
    joinedViaStarterPack: String,
    indexedAt: String,
    createdAt: String,
    viewer: String,
    labels: String,
    pinnedPost: String
}

@documentation("Generated from ATP Lexicon")
structure profileAssociated {
    lists: Integer,
    feedgens: Integer,
    starterPacks: Integer,
    labeler: Boolean,
    chat: String
}

@documentation("Generated from ATP Lexicon")
structure profileAssociatedChat {
    allowIncoming: String
}

@documentation("Generated from ATP Lexicon")
structure viewerState {
    muted: Boolean,
    mutedByList: String,
    blockedBy: Boolean,
    blocking: String,
    blockingByList: String,
    following: String,
    followedBy: String,
    knownFollowers: String
}

@documentation("Generated from ATP Lexicon")
structure knownFollowers {
    count: Integer,
    followers: String
}

@documentation("Generated from ATP Lexicon")
structure adultContentPref {
    enabled: Boolean
}

@documentation("Generated from ATP Lexicon")
structure contentLabelPref {
    @documentation("Which labeler does this preference apply to? If undefined, applies globally.")
    labelerDid: String,
    label: String,
    visibility: String
}

@documentation("Generated from ATP Lexicon")
structure savedFeed {
    id: String,
    type: String,
    value: String,
    pinned: Boolean
}

@documentation("Generated from ATP Lexicon")
structure savedFeedsPrefV2 {
    items: String
}

@documentation("Generated from ATP Lexicon")
structure savedFeedsPref {
    pinned: String,
    saved: String,
    timelineIndex: Integer
}

@documentation("Generated from ATP Lexicon")
structure personalDetailsPref {
    @documentation("The birth date of account owner.")
    birthDate: String
}

@documentation("Generated from ATP Lexicon")
structure feedViewPref {
    @documentation("The URI of the feed, or an identifier which describes the feed.")
    feed: String,
    @documentation("Hide replies in the feed.")
    hideReplies: Boolean,
    @documentation("Hide replies in the feed if they are not by followed users.")
    hideRepliesByUnfollowed: Boolean,
    @documentation("Hide replies in the feed if they do not have this number of likes.")
    hideRepliesByLikeCount: Integer,
    @documentation("Hide reposts in the feed.")
    hideReposts: Boolean,
    @documentation("Hide quote posts in the feed.")
    hideQuotePosts: Boolean
}

@documentation("Generated from ATP Lexicon")
structure threadViewPref {
    @documentation("Sorting mode for threads.")
    sort: String,
    @documentation("Show followed users at the top of all replies.")
    prioritizeFollowedUsers: Boolean
}

@documentation("Generated from ATP Lexicon")
structure interestsPref {
    @documentation("A list of tags which describe the account owner's interests gathered during onboarding.")
    tags: String
}

@documentation("Generated from ATP Lexicon")
structure mutedWord {
    id: String,
    @documentation("The muted word itself.")
    value: String,
    @documentation("The intended targets of the muted word.")
    targets: String,
    @documentation("Groups of users to apply the muted word to. If undefined, applies to all users.")
    actorTarget: String,
    @documentation("The date and time at which the muted word will expire and no longer be applied.")
    expiresAt: String
}

@documentation("Generated from ATP Lexicon")
structure mutedWordsPref {
    @documentation("A list of words the account owner has muted.")
    items: String
}

@documentation("Generated from ATP Lexicon")
structure hiddenPostsPref {
    @documentation("A list of URIs of posts the account owner has hidden.")
    items: String
}

@documentation("Generated from ATP Lexicon")
structure labelersPref {
    labelers: String
}

@documentation("Generated from ATP Lexicon")
structure labelerPrefItem {
    did: String
}

@documentation("Generated from ATP Lexicon")
structure bskyAppStatePref {
    activeProgressGuide: String,
    @documentation("An array of tokens which identify nudges (modals, popups, tours, highlight dots) that should be shown to the user.")
    queuedNudges: String,
    @documentation("Storage for NUXs the user has encountered.")
    nuxs: String
}

@documentation("Generated from ATP Lexicon")
structure bskyAppProgressGuide {
    guide: String
}

@documentation("Generated from ATP Lexicon")
structure nux {
    id: String,
    completed: Boolean,
    @documentation("Arbitrary data for the NUX. The structure is defined by the NUX itself. Limited to 300 characters.")
    data: String,
    @documentation("The date and time at which the NUX will expire and should be considered completed.")
    expiresAt: String
}
