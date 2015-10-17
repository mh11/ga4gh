/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** This request maps to the body of `POST /variantsets/search` as JSON. */
@org.apache.avro.specific.AvroGenerated
public class SearchVariantSetsRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchVariantSetsRequest\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"This request maps to the body of `POST /variantsets/search` as JSON.\",\"fields\":[{\"name\":\"datasetIds\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"If nonempty, will restrict the query to variant sets within the\\n  given datasets.\",\"default\":[]},{\"name\":\"pageSize\",\"type\":[\"null\",\"int\"],\"doc\":\"Specifies the maximum number of results to return in a single page.\\n  If unspecified, a system default will be used.\",\"default\":null},{\"name\":\"pageToken\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  To get the next page of results, set this parameter to the value of\\n  `nextPageToken` from the previous response.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** If nonempty, will restrict the query to variant sets within the
  given datasets. */
   private java.util.List<java.lang.String> datasetIds;
  /** Specifies the maximum number of results to return in a single page.
  If unspecified, a system default will be used. */
   private java.lang.Integer pageSize;
  /** The continuation token, which is used to page through large result sets.
  To get the next page of results, set this parameter to the value of
  `nextPageToken` from the previous response. */
   private java.lang.String pageToken;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SearchVariantSetsRequest() {}

  /**
   * All-args constructor.
   */
  public SearchVariantSetsRequest(java.util.List<java.lang.String> datasetIds, java.lang.Integer pageSize, java.lang.String pageToken) {
    this.datasetIds = datasetIds;
    this.pageSize = pageSize;
    this.pageToken = pageToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return datasetIds;
    case 1: return pageSize;
    case 2: return pageToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: datasetIds = (java.util.List<java.lang.String>)value$; break;
    case 1: pageSize = (java.lang.Integer)value$; break;
    case 2: pageToken = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'datasetIds' field.
   * If nonempty, will restrict the query to variant sets within the
  given datasets.   */
  public java.util.List<java.lang.String> getDatasetIds() {
    return datasetIds;
  }

  /**
   * Sets the value of the 'datasetIds' field.
   * If nonempty, will restrict the query to variant sets within the
  given datasets.   * @param value the value to set.
   */
  public void setDatasetIds(java.util.List<java.lang.String> value) {
    this.datasetIds = value;
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
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * Sets the value of the 'pageToken' field.
   * The continuation token, which is used to page through large result sets.
  To get the next page of results, set this parameter to the value of
  `nextPageToken` from the previous response.   * @param value the value to set.
   */
  public void setPageToken(java.lang.String value) {
    this.pageToken = value;
  }

  /** Creates a new SearchVariantSetsRequest RecordBuilder */
  public static org.ga4gh.methods.SearchVariantSetsRequest.Builder newBuilder() {
    return new org.ga4gh.methods.SearchVariantSetsRequest.Builder();
  }
  
  /** Creates a new SearchVariantSetsRequest RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.SearchVariantSetsRequest.Builder newBuilder(org.ga4gh.methods.SearchVariantSetsRequest.Builder other) {
    return new org.ga4gh.methods.SearchVariantSetsRequest.Builder(other);
  }
  
  /** Creates a new SearchVariantSetsRequest RecordBuilder by copying an existing SearchVariantSetsRequest instance */
  public static org.ga4gh.methods.SearchVariantSetsRequest.Builder newBuilder(org.ga4gh.methods.SearchVariantSetsRequest other) {
    return new org.ga4gh.methods.SearchVariantSetsRequest.Builder(other);
  }
  
  /**
   * RecordBuilder for SearchVariantSetsRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchVariantSetsRequest>
    implements org.apache.avro.data.RecordBuilder<SearchVariantSetsRequest> {

    private java.util.List<java.lang.String> datasetIds;
    private java.lang.Integer pageSize;
    private java.lang.String pageToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.SearchVariantSetsRequest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.SearchVariantSetsRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.datasetIds)) {
        this.datasetIds = data().deepCopy(fields()[0].schema(), other.datasetIds);
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
    
    /** Creates a Builder by copying an existing SearchVariantSetsRequest instance */
    private Builder(org.ga4gh.methods.SearchVariantSetsRequest other) {
            super(org.ga4gh.methods.SearchVariantSetsRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.datasetIds)) {
        this.datasetIds = data().deepCopy(fields()[0].schema(), other.datasetIds);
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

    /** Gets the value of the 'datasetIds' field */
    public java.util.List<java.lang.String> getDatasetIds() {
      return datasetIds;
    }
    
    /** Sets the value of the 'datasetIds' field */
    public org.ga4gh.methods.SearchVariantSetsRequest.Builder setDatasetIds(java.util.List<java.lang.String> value) {
      validate(fields()[0], value);
      this.datasetIds = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'datasetIds' field has been set */
    public boolean hasDatasetIds() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'datasetIds' field */
    public org.ga4gh.methods.SearchVariantSetsRequest.Builder clearDatasetIds() {
      datasetIds = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'pageSize' field */
    public java.lang.Integer getPageSize() {
      return pageSize;
    }
    
    /** Sets the value of the 'pageSize' field */
    public org.ga4gh.methods.SearchVariantSetsRequest.Builder setPageSize(java.lang.Integer value) {
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
    public org.ga4gh.methods.SearchVariantSetsRequest.Builder clearPageSize() {
      pageSize = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'pageToken' field */
    public java.lang.String getPageToken() {
      return pageToken;
    }
    
    /** Sets the value of the 'pageToken' field */
    public org.ga4gh.methods.SearchVariantSetsRequest.Builder setPageToken(java.lang.String value) {
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
    public org.ga4gh.methods.SearchVariantSetsRequest.Builder clearPageToken() {
      pageToken = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public SearchVariantSetsRequest build() {
      try {
        SearchVariantSetsRequest record = new SearchVariantSetsRequest();
        record.datasetIds = fieldSetFlags()[0] ? this.datasetIds : (java.util.List<java.lang.String>) defaultValue(fields()[0]);
        record.pageSize = fieldSetFlags()[1] ? this.pageSize : (java.lang.Integer) defaultValue(fields()[1]);
        record.pageToken = fieldSetFlags()[2] ? this.pageToken : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
