$version: "2.0"
namespace com_atproto_server_createInviteCodes

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure accountCodes {
    account: String,
    codes: String
}
