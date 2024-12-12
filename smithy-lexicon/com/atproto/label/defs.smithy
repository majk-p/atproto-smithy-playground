$version: "2.0"
namespace com_atproto_label_defs

// Imports (add as needed)
use alloy#simpleRestJson

@documentation("Generated from ATP Lexicon")
structure label {
    @documentation("The AT Protocol version of the label object.")
    ver: Integer,
    @documentation("DID of the actor who created this label.")
    src: String,
    @documentation("AT URI of the record, repository (account), or other resource that this label applies to.")
    uri: String,
    @documentation("Optionally, CID specifying the specific version of 'uri' resource this label applies to.")
    cid: String,
    @documentation("The short string name of the value or type of this label.")
    val: String,
    @documentation("If true, this is a negation label, overwriting a previous label.")
    neg: Boolean,
    @documentation("Timestamp when this label was created.")
    cts: String,
    @documentation("Timestamp at which this label expires (no longer applies).")
    exp: String,
    @documentation("Signature of dag-cbor encoded label.")
    sig: Blob
}

@documentation("Generated from ATP Lexicon")
structure selfLabels {
    values: String
}

@documentation("Generated from ATP Lexicon")
structure selfLabel {
    @documentation("The short string name of the value or type of this label.")
    val: String
}

@documentation("Generated from ATP Lexicon")
structure labelValueDefinition {
    @documentation("The value of the label being defined. Must only include lowercase ascii and the '-' character ([a-z-]+).")
    identifier: String,
    @documentation("How should a client visually convey this label? 'inform' means neutral and informational; 'alert' means negative and warning; 'none' means show nothing.")
    severity: String,
    @documentation("What should this label hide in the UI, if applied? 'content' hides all of the target; 'media' hides the images/video/audio; 'none' hides nothing.")
    blurs: String,
    @documentation("The default setting for this label.")
    defaultSetting: String,
    @documentation("Does the user need to have adult content enabled in order to configure this label?")
    adultOnly: Boolean,
    locales: String
}

@documentation("Generated from ATP Lexicon")
structure labelValueDefinitionStrings {
    @documentation("The code of the language these strings are written in.")
    lang: String,
    @documentation("A short human-readable name for the label.")
    name: String,
    @documentation("A longer description of what the label means and why it might be applied.")
    description: String
}
