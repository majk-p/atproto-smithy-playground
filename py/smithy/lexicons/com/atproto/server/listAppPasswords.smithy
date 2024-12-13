$version: "2.0"
namespace lexicon.com.atproto.server.listAppPasswords

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure appPassword {
    name: String,
    createdAt: String,
    privileged: Boolean
}
