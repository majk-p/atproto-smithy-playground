$version: "2.0"
namespace app_bsky_actor_profile

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    displayName: String,
    @documentation("Free-form profile description text.")
    description: String,
    @documentation("Small image to be displayed next to posts from account. AKA, 'profile picture'")
    avatar: String,
    @documentation("Larger horizontal image to display behind profile view.")
    banner: String,
    @documentation("Self-label values, specific to the Bluesky application, on the overall account.")
    labels: String,
    joinedViaStarterPack: String,
    pinnedPost: String,
    createdAt: String
}
