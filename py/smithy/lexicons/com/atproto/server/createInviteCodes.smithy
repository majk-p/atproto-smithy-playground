$version: "2.0"
namespace lexicon.com.atproto.server.createInviteCodes

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure accountCodes {
    account: String,
    codes: String
}
