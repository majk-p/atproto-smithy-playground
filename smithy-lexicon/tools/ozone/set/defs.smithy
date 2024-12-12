$version: "2.0"
namespace tools_ozone_set_defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure set {
    name: String,
    description: String
}

@documentation("Generated from ATP Lexicon")
structure setView {
    name: String,
    description: String,
    setSize: Integer,
    createdAt: String,
    updatedAt: String
}
