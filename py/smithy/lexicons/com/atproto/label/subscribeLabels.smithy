$version: "2.0"
namespace lexicon.com.atproto.label.subscribeLabels

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure labels {
    seq: Integer,
    labels: String
}

@documentation("Generated from ATP Lexicon")
structure info {
    name: String,
    message: String
}
