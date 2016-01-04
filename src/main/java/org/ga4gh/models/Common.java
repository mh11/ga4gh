/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;

@SuppressWarnings("all")
/** This file defines common types used in other parts of the schema.
There are no directly associated methods. */
@org.apache.avro.specific.AvroGenerated
public interface Common {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"Common\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"This file defines common types used in other parts of the schema.\\nThere are no directly associated methods.\",\"types\":[{\"type\":\"enum\",\"name\":\"Strand\",\"doc\":\"Indicates the DNA strand associate for some data item.\\n* `NEG_STRAND`: The negative (-) strand.\\n* `POS_STRAND`:  The postive (+) strand.\",\"symbols\":[\"NEG_STRAND\",\"POS_STRAND\"]},{\"type\":\"record\",\"name\":\"Position\",\"doc\":\"A `Position` is an unoriented base in some `Reference`. A `Position` is\\nrepresented by a `Reference` name, and a base number on that `Reference`\\n(0-based).\",\"fields\":[{\"name\":\"referenceName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The name of the `Reference` on which the `Position` is located.\"},{\"name\":\"position\",\"type\":\"long\",\"doc\":\"The 0-based offset from the start of the forward strand for that `Reference`.\\n  Genomic positions are non-negative integers less than `Reference` length.\"},{\"name\":\"strand\",\"type\":\"Strand\",\"doc\":\"Strand the position is associated with.\"}]},{\"type\":\"record\",\"name\":\"ExternalIdentifier\",\"doc\":\"Identifier from a public database\",\"fields\":[{\"name\":\"database\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The source of the identifier.\\n  (e.g. `Ensembl`)\"},{\"name\":\"identifier\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID defined by the external database.\\n  (e.g. `ENST00000000000`)\"},{\"name\":\"version\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The version of the object or the database\\n  (e.g. `78`)\"}]},{\"type\":\"enum\",\"name\":\"CigarOperation\",\"doc\":\"An enum for the different types of CIGAR alignment operations that exist.\\nUsed wherever CIGAR alignments are used. The different enumerated values\\nhave the following usage:\\n\\n* `ALIGNMENT_MATCH`: An alignment match indicates that a sequence can be\\n  aligned to the reference without evidence of an INDEL. Unlike the\\n  `SEQUENCE_MATCH` and `SEQUENCE_MISMATCH` operators, the `ALIGNMENT_MATCH`\\n  operator does not indicate whether the reference and read sequences are an\\n  exact match. This operator is equivalent to SAM's `M`.\\n* `INSERT`: The insert operator indicates that the read contains evidence of\\n  bases being inserted into the reference. This operator is equivalent to\\n  SAM's `I`.\\n* `DELETE`: The delete operator indicates that the read contains evidence of\\n  bases being deleted from the reference. This operator is equivalent to\\n  SAM's `D`.\\n* `SKIP`: The skip operator indicates that this read skips a long segment of\\n  the reference, but the bases have not been deleted. This operator is\\n  commonly used when working with RNA-seq data, where reads may skip long\\n  segments of the reference between exons. This operator is equivalent to\\n  SAM's 'N'.\\n* `CLIP_SOFT`: The soft clip operator indicates that bases at the start/end\\n  of a read have not been considered during alignment. This may occur if the\\n  majority of a read maps, except for low quality bases at the start/end of\\n  a read. This operator is equivalent to SAM's 'S'. Bases that are soft clipped\\n  will still be stored in the read.\\n* `CLIP_HARD`: The hard clip operator indicates that bases at the start/end of\\n  a read have been omitted from this alignment. This may occur if this linear\\n  alignment is part of a chimeric alignment, or if the read has been trimmed\\n  (e.g., during error correction, or to trim poly-A tails for RNA-seq). This\\n  operator is equivalent to SAM's 'H'.\\n* `PAD`: The pad operator indicates that there is padding in an alignment.\\n  This operator is equivalent to SAM's 'P'.\\n* `SEQUENCE_MATCH`: This operator indicates that this portion of the aligned\\n  sequence exactly matches the reference (e.g., all bases are equal to the\\n  reference bases). This operator is equivalent to SAM's '='.\\n* `SEQUENCE_MISMATCH`: This operator indicates that this portion of the\\n  aligned sequence is an alignment match to the reference, but a sequence\\n  mismatch (e.g., the bases are not equal to the reference). This can\\n  indicate a SNP or a read error. This operator is equivalent to SAM's 'X'.\",\"symbols\":[\"ALIGNMENT_MATCH\",\"INSERT\",\"DELETE\",\"SKIP\",\"CLIP_SOFT\",\"CLIP_HARD\",\"PAD\",\"SEQUENCE_MATCH\",\"SEQUENCE_MISMATCH\"]},{\"type\":\"record\",\"name\":\"CigarUnit\",\"doc\":\"A structure for an instance of a CIGAR operation.\\n`FIXME: This belongs under Reads (only readAlignment refers to this)`\",\"fields\":[{\"name\":\"operation\",\"type\":\"CigarOperation\",\"doc\":\"The operation type.\"},{\"name\":\"operationLength\",\"type\":\"long\",\"doc\":\"The number of bases that the operation runs for.\"},{\"name\":\"referenceSequence\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"`referenceSequence` is only used at mismatches (`SEQUENCE_MISMATCH`)\\n  and deletions (`DELETE`). Filling this field replaces the MD tag.\\n  If the relevant information is not available, leave this field as `null`.\",\"default\":null}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  /** This file defines common types used in other parts of the schema.
There are no directly associated methods. */
  public interface Callback extends Common {
    public static final org.apache.avro.Protocol PROTOCOL = org.ga4gh.models.Common.PROTOCOL;
  }
}