$version: "2.0"
namespace lexicon.app.bsky.embed.images

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    images: String
}

@documentation("Generated from ATP Lexicon")
structure image {
    image: String,
    @documentation("Alt text description of the image, for accessibility.")
    alt: String,
    aspectRatio: String
}

@documentation("Generated from ATP Lexicon")
structure view {
    images: String
}

@documentation("Generated from ATP Lexicon")
structure viewImage {
    @documentation("Fully-qualified URL where a thumbnail of the image can be fetched. For example, CDN location provided by the App View.")
    thumb: String,
    @documentation("Fully-qualified URL where a large version of the image can be fetched. May or may not be the exact original blob. For example, CDN location provided by the App View.")
    fullsize: String,
    @documentation("Alt text description of the image, for accessibility.")
    alt: String,
    aspectRatio: String
}
