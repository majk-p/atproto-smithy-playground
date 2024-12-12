$version: "2.0"
namespace chat_bsky_actor_defs

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
    @documentation("Set to true when the actor cannot actively participate in converations")
    chatDisabled: Boolean
}
