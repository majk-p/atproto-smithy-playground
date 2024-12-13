$version: "2.0"
namespace lexicon.app.bsky.video.defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure jobStatus {
    jobId: String,
    did: String,
    @documentation("The state of the video processing job. All values not listed as a known value indicate that the job is in process.")
    state: String,
    @documentation("Progress within the current processing state.")
    progress: Integer,
    blob: String,
    error: String,
    message: String
}
