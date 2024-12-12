$version: "2.0"
namespace com_atproto_server_describeServer

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure links {
    privacyPolicy: String,
    termsOfService: String
}

@documentation("Generated from ATP Lexicon")
structure contact {
    email: String
}
