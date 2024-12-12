$version: "2.0"
namespace app_bsky_graph_listblock

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    @documentation("Reference (AT-URI) to the mod list record.")
    subject: String,
    createdAt: String
}
