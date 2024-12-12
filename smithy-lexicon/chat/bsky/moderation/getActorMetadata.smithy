$version: "2.0"
namespace chat_bsky_moderation_getActorMetadata

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure metadata {
    messagesSent: Integer,
    messagesReceived: Integer,
    convos: Integer,
    convosStarted: Integer
}
