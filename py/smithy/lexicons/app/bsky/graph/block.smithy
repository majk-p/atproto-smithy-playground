$version: "2.0"
namespace lexicon.app.bsky.graph.block

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    @documentation("DID of the account to be blocked.")
    subject: String,
    createdAt: String
}
