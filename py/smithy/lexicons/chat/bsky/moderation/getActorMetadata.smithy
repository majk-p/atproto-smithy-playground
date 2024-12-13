$version: "2.0"
namespace lexicon.chat.bsky.moderation.getActorMetadata

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure metadata {
    messagesSent: Integer,
    messagesReceived: Integer,
    convos: Integer,
    convosStarted: Integer
}
