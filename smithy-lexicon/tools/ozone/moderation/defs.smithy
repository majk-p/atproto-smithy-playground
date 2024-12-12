$version: "2.0"
namespace tools_ozone_moderation_defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure modEventView {
    id: Integer,
    event: String,
    subject: String,
    subjectBlobCids: String,
    createdBy: String,
    createdAt: String,
    creatorHandle: String,
    subjectHandle: String
}

@documentation("Generated from ATP Lexicon")
structure modEventViewDetail {
    id: Integer,
    event: String,
    subject: String,
    subjectBlobs: String,
    createdBy: String,
    createdAt: String
}

@documentation("Generated from ATP Lexicon")
structure subjectStatusView {
    id: Integer,
    subject: String,
    hosting: String,
    subjectBlobCids: String,
    subjectRepoHandle: String,
    @documentation("Timestamp referencing when the last update was made to the moderation status of the subject")
    updatedAt: String,
    @documentation("Timestamp referencing the first moderation status impacting event was emitted on the subject")
    createdAt: String,
    reviewState: String,
    @documentation("Sticky comment on the subject.")
    comment: String,
    muteUntil: String,
    muteReportingUntil: String,
    lastReviewedBy: String,
    lastReviewedAt: String,
    lastReportedAt: String,
    @documentation("Timestamp referencing when the author of the subject appealed a moderation action")
    lastAppealedAt: String,
    takendown: Boolean,
    @documentation("True indicates that the a previously taken moderator action was appealed against, by the author of the content. False indicates last appeal was resolved by moderators.")
    appealed: Boolean,
    suspendUntil: String,
    tags: String
}

@documentation("Generated from ATP Lexicon")
structure modEventTakedown {
    comment: String,
    @documentation("Indicates how long the takedown should be in effect before automatically expiring.")
    durationInHours: Integer,
    @documentation("If true, all other reports on content authored by this account will be resolved (acknowledged).")
    acknowledgeAccountSubjects: Boolean
}

@documentation("Generated from ATP Lexicon")
structure modEventReverseTakedown {
    @documentation("Describe reasoning behind the reversal.")
    comment: String
}

@documentation("Generated from ATP Lexicon")
structure modEventResolveAppeal {
    @documentation("Describe resolution.")
    comment: String
}

@documentation("Generated from ATP Lexicon")
structure modEventComment {
    comment: String,
    @documentation("Make the comment persistent on the subject")
    sticky: Boolean
}

@documentation("Generated from ATP Lexicon")
structure modEventReport {
    comment: String,
    @documentation("Set to true if the reporter was muted from reporting at the time of the event. These reports won't impact the reviewState of the subject.")
    isReporterMuted: Boolean,
    reportType: String
}

@documentation("Generated from ATP Lexicon")
structure modEventLabel {
    comment: String,
    createLabelVals: String,
    negateLabelVals: String
}

@documentation("Generated from ATP Lexicon")
structure modEventAcknowledge {
    comment: String
}

@documentation("Generated from ATP Lexicon")
structure modEventEscalate {
    comment: String
}

@documentation("Generated from ATP Lexicon")
structure modEventMute {
    comment: String,
    @documentation("Indicates how long the subject should remain muted.")
    durationInHours: Integer
}

@documentation("Generated from ATP Lexicon")
structure modEventUnmute {
    @documentation("Describe reasoning behind the reversal.")
    comment: String
}

@documentation("Generated from ATP Lexicon")
structure modEventMuteReporter {
    comment: String,
    @documentation("Indicates how long the account should remain muted. Falsy value here means a permanent mute.")
    durationInHours: Integer
}

@documentation("Generated from ATP Lexicon")
structure modEventUnmuteReporter {
    @documentation("Describe reasoning behind the reversal.")
    comment: String
}

@documentation("Generated from ATP Lexicon")
structure modEventEmail {
    @documentation("The subject line of the email sent to the user.")
    subjectLine: String,
    @documentation("The content of the email sent to the user.")
    content: String,
    @documentation("Additional comment about the outgoing comm.")
    comment: String
}

@documentation("Generated from ATP Lexicon")
structure modEventDivert {
    comment: String
}

@documentation("Generated from ATP Lexicon")
structure modEventTag {
    @documentation("Tags to be added to the subject. If already exists, won't be duplicated.")
    add: String,
    @documentation("Tags to be removed to the subject. Ignores a tag If it doesn't exist, won't be duplicated.")
    remove: String,
    @documentation("Additional comment about added/removed tags.")
    comment: String
}

@documentation("Generated from ATP Lexicon")
structure accountEvent {
    comment: String,
    @documentation("Indicates that the account has a repository which can be fetched from the host that emitted this event.")
    active: Boolean,
    status: String,
    timestamp: String
}

@documentation("Generated from ATP Lexicon")
structure identityEvent {
    comment: String,
    handle: String,
    pdsHost: String,
    tombstone: Boolean,
    timestamp: String
}

@documentation("Generated from ATP Lexicon")
structure recordEvent {
    comment: String,
    op: String,
    cid: String,
    timestamp: String
}

@documentation("Generated from ATP Lexicon")
structure repoView {
    did: String,
    handle: String,
    email: String,
    relatedRecords: String,
    indexedAt: String,
    moderation: String,
    invitedBy: String,
    invitesDisabled: Boolean,
    inviteNote: String,
    deactivatedAt: String,
    threatSignatures: String
}

@documentation("Generated from ATP Lexicon")
structure repoViewDetail {
    did: String,
    handle: String,
    email: String,
    relatedRecords: String,
    indexedAt: String,
    moderation: String,
    labels: String,
    invitedBy: String,
    invites: String,
    invitesDisabled: Boolean,
    inviteNote: String,
    emailConfirmedAt: String,
    deactivatedAt: String,
    threatSignatures: String
}

@documentation("Generated from ATP Lexicon")
structure repoViewNotFound {
    did: String
}

@documentation("Generated from ATP Lexicon")
structure recordView {
    uri: String,
    cid: String,
    value: Document,
    blobCids: String,
    indexedAt: String,
    moderation: String,
    repo: String
}

@documentation("Generated from ATP Lexicon")
structure recordViewDetail {
    uri: String,
    cid: String,
    value: Document,
    blobs: String,
    labels: String,
    indexedAt: String,
    moderation: String,
    repo: String
}

@documentation("Generated from ATP Lexicon")
structure recordViewNotFound {
    uri: String
}

@documentation("Generated from ATP Lexicon")
structure moderation {
    subjectStatus: String
}

@documentation("Generated from ATP Lexicon")
structure moderationDetail {
    subjectStatus: String
}

@documentation("Generated from ATP Lexicon")
structure blobView {
    cid: String,
    mimeType: String,
    size: Integer,
    createdAt: String,
    details: String,
    moderation: String
}

@documentation("Generated from ATP Lexicon")
structure imageDetails {
    width: Integer,
    height: Integer
}

@documentation("Generated from ATP Lexicon")
structure videoDetails {
    width: Integer,
    height: Integer,
    length: Integer
}

@documentation("Generated from ATP Lexicon")
structure accountHosting {
    status: String,
    updatedAt: String,
    createdAt: String,
    deletedAt: String,
    deactivatedAt: String,
    reactivatedAt: String
}

@documentation("Generated from ATP Lexicon")
structure recordHosting {
    status: String,
    updatedAt: String,
    createdAt: String,
    deletedAt: String
}
