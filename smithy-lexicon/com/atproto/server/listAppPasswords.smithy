$version: "2.0"
namespace com_atproto_server_listAppPasswords

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure appPassword {
    name: String,
    createdAt: String,
    privileged: Boolean
}