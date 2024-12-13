$version: "2.0"
namespace lexicon.app.bsky.unspecced.getTaggedSuggestions

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure suggestion {
    tag: String,
    subjectType: String,
    subject: String
}
