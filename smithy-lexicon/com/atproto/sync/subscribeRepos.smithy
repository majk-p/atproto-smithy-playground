$version: "2.0"
namespace com_atproto_sync_subscribeRepos

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure commit {
    @documentation("The stream sequence number of this message.")
    seq: Integer,
    @documentation("DEPRECATED -- unused")
    rebase: Boolean,
    @documentation("Indicates that this commit contained too many ops, or data size was too large. Consumers will need to make a separate request to get missing data.")
    tooBig: Boolean,
    @documentation("The repo this event comes from.")
    repo: String,
    @documentation("Repo commit object CID.")
    commit: String,
    @documentation("DEPRECATED -- unused. WARNING -- nullable and optional; stick with optional to ensure golang interoperability.")
    prev: String,
    @documentation("The rev of the emitted commit. Note that this information is also in the commit object included in blocks, unless this is a tooBig event.")
    rev: String,
    @documentation("The rev of the last emitted commit from this repo (if any).")
    since: String,
    @documentation("CAR file containing relevant blocks, as a diff since the previous repo state.")
    blocks: Blob,
    ops: String,
    blobs: String,
    @documentation("Timestamp of when this message was originally broadcast.")
    time: String
}

@documentation("Generated from ATP Lexicon")
structure identity {
    seq: Integer,
    did: String,
    time: String,
    @documentation("The current handle for the account, or 'handle.invalid' if validation fails. This field is optional, might have been validated or passed-through from an upstream source. Semantics and behaviors for PDS vs Relay may evolve in the future; see atproto specs for more details.")
    handle: String
}

@documentation("Generated from ATP Lexicon")
structure account {
    seq: Integer,
    did: String,
    time: String,
    @documentation("Indicates that the account has a repository which can be fetched from the host that emitted this event.")
    active: Boolean,
    @documentation("If active=false, this optional field indicates a reason for why the account is not active.")
    status: String
}

@documentation("Generated from ATP Lexicon")
structure handle {
    seq: Integer,
    did: String,
    handle: String,
    time: String
}

@documentation("Generated from ATP Lexicon")
structure migrate {
    seq: Integer,
    did: String,
    migrateTo: String,
    time: String
}

@documentation("Generated from ATP Lexicon")
structure tombstone {
    seq: Integer,
    did: String,
    time: String
}

@documentation("Generated from ATP Lexicon")
structure info {
    name: String,
    message: String
}

@documentation("Generated from ATP Lexicon")
structure repoOp {
    action: String,
    path: String,
    @documentation("For creates and updates, the new record CID. For deletions, null.")
    cid: String
}
