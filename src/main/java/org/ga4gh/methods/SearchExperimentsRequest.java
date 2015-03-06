/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** This request maps to the body of `POST /experiments/search` as JSON. */
@org.apache.avro.specific.AvroGenerated
public class SearchExperimentsRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchExperimentsRequest\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"This request maps to the body of `POST /experiments/search` as JSON.\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"doc\":\"Only return experiments for which a substring of the name matches\\n  this string.\",\"default\":null},{\"name\":\"pageSize\",\"type\":[\"null\",\"int\"],\"doc\":\"Specifies the maximum number of results to return in a single page.\\n  If unspecified, a system default will be used.\",\"default\":null},{\"name\":\"pageToken\",\"type\":[\"null\",\"string\"],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  To get the next page of results, set this parameter to the value of\\n  `nextPageToken` from the previous response.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Only return experiments for which a substring of the name matches
  this string. */
  @Deprecated public java.lang.CharSequence name;
  /** Specifies the maximum number of results to return in a single page.
  If unspecified, a system default will be used. */
  @Deprecated public java.lang.Integer pageSize;
  /** The continuation token, which is used to page through large result sets.
  To get the next page of results, set this parameter to the value of
  `nextPageToken` from the previous response. */
  @Deprecated public java.lang.CharSequence pageToken;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SearchExperimentsRequest() {}

  /**
   * All-args constructor.
   */
  public SearchExperimentsRequest(java.lang.CharSequence name, java.lang.Integer pageSize, java.lang.CharSequence pageToken) {
    this.name = name;
    this.pageSize = pageSize;
    this.pageToken = pageToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return pageSize;
    case 2: return pageToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: pageSize = (java.lang.Integer)value$; break;
    case 2: pageToken = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * Only return experiments for which a substring of the name matches
  this string.   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Only return experiments for which a substring of the name matches
  this string.   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'pageSize' field.
   * Specifies the maximum number of results to return in a single page.
  If unspecified, a system default will be used.   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Sets the value of the 'pageSize' field.
   * Specifies the maximum number of results to return in a single page.
  If unspecified, a system default will be used.   * @param value the value to set.
   */
  public void setPageSize(java.lang.Integer value) {
    this.pageSize = value;
  }

  /**
   * Gets the value of the 'pageToken' field.
   * The continuation token, which is used to page through large result sets.
  To get the next page of results, set this parameter to the value of
  `nextPageToken` from the previous response.   */
  public java.lang.CharSequence getPageToken() {
    return pageToken;
  }

  /**
   * Sets the value of the 'pageToken' field.
   * The continuation token, which is used to page through large result sets.
  To get the next page of results, set this parameter to the value of
  `nextPageToken` from the previous response.   * @param value the value to set.
   */
  public void setPageToken(java.lang.CharSequence value) {
    this.pageToken = value;
  }

  /** Creates a new SearchExperimentsRequest RecordBuilder */
  public static org.ga4gh.methods.SearchExperimentsRequest.Builder newBuilder() {
    return new org.ga4gh.methods.SearchExperimentsRequest.Builder();
  }
  
  /** Creates a new SearchExperimentsRequest RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.SearchExperimentsRequest.Builder newBuilder(org.ga4gh.methods.SearchExperimentsRequest.Builder other) {
    return new org.ga4gh.methods.SearchExperimentsRequest.Builder(other);
  }
  
  /** Creates a new SearchExperimentsRequest RecordBuilder by copying an existing SearchExperimentsRequest instance */
  public static org.ga4gh.methods.SearchExperimentsRequest.Builder newBuilder(org.ga4gh.methods.SearchExperimentsRequest other) {
    return new org.ga4gh.methods.SearchExperimentsRequest.Builder(other);
  }
  
  /**
   * RecordBuilder for SearchExperimentsRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchExperimentsRequest>
    implements org.apache.avro.data.RecordBuilder<SearchExperimentsRequest> {

    private java.lang.CharSequence name;
    private java.lang.Integer pageSize;
    private java.lang.CharSequence pageToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.SearchExperimentsRequest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.SearchExperimentsRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.pageSize)) {
        this.pageSize = data().deepCopy(fields()[1].schema(), other.pageSize);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.pageToken)) {
        this.pageToken = data().deepCopy(fields()[2].schema(), other.pageToken);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SearchExperimentsRequest instance */
    private Builder(org.ga4gh.methods.SearchExperimentsRequest other) {
            super(org.ga4gh.methods.SearchExperimentsRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.pageSize)) {
        this.pageSize = data().deepCopy(fields()[1].schema(), other.pageSize);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.pageToken)) {
        this.pageToken = data().deepCopy(fields()[2].schema(), other.pageToken);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.ga4gh.methods.SearchExperimentsRequest.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public org.ga4gh.methods.SearchExperimentsRequest.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'pageSize' field */
    public java.lang.Integer getPageSize() {
      return pageSize;
    }
    
    /** Sets the value of the 'pageSize' field */
    public org.ga4gh.methods.SearchExperimentsRequest.Builder setPageSize(java.lang.Integer value) {
      validate(fields()[1], value);
      this.pageSize = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'pageSize' field has been set */
    public boolean hasPageSize() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'pageSize' field */
    public org.ga4gh.methods.SearchExperimentsRequest.Builder clearPageSize() {
      pageSize = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'pageToken' field */
    public java.lang.CharSequence getPageToken() {
      return pageToken;
    }
    
    /** Sets the value of the 'pageToken' field */
    public org.ga4gh.methods.SearchExperimentsRequest.Builder setPageToken(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.pageToken = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'pageToken' field has been set */
    public boolean hasPageToken() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'pageToken' field */
    public org.ga4gh.methods.SearchExperimentsRequest.Builder clearPageToken() {
      pageToken = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public SearchExperimentsRequest build() {
      try {
        SearchExperimentsRequest record = new SearchExperimentsRequest();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.pageSize = fieldSetFlags()[1] ? this.pageSize : (java.lang.Integer) defaultValue(fields()[1]);
        record.pageToken = fieldSetFlags()[2] ? this.pageToken : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
