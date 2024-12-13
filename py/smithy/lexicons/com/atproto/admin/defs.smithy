$version: "2.0"
namespace lexicon.com.atproto.admin.defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure statusAttr {
    applied: Boolean,
    ref: String
}

@documentation("Generated from ATP Lexicon")
structure accountView {
    did: String,
    handle: String,
    email: String,
    relatedRecords: String,
    indexedAt: String,
    invitedBy: String,
    invites: String,
    invitesDisabled: Boolean,
    emailConfirmedAt: String,
    inviteNote: String,
    deactivatedAt: String,
    threatSignatures: String
}

@documentation("Generated from ATP Lexicon")
structure repoRef {
    did: String
}

@documentation("Generated from ATP Lexicon")
structure repoBlobRef {
    did: String,
    cid: String,
    recordUri: String
}

@documentation("Generated from ATP Lexicon")
structure threatSignature {
    property: String,
    value: String
}
