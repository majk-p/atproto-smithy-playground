$version: "2.0"
namespace lexicon.app.bsky.feed.post

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    @documentation("The primary post content. May be an empty string, if there are embeds.")
    text: String,
    @documentation("DEPRECATED: replaced by app.bsky.richtext.facet.")
    entities: String,
    @documentation("Annotations of text (mentions, URLs, hashtags, etc)")
    facets: String,
    reply: String,
    embed: String,
    @documentation("Indicates human language of post primary text content.")
    langs: String,
    @documentation("Self-label values for this post. Effectively content warnings.")
    labels: String,
    @documentation("Additional hashtags, in addition to any included in post text and facets.")
    tags: String,
    @documentation("Client-declared timestamp when this post was originally created.")
    createdAt: String
}

@documentation("Generated from ATP Lexicon")
structure replyRef {
    root: String,
    parent: String
}

@documentation("Generated from ATP Lexicon")
structure entity {
    index: String,
    @documentation("Expected values are 'mention' and 'link'.")
    type: String,
    value: String
}

@documentation("Generated from ATP Lexicon")
structure textSlice {
    start: Integer,
    end: Integer
}
