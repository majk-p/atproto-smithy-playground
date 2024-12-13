$version: "2.0"
namespace lexicon.com.atproto.sync.listRepos

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure repo {
    did: String,
    @documentation("Current repo commit CID")
    head: String,
    rev: String,
    active: Boolean,
    @documentation("If active=false, this optional field indicates a possible reason for why the account is not active. If active=false and no status is supplied, then the host makes no claim for why the repository is no longer being hosted.")
    status: String
}
