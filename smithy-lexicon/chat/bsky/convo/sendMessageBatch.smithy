$version: "2.0"
namespace chat_bsky_convo_sendMessageBatch

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure batchItem {
    convoId: String,
    message: String
}
