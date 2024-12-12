$version: "2.0"
namespace com_atproto_label_subscribeLabels

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
