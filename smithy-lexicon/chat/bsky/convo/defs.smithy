$version: "2.0"
namespace chat_bsky_convo_defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure messageRef {
    did: String,
    convoId: String,
    messageId: String
}

@documentation("Generated from ATP Lexicon")
structure messageInput {
    text: String,
    @documentation("Annotations of text (mentions, URLs, hashtags, etc)")
    facets: String,
    embed: String
}

@documentation("Generated from ATP Lexicon")
structure messageView {
    id: String,
    rev: String,
    text: String,
    @documentation("Annotations of text (mentions, URLs, hashtags, etc)")
    facets: String,
    embed: String,
    sender: String,
    sentAt: String
}

@documentation("Generated from ATP Lexicon")
structure deletedMessageView {
    id: String,
    rev: String,
    sender: String,
    sentAt: String
}

@documentation("Generated from ATP Lexicon")
structure messageViewSender {
    did: String
}

@documentation("Generated from ATP Lexicon")
structure convoView {
    id: String,
    rev: String,
    members: String,
    lastMessage: String,
    muted: Boolean,
    opened: Boolean,
    unreadCount: Integer
}

@documentation("Generated from ATP Lexicon")
structure logBeginConvo {
    rev: String,
    convoId: String
}

@documentation("Generated from ATP Lexicon")
structure logLeaveConvo {
    rev: String,
    convoId: String
}

@documentation("Generated from ATP Lexicon")
structure logCreateMessage {
    rev: String,
    convoId: String,
    message: String
}

@documentation("Generated from ATP Lexicon")
structure logDeleteMessage {
    rev: String,
    convoId: String,
    message: String
}
