$version: "2.0"
namespace lexicon.app.bsky.graph.listitem

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    @documentation("The account which is included on the list.")
    subject: String,
    @documentation("Reference (AT-URI) to the list record (app.bsky.graph.list).")
    list: String,
    createdAt: String
}
