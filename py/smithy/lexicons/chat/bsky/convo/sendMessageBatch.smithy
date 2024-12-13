$version: "2.0"
namespace lexicon.chat.bsky.convo.sendMessageBatch

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure batchItem {
    convoId: String,
    message: String
}
