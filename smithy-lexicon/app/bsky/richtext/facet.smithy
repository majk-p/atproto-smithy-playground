$version: "2.0"
namespace app_bsky_richtext_facet

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    index: String,
    features: String
}

@documentation("Generated from ATP Lexicon")
structure mention {
    did: String
}

@documentation("Generated from ATP Lexicon")
structure link {
    uri: String
}

@documentation("Generated from ATP Lexicon")
structure tag {
    tag: String
}

@documentation("Generated from ATP Lexicon")
structure byteSlice {
    byteStart: Integer,
    byteEnd: Integer
}
