$version: "2.0"
namespace app_bsky_graph_block

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    @documentation("DID of the account to be blocked.")
    subject: String,
    createdAt: String
}
