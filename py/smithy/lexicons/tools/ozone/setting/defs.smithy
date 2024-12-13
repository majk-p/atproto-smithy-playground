$version: "2.0"
namespace lexicon.tools.ozone.setting.defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure option {
    key: String,
    did: String,
    value: Document,
    description: String,
    createdAt: String,
    updatedAt: String,
    managerRole: String,
    scope: String,
    createdBy: String,
    lastUpdatedBy: String
}
