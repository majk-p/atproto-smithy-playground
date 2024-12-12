$version: "2.0"
namespace tools_ozone_signature_findRelatedAccounts

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure relatedAccount {
    account: String,
    similarities: String
}
