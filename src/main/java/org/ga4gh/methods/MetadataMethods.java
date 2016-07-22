/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface MetadataMethods {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"MetadataMethods\",\"namespace\":\"org.ga4gh.methods\",\"types\":[{\"type\":\"enum\",\"name\":\"Strand\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"Indicates the DNA strand associate for some data item.\\n* `NEG_STRAND`: The negative (-) strand.\\n* `POS_STRAND`:  The postive (+) strand.\",\"symbols\":[\"NEG_STRAND\",\"POS_STRAND\"]},{\"type\":\"record\",\"name\":\"Position\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A `Position` is an unoriented base in some `Reference`. A `Position` is\\nrepresented by a `Reference` name, and a base number on that `Reference`\\n(0-based).\",\"fields\":[{\"name\":\"referenceName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The name of the `Reference` on which the `Position` is located.\"},{\"name\":\"position\",\"type\":\"long\",\"doc\":\"The 0-based offset from the start of the forward strand for that `Reference`.\\n  Genomic positions are non-negative integers less than `Reference` length.\"},{\"name\":\"strand\",\"type\":\"Strand\",\"doc\":\"Strand the position is associated with.\"}]},{\"type\":\"record\",\"name\":\"ExternalIdentifier\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"Identifier from a public database\",\"fields\":[{\"name\":\"database\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The source of the identifier.\\n  (e.g. `Ensembl`)\"},{\"name\":\"identifier\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID defined by the external database.\\n  (e.g. `ENST00000000000`)\"},{\"name\":\"version\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The version of the object or the database\\n  (e.g. `78`)\"}]},{\"type\":\"enum\",\"name\":\"CigarOperation\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"An enum for the different types of CIGAR alignment operations that exist.\\nUsed wherever CIGAR alignments are used. The different enumerated values\\nhave the following usage:\\n\\n* `ALIGNMENT_MATCH`: An alignment match indicates that a sequence can be\\n  aligned to the reference without evidence of an INDEL. Unlike the\\n  `SEQUENCE_MATCH` and `SEQUENCE_MISMATCH` operators, the `ALIGNMENT_MATCH`\\n  operator does not indicate whether the reference and read sequences are an\\n  exact match. This operator is equivalent to SAM's `M`.\\n* `INSERT`: The insert operator indicates that the read contains evidence of\\n  bases being inserted into the reference. This operator is equivalent to\\n  SAM's `I`.\\n* `DELETE`: The delete operator indicates that the read contains evidence of\\n  bases being deleted from the reference. This operator is equivalent to\\n  SAM's `D`.\\n* `SKIP`: The skip operator indicates that this read skips a long segment of\\n  the reference, but the bases have not been deleted. This operator is\\n  commonly used when working with RNA-seq data, where reads may skip long\\n  segments of the reference between exons. This operator is equivalent to\\n  SAM's 'N'.\\n* `CLIP_SOFT`: The soft clip operator indicates that bases at the start/end\\n  of a read have not been considered during alignment. This may occur if the\\n  majority of a read maps, except for low quality bases at the start/end of\\n  a read. This operator is equivalent to SAM's 'S'. Bases that are soft clipped\\n  will still be stored in the read.\\n* `CLIP_HARD`: The hard clip operator indicates that bases at the start/end of\\n  a read have been omitted from this alignment. This may occur if this linear\\n  alignment is part of a chimeric alignment, or if the read has been trimmed\\n  (e.g., during error correction, or to trim poly-A tails for RNA-seq). This\\n  operator is equivalent to SAM's 'H'.\\n* `PAD`: The pad operator indicates that there is padding in an alignment.\\n  This operator is equivalent to SAM's 'P'.\\n* `SEQUENCE_MATCH`: This operator indicates that this portion of the aligned\\n  sequence exactly matches the reference (e.g., all bases are equal to the\\n  reference bases). This operator is equivalent to SAM's '='.\\n* `SEQUENCE_MISMATCH`: This operator indicates that this portion of the\\n  aligned sequence is an alignment match to the reference, but a sequence\\n  mismatch (e.g., the bases are not equal to the reference). This can\\n  indicate a SNP or a read error. This operator is equivalent to SAM's 'X'.\",\"symbols\":[\"ALIGNMENT_MATCH\",\"INSERT\",\"DELETE\",\"SKIP\",\"CLIP_SOFT\",\"CLIP_HARD\",\"PAD\",\"SEQUENCE_MATCH\",\"SEQUENCE_MISMATCH\"]},{\"type\":\"record\",\"name\":\"CigarUnit\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A structure for an instance of a CIGAR operation.\\n`FIXME: This belongs under Reads (only readAlignment refers to this)`\",\"fields\":[{\"name\":\"operation\",\"type\":\"CigarOperation\",\"doc\":\"The operation type.\"},{\"name\":\"operationLength\",\"type\":\"long\",\"doc\":\"The number of bases that the operation runs for.\"},{\"name\":\"referenceSequence\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"`referenceSequence` is only used at mismatches (`SEQUENCE_MISMATCH`)\\n  and deletions (`DELETE`). Filling this field replaces the MD tag.\\n  If the relevant information is not available, leave this field as `null`.\",\"default\":null}]},{\"type\":\"record\",\"name\":\"OntologyTerm\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"An ontology term describing an attribute. (e.g. the phenotype attribute\\n  'polydactyly' from HPO)\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Ontology source identifier - the identifier, a CURIE (preferred) or\\n  PURL for an ontology source e.g. http://purl.obolibrary.org/obo/hp.obo\\n  It differs from the standard GA4GH schema's :ref:`id <apidesign_object_ids>`\\n  in that it is a URI pointing to an information resource outside of the scope\\n  of the schema or its resource implementation.\"},{\"name\":\"term\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology term - the representation the id is pointing to.\",\"default\":null},{\"name\":\"sourceName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology source name - the name of ontology from which the term is obtained\\n  e.g. 'Human Phenotype Ontology'\",\"default\":null},{\"name\":\"sourceVersion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology source version - the version of the ontology from which the\\n  OntologyTerm is obtained; e.g. 2.6.1.\\n  There is no standard for ontology versioning and some frequently\\n  released ontologies may use a datestamp, or build number.\",\"default\":null}]},{\"type\":\"record\",\"name\":\"Experiment\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"An experimental preparation of a sample.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The experiment UUID. This is globally unique.\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of the experiment.\",\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"A description of the experiment.\",\"default\":null},{\"name\":\"createDateTime\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The time at which this record was created. \\n  Format: :ref:`ISO 8601 <metadata_date_time>`\"},{\"name\":\"updateDateTime\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The time at which this record was last updated.\\n  Format: :ref:`ISO 8601 <metadata_date_time>`\"},{\"name\":\"runTime\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The time at which this experiment was performed.\\n  Granularity here is variable (e.g. date only).\\n  Format: :ref:`ISO 8601 <metadata_date_time>`\",\"default\":null},{\"name\":\"molecule\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The molecule examined in this experiment. (e.g. genomics DNA, total RNA)\",\"default\":null},{\"name\":\"strategy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The experiment technique or strategy applied to the sample.\\n  (e.g. whole genome sequencing, RNA-seq, RIP-seq)\",\"default\":null},{\"name\":\"selection\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The method used to enrich the target. (e.g. immunoprecipitation, size\\n  fractionation, MNase digestion)\",\"default\":null},{\"name\":\"library\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of the library used as part of this experiment.\"",",\"default\":null},{\"name\":\"libraryLayout\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The configuration of sequenced reads. (e.g. Single or Paired)\",\"default\":null},{\"name\":\"instrumentModel\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The instrument model used as part of this experiment.\\n    This maps to sequencing technology in BAM.\"},{\"name\":\"instrumentDataFile\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The data file generated by the instrument.\\n  TODO: This isn't actually a file is it?\\n  Should this be `instrumentData` instead?\",\"default\":null},{\"name\":\"sequencingCenter\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The sequencing center used as part of this experiment.\"},{\"name\":\"platformUnit\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The platform unit used as part of this experiment. This is a flowcell-barcode\\n  or slide unique identifier.\",\"default\":null},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"},\"doc\":\"A map of additional experiment information.\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"Dataset\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A Dataset is a collection of related data of multiple types.\\nData providers decide how to group data into datasets.\\nSee [Metadata API](../api/metadata.html) for a more detailed discussion.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The dataset's id, locally unique to the server instance.\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of the dataset.\",\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Additional, human-readable information on the dataset.\",\"default\":null}]},{\"type\":\"record\",\"name\":\"Analysis\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"An analysis contains an interpretation of one or several experiments.\\n(e.g. SNVs, copy number variations, methylation status) together with\\ninformation about the methodology used.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Formats of id | name | description | accessions are described in the\\n  documentation on general attributes and formats.\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"createDateTime\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The time at which this record was created. \\n  Format: :ref:`ISO 8601 <metadata_date_time>`\",\"default\":null},{\"name\":\"updateDateTime\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The time at which this record was last updated.\\n  Format: :ref:`ISO 8601 <metadata_date_time>`\"},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The type of analysis.\",\"default\":null},{\"name\":\"software\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"The software run to generate this analysis.\",\"default\":[]},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"},\"doc\":\"A map of additional analysis information.\",\"default\":{}}]},{\"type\":\"error\",\"name\":\"GAException\",\"doc\":\"A general exception type.\",\"fields\":[{\"name\":\"message\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The error message\"},{\"name\":\"errorCode\",\"type\":\"int\",\"doc\":\"The numerical error code\",\"default\":-1}]},{\"type\":\"record\",\"name\":\"SearchDatasetsRequest\",\"doc\":\"This request maps to the body of `POST /datasets/search` as JSON.\",\"fields\":[{\"name\":\"pageSize\",\"type\":[\"null\",\"int\"],\"doc\":\"Specifies the maximum number of results to return in a single page.\\n  If unspecified, a system default will be used.\",\"default\":null},{\"name\":\"pageToken\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  To get the next page of results, set this parameter to the value of\\n  `nextPageToken` from the previous response.\",\"default\":null}]},{\"type\":\"record\",\"name\":\"SearchDatasetsResponse\",\"doc\":\"This is the response from `POST /datasets/search` expressed as JSON.\",\"fields\":[{\"name\":\"datasets\",\"type\":{\"type\":\"array\",\"items\":\"org.ga4gh.models.Dataset\"},\"doc\":\"The list of datasets.\",\"default\":[]},{\"name\":\"nextPageToken\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  Provide this value in a subsequent request to return the next page of\\n  results. This field will be empty if there aren't any additional results.\",\"default\":null}]}],\"messages\":{\"searchDatasets\":{\"doc\":\"Gets a list of datasets accessible through the API.\\n\\nTODO: Reads and variants both want to have datasets. Are they the same object?\\n\\n`POST /datasets/search` must accept a JSON version of\\n`SearchDatasetsRequest` as the post body and will return a JSON version\\nof `SearchDatasetsResponse`.\",\"request\":[{\"name\":\"request\",\"type\":\"SearchDatasetsRequest\"}],\"response\":\"SearchDatasetsResponse\",\"errors\":[\"GAException\"]},\"getDataset\":{\"doc\":\"Gets a `Dataset` by ID.\\n`GET /datasets/{id}` will return a JSON version of `Dataset`.\",\"request\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"org.ga4gh.models.Dataset\",\"errors\":[\"GAException\"]}}}");
  /** Gets a list of datasets accessible through the API.

TODO: Reads and variants both want to have datasets. Are they the same object?

`POST /datasets/search` must accept a JSON version of
`SearchDatasetsRequest` as the post body and will return a JSON version
of `SearchDatasetsResponse`. */
  org.ga4gh.methods.SearchDatasetsResponse searchDatasets(org.ga4gh.methods.SearchDatasetsRequest request) throws org.apache.avro.AvroRemoteException, org.ga4gh.methods.GAException;
  /** Gets a `Dataset` by ID.
`GET /datasets/{id}` will return a JSON version of `Dataset`. */
  org.ga4gh.models.Dataset getDataset(java.lang.String id) throws org.apache.avro.AvroRemoteException, org.ga4gh.methods.GAException;

  @SuppressWarnings("all")
  public interface Callback extends MetadataMethods {
    public static final org.apache.avro.Protocol PROTOCOL = org.ga4gh.methods.MetadataMethods.PROTOCOL;
    /** Gets a list of datasets accessible through the API.

TODO: Reads and variants both want to have datasets. Are they the same object?

`POST /datasets/search` must accept a JSON version of
`SearchDatasetsRequest` as the post body and will return a JSON version
of `SearchDatasetsResponse`. */
    void searchDatasets(org.ga4gh.methods.SearchDatasetsRequest request, org.apache.avro.ipc.Callback<org.ga4gh.methods.SearchDatasetsResponse> callback) throws java.io.IOException;
    /** Gets a `Dataset` by ID.
`GET /datasets/{id}` will return a JSON version of `Dataset`. */
    void getDataset(java.lang.String id, org.apache.avro.ipc.Callback<org.ga4gh.models.Dataset> callback) throws java.io.IOException;
  }
}