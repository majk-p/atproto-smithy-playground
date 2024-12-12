$version: "2.0"
namespace com_atproto_repo_listRecords

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure record {
    uri: String,
    cid: String,
    value: Document
}
