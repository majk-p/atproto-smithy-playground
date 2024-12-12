$version: "2.0"
namespace tools_ozone_communication_defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure templateView {
    id: String,
    @documentation("Name of the template.")
    name: String,
    @documentation("Content of the template, can contain markdown and variable placeholders.")
    subject: String,
    @documentation("Subject of the message, used in emails.")
    contentMarkdown: String,
    disabled: Boolean,
    @documentation("Message language.")
    lang: String,
    @documentation("DID of the user who last updated the template.")
    lastUpdatedBy: String,
    createdAt: String,
    updatedAt: String
}
