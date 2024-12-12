$version: "2.0"
namespace app_bsky_feed_describeFeedGenerator

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure feed {
    uri: String
}

@documentation("Generated from ATP Lexicon")
structure links {
    privacyPolicy: String,
    termsOfService: String
}
