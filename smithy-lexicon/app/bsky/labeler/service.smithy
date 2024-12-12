$version: "2.0"
namespace app_bsky_labeler_service

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    policies: String,
    labels: String,
    createdAt: String
}
