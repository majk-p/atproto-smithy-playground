$version: "2.0"
namespace app_bsky_embed_external

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    external: String
}

@documentation("Generated from ATP Lexicon")
structure external {
    uri: String,
    title: String,
    description: String,
    thumb: String
}

@documentation("Generated from ATP Lexicon")
structure view {
    external: String
}

@documentation("Generated from ATP Lexicon")
structure viewExternal {
    uri: String,
    title: String,
    description: String,
    thumb: String
}
