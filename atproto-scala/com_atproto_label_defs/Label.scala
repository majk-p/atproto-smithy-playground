package com_atproto_label_defs

import smithy4s.Blob
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.boolean
import smithy4s.schema.Schema.bytes
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** Generated from ATP Lexicon
  * @param uri
  *   AT URI of the record, repository (account), or other resource that this label applies to.
  * @param sig
  *   Signature of dag-cbor encoded label.
  * @param cts
  *   Timestamp when this label was created.
  * @param cid
  *   Optionally, CID specifying the specific version of 'uri' resource this label applies to.
  * @param val
  *   The short string name of the value or type of this label.
  * @param exp
  *   Timestamp at which this label expires (no longer applies).
  * @param neg
  *   If true, this is a negation label, overwriting a previous label.
  * @param ver
  *   The AT Protocol version of the label object.
  * @param src
  *   DID of the actor who created this label.
  */
final case class Label(ver: Option[Int] = None, src: Option[String] = None, uri: Option[String] = None, cid: Option[String] = None, _val: Option[String] = None, neg: Option[Boolean] = None, cts: Option[String] = None, exp: Option[String] = None, sig: Option[Blob] = None)

object Label extends ShapeTag.Companion[Label] {
  val id: ShapeId = ShapeId("com_atproto_label_defs", "label")

  val hints: Hints = Hints(
    smithy.api.Documentation("Generated from ATP Lexicon"),
  ).lazily

  // constructor using the original order from the spec
  private def make(ver: Option[Int], src: Option[String], uri: Option[String], cid: Option[String], _val: Option[String], neg: Option[Boolean], cts: Option[String], exp: Option[String], sig: Option[Blob]): Label = Label(ver, src, uri, cid, _val, neg, cts, exp, sig)

  implicit val schema: Schema[Label] = struct(
    int.optional[Label]("ver", _.ver).addHints(smithy.api.Documentation("The AT Protocol version of the label object.")),
    string.optional[Label]("src", _.src).addHints(smithy.api.Documentation("DID of the actor who created this label.")),
    string.optional[Label]("uri", _.uri).addHints(smithy.api.Documentation("AT URI of the record, repository (account), or other resource that this label applies to.")),
    string.optional[Label]("cid", _.cid).addHints(smithy.api.Documentation("Optionally, CID specifying the specific version of \'uri\' resource this label applies to.")),
    string.optional[Label]("val", _._val).addHints(smithy.api.Documentation("The short string name of the value or type of this label.")),
    boolean.optional[Label]("neg", _.neg).addHints(smithy.api.Documentation("If true, this is a negation label, overwriting a previous label.")),
    string.optional[Label]("cts", _.cts).addHints(smithy.api.Documentation("Timestamp when this label was created.")),
    string.optional[Label]("exp", _.exp).addHints(smithy.api.Documentation("Timestamp at which this label expires (no longer applies).")),
    bytes.optional[Label]("sig", _.sig).addHints(smithy.api.Documentation("Signature of dag-cbor encoded label.")),
  )(make).withId(id).addHints(hints)
}
