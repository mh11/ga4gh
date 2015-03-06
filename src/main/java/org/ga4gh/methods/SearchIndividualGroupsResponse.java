/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** This is the response from `POST /individualgroups/search` expressed as JSON. */
@org.apache.avro.specific.AvroGenerated
public class SearchIndividualGroupsResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchIndividualGroupsResponse\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"This is the response from `POST /individualgroups/search` expressed as JSON.\",\"fields\":[{\"name\":\"individualGroups\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndividualGroup\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"Represents a group of individuals. (e.g. a trio)\",\"fields\":[{\"name\":\"id\",\"type\":\"string\",\"doc\":\"The individual group UUID. This is globally unique.\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"doc\":\"The name of the individual group.\",\"default\":null},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"doc\":\"A description of the individual group.\",\"default\":null},{\"name\":\"created\",\"type\":[\"null\",\"long\"],\"doc\":\"The time at which this individual group was created in milliseconds from\\n  the epoch.\",\"default\":null},{\"name\":\"updated\",\"type\":[\"null\",\"long\"],\"doc\":\"The time at which this individual group was last updated in milliseconds\\n  from the epoch.\",\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"doc\":\"The type of individual group.\",\"default\":null},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"string\"}},\"doc\":\"A map of additional individual group information.\",\"default\":{}}]}},\"doc\":\"The list of matching individual groups.\",\"default\":[]},{\"name\":\"nextPageToken\",\"type\":[\"null\",\"string\"],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  Provide this value in a subsequent request to return the next page of\\n  results. This field will be empty if there aren't any additional results.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The list of matching individual groups. */
  @Deprecated public java.util.List<org.ga4gh.models.IndividualGroup> individualGroups;
  /** The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results. */
  @Deprecated public java.lang.CharSequence nextPageToken;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SearchIndividualGroupsResponse() {}

  /**
   * All-args constructor.
   */
  public SearchIndividualGroupsResponse(java.util.List<org.ga4gh.models.IndividualGroup> individualGroups, java.lang.CharSequence nextPageToken) {
    this.individualGroups = individualGroups;
    this.nextPageToken = nextPageToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return individualGroups;
    case 1: return nextPageToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: individualGroups = (java.util.List<org.ga4gh.models.IndividualGroup>)value$; break;
    case 1: nextPageToken = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'individualGroups' field.
   * The list of matching individual groups.   */
  public java.util.List<org.ga4gh.models.IndividualGroup> getIndividualGroups() {
    return individualGroups;
  }

  /**
   * Sets the value of the 'individualGroups' field.
   * The list of matching individual groups.   * @param value the value to set.
   */
  public void setIndividualGroups(java.util.List<org.ga4gh.models.IndividualGroup> value) {
    this.individualGroups = value;
  }

  /**
   * Gets the value of the 'nextPageToken' field.
   * The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results.   */
  public java.lang.CharSequence getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Sets the value of the 'nextPageToken' field.
   * The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results.   * @param value the value to set.
   */
  public void setNextPageToken(java.lang.CharSequence value) {
    this.nextPageToken = value;
  }

  /** Creates a new SearchIndividualGroupsResponse RecordBuilder */
  public static org.ga4gh.methods.SearchIndividualGroupsResponse.Builder newBuilder() {
    return new org.ga4gh.methods.SearchIndividualGroupsResponse.Builder();
  }
  
  /** Creates a new SearchIndividualGroupsResponse RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.SearchIndividualGroupsResponse.Builder newBuilder(org.ga4gh.methods.SearchIndividualGroupsResponse.Builder other) {
    return new org.ga4gh.methods.SearchIndividualGroupsResponse.Builder(other);
  }
  
  /** Creates a new SearchIndividualGroupsResponse RecordBuilder by copying an existing SearchIndividualGroupsResponse instance */
  public static org.ga4gh.methods.SearchIndividualGroupsResponse.Builder newBuilder(org.ga4gh.methods.SearchIndividualGroupsResponse other) {
    return new org.ga4gh.methods.SearchIndividualGroupsResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for SearchIndividualGroupsResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchIndividualGroupsResponse>
    implements org.apache.avro.data.RecordBuilder<SearchIndividualGroupsResponse> {

    private java.util.List<org.ga4gh.models.IndividualGroup> individualGroups;
    private java.lang.CharSequence nextPageToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.SearchIndividualGroupsResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.SearchIndividualGroupsResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.individualGroups)) {
        this.individualGroups = data().deepCopy(fields()[0].schema(), other.individualGroups);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SearchIndividualGroupsResponse instance */
    private Builder(org.ga4gh.methods.SearchIndividualGroupsResponse other) {
            super(org.ga4gh.methods.SearchIndividualGroupsResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.individualGroups)) {
        this.individualGroups = data().deepCopy(fields()[0].schema(), other.individualGroups);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'individualGroups' field */
    public java.util.List<org.ga4gh.models.IndividualGroup> getIndividualGroups() {
      return individualGroups;
    }
    
    /** Sets the value of the 'individualGroups' field */
    public org.ga4gh.methods.SearchIndividualGroupsResponse.Builder setIndividualGroups(java.util.List<org.ga4gh.models.IndividualGroup> value) {
      validate(fields()[0], value);
      this.individualGroups = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'individualGroups' field has been set */
    public boolean hasIndividualGroups() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'individualGroups' field */
    public org.ga4gh.methods.SearchIndividualGroupsResponse.Builder clearIndividualGroups() {
      individualGroups = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'nextPageToken' field */
    public java.lang.CharSequence getNextPageToken() {
      return nextPageToken;
    }
    
    /** Sets the value of the 'nextPageToken' field */
    public org.ga4gh.methods.SearchIndividualGroupsResponse.Builder setNextPageToken(java.lang.CharSequence value) {
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
    public org.ga4gh.methods.SearchIndividualGroupsResponse.Builder clearNextPageToken() {
      nextPageToken = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public SearchIndividualGroupsResponse build() {
      try {
        SearchIndividualGroupsResponse record = new SearchIndividualGroupsResponse();
        record.individualGroups = fieldSetFlags()[0] ? this.individualGroups : (java.util.List<org.ga4gh.models.IndividualGroup>) defaultValue(fields()[0]);
        record.nextPageToken = fieldSetFlags()[1] ? this.nextPageToken : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
