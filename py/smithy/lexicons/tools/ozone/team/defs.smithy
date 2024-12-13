$version: "2.0"
namespace lexicon.tools.ozone.team.defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure member {
    did: String,
    disabled: Boolean,
    profile: String,
    createdAt: String,
    updatedAt: String,
    lastUpdatedBy: String,
    role: String
}
