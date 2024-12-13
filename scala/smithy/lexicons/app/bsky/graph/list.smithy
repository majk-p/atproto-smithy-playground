$version: "2.0"
namespace lexicon.app.bsky.graph.list

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {    @documentation("Display name for list; can not be empty.")
	name: String,
    avatar: String,
    description: String,
    @documentation("Defines the purpose of the list (aka, moderation-oriented or curration-oriented)")
	purpose: String,
    labels: String,
    createdAt: String,
    descriptionFacets: List<String>}