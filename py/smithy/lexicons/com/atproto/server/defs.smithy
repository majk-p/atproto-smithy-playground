$version: "2.0"
namespace lexicon.com.atproto.server.defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure inviteCode {
    code: String,
    available: Integer,
    disabled: Boolean,
    forAccount: String,
    createdBy: String,
    createdAt: String,
    uses: String
}

@documentation("Generated from ATP Lexicon")
structure inviteCodeUse {
    usedBy: String,
    usedAt: String
}
