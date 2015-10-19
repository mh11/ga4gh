/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** This is the response from `POST /callsets/search` expressed as JSON. */
@org.apache.avro.specific.AvroGenerated
public class SearchCallSetsResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchCallSetsResponse\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"This is the response from `POST /callsets/search` expressed as JSON.\",\"fields\":[{\"name\":\"callSets\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CallSet\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A `CallSet` is a collection of variant calls for a particular sample.\\nIt belongs to a `VariantSet`. This is equivalent to one column in VCF.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The call set ID.\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The call set name.\",\"default\":null},{\"name\":\"sampleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The sample this call set's data was generated from.\"},{\"name\":\"variantSetIds\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"The IDs of the variant sets this call set has calls in.\",\"default\":[]},{\"name\":\"created\",\"type\":[\"null\",\"long\"],\"doc\":\"The date this call set was created in milliseconds from the epoch.\",\"default\":null},{\"name\":\"updated\",\"type\":[\"null\",\"long\"],\"doc\":\"The time at which this call set was last updated in\\n  milliseconds from the epoch.\",\"default\":null},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"},\"doc\":\"A map of additional call set information.\",\"default\":{}}]}},\"doc\":\"The list of matching call sets.\",\"default\":[]},{\"name\":\"nextPageToken\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  Provide this value in a subsequent request to return the next page of\\n  results. This field will be empty if there aren't any additional results.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The list of matching call sets. */
   private java.util.List<org.ga4gh.models.CallSet> callSets;
  /** The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results. */
   private java.lang.String nextPageToken;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SearchCallSetsResponse() {}

  /**
   * All-args constructor.
   */
  public SearchCallSetsResponse(java.util.List<org.ga4gh.models.CallSet> callSets, java.lang.String nextPageToken) {
    this.callSets = callSets;
    this.nextPageToken = nextPageToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return callSets;
    case 1: return nextPageToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: callSets = (java.util.List<org.ga4gh.models.CallSet>)value$; break;
    case 1: nextPageToken = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'callSets' field.
   * The list of matching call sets.   */
  public java.util.List<org.ga4gh.models.CallSet> getCallSets() {
    return callSets;
  }

  /**
   * Sets the value of the 'callSets' field.
   * The list of matching call sets.   * @param value the value to set.
   */
  public void setCallSets(java.util.List<org.ga4gh.models.CallSet> value) {
    this.callSets = value;
  }

  /**
   * Gets the value of the 'nextPageToken' field.
   * The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results.   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Sets the value of the 'nextPageToken' field.
   * The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results.   * @param value the value to set.
   */
  public void setNextPageToken(java.lang.String value) {
    this.nextPageToken = value;
  }

  /** Creates a new SearchCallSetsResponse RecordBuilder */
  public static org.ga4gh.methods.SearchCallSetsResponse.Builder newBuilder() {
    return new org.ga4gh.methods.SearchCallSetsResponse.Builder();
  }
  
  /** Creates a new SearchCallSetsResponse RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.SearchCallSetsResponse.Builder newBuilder(org.ga4gh.methods.SearchCallSetsResponse.Builder other) {
    return new org.ga4gh.methods.SearchCallSetsResponse.Builder(other);
  }
  
  /** Creates a new SearchCallSetsResponse RecordBuilder by copying an existing SearchCallSetsResponse instance */
  public static org.ga4gh.methods.SearchCallSetsResponse.Builder newBuilder(org.ga4gh.methods.SearchCallSetsResponse other) {
    return new org.ga4gh.methods.SearchCallSetsResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for SearchCallSetsResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchCallSetsResponse>
    implements org.apache.avro.data.RecordBuilder<SearchCallSetsResponse> {

    private java.util.List<org.ga4gh.models.CallSet> callSets;
    private java.lang.String nextPageToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.SearchCallSetsResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.SearchCallSetsResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.callSets)) {
        this.callSets = data().deepCopy(fields()[0].schema(), other.callSets);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SearchCallSetsResponse instance */
    private Builder(org.ga4gh.methods.SearchCallSetsResponse other) {
            super(org.ga4gh.methods.SearchCallSetsResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.callSets)) {
        this.callSets = data().deepCopy(fields()[0].schema(), other.callSets);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'callSets' field */
    public java.util.List<org.ga4gh.models.CallSet> getCallSets() {
      return callSets;
    }
    
    /** Sets the value of the 'callSets' field */
    public org.ga4gh.methods.SearchCallSetsResponse.Builder setCallSets(java.util.List<org.ga4gh.models.CallSet> value) {
      validate(fields()[0], value);
      this.callSets = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'callSets' field has been set */
    public boolean hasCallSets() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'callSets' field */
    public org.ga4gh.methods.SearchCallSetsResponse.Builder clearCallSets() {
      callSets = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'nextPageToken' field */
    public java.lang.String getNextPageToken() {
      return nextPageToken;
    }
    
    /** Sets the value of the 'nextPageToken' field */
    public org.ga4gh.methods.SearchCallSetsResponse.Builder setNextPageToken(java.lang.String value) {
      validate(fields()[1], value);
      this.nextPageToken = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'nextPageToken' field has been set */
    public boolean hasNextPageToken() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'nextPageToken' field */
    public org.ga4gh.methods.SearchCallSetsResponse.Builder clearNextPageToken() {
      nextPageToken = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public SearchCallSetsResponse build() {
      try {
        SearchCallSetsResponse record = new SearchCallSetsResponse();
        record.callSets = fieldSetFlags()[0] ? this.callSets : (java.util.List<org.ga4gh.models.CallSet>) defaultValue(fields()[0]);
        record.nextPageToken = fieldSetFlags()[1] ? this.nextPageToken : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
