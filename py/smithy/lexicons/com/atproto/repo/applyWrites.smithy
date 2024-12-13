$version: "2.0"
namespace lexicon.com.atproto.repo.applyWrites

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure create {
    collection: String,
    rkey: String,
    value: Document
}

@documentation("Generated from ATP Lexicon")
structure update {
    collection: String,
    rkey: String,
    value: Document
}

@documentation("Generated from ATP Lexicon")
structure delete {
    collection: String,
    rkey: String
}

@documentation("Generated from ATP Lexicon")
structure createResult {
    uri: String,
    cid: String,
    validationStatus: String
}

@documentation("Generated from ATP Lexicon")
structure updateResult {
    uri: String,
    cid: String,
    validationStatus: String
}

@documentation("Generated from ATP Lexicon")
structure deleteResult {
}
