$version: "2.0"
namespace lexicon.app.bsky.feed.post

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {    @documentation("DEPRECATED: replaced by app.bsky.richtext.facet.")
	entities: List<String>,
    @documentation("Additional hashtags, in addition to any included in post text and facets.")
	tags: List<String>,
    @documentation("Indicates human language of post primary text content.")
	langs: List<String>,
    @documentation("The primary post content. May be an empty string, if there are embeds.")
	text: String,
    @documentation("Self-label values for this post. Effectively content warnings.")
	labels: String,
    @documentation("Client-declared timestamp when this post was originally created.")
	createdAt: String,
    @documentation("Annotations of text (mentions, URLs, hashtags, etc)")
	facets: List<String>,
    embed: String,
    reply: String}
@documentation("Generated from ATP Lexicon")
structure replyRef {}
@documentation("Generated from ATP Lexicon")
structure entity {}
@documentation("Generated from ATP Lexicon")
structure textSlice {}