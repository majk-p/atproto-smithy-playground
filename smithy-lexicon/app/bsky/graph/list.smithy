$version: "2.0"
namespace app_bsky_graph_list

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    @documentation("Defines the purpose of the list (aka, moderation-oriented or curration-oriented)")
    purpose: String,
    @documentation("Display name for list; can not be empty.")
    name: String,
    description: String,
    descriptionFacets: String,
    avatar: String,
    labels: String,
    createdAt: String
}
