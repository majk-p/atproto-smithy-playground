$version: "2.0"
namespace lexicon.app.bsky.actor.profile

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {    @documentation("Small image to be displayed next to posts from account. AKA, 'profile picture'")
	avatar: String,
    @documentation("Free-form profile description text.")
	description: String,
    @documentation("Larger horizontal image to display behind profile view.")
	banner: String,
    @documentation("Self-label values, specific to the Bluesky application, on the overall account.")
	labels: String,
    createdAt: String,
    pinnedPost: String,
    joinedViaStarterPack: String,
    displayName: String}