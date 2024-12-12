$version: "2.0"
namespace app_bsky_embed_video

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure main {
    video: String,
    captions: String,
    @documentation("Alt text description of the video, for accessibility.")
    alt: String,
    aspectRatio: String
}

@documentation("Generated from ATP Lexicon")
structure caption {
    lang: String,
    file: String
}

@documentation("Generated from ATP Lexicon")
structure view {
    cid: String,
    playlist: String,
    thumbnail: String,
    alt: String,
    aspectRatio: String
}
