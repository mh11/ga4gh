/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** This request maps to the body of `POST /allelecalls/search` as JSON. */
@org.apache.avro.specific.AvroGenerated
public class SearchAlleleCallsRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchAlleleCallsRequest\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"This request maps to the body of `POST /allelecalls/search` as JSON.\",\"fields\":[{\"name\":\"callSetIds\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"If nonempty, only return the `AlleleCall`s in these `CallSet`s.\",\"default\":[]},{\"name\":\"variantSetIds\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"If nonempty, return only `AlleleCall`s in these `VariantSet`s.\",\"default\":[]},{\"name\":\"alleleIds\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"If nonempty, return only `AlleleCall`s associated with one of these `Allele`s.\",\"default\":[]},{\"name\":\"variantIds\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"If nonempty, return only `AlleleCall`s associated with one of these\\n  `Variant`s.\",\"default\":[]},{\"name\":\"pageSize\",\"type\":[\"null\",\"int\"],\"doc\":\"Specifies the maximum number of results to return in a single page.\\n  If unspecified, a system default will be used.\",\"default\":null},{\"name\":\"pageToken\",\"type\":[\"null\",\"string\"],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  To get the next page of results, set this parameter to the value of\\n  `nextPageToken` from the previous response.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** If nonempty, only return the `AlleleCall`s in these `CallSet`s. */
  @Deprecated public java.util.List<java.lang.CharSequence> callSetIds;
  /** If nonempty, return only `AlleleCall`s in these `VariantSet`s. */
  @Deprecated public java.util.List<java.lang.CharSequence> variantSetIds;
  /** If nonempty, return only `AlleleCall`s associated with one of these `Allele`s. */
  @Deprecated public java.util.List<java.lang.CharSequence> alleleIds;
  /** If nonempty, return only `AlleleCall`s associated with one of these
  `Variant`s. */
  @Deprecated public java.util.List<java.lang.CharSequence> variantIds;
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
  public SearchAlleleCallsRequest() {}

  /**
   * All-args constructor.
   */
  public SearchAlleleCallsRequest(java.util.List<java.lang.CharSequence> callSetIds, java.util.List<java.lang.CharSequence> variantSetIds, java.util.List<java.lang.CharSequence> alleleIds, java.util.List<java.lang.CharSequence> variantIds, java.lang.Integer pageSize, java.lang.CharSequence pageToken) {
    this.callSetIds = callSetIds;
    this.variantSetIds = variantSetIds;
    this.alleleIds = alleleIds;
    this.variantIds = variantIds;
    this.pageSize = pageSize;
    this.pageToken = pageToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return callSetIds;
    case 1: return variantSetIds;
    case 2: return alleleIds;
    case 3: return variantIds;
    case 4: return pageSize;
    case 5: return pageToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: callSetIds = (java.util.List<java.lang.CharSequence>)value$; break;
    case 1: variantSetIds = (java.util.List<java.lang.CharSequence>)value$; break;
    case 2: alleleIds = (java.util.List<java.lang.CharSequence>)value$; break;
    case 3: variantIds = (java.util.List<java.lang.CharSequence>)value$; break;
    case 4: pageSize = (java.lang.Integer)value$; break;
    case 5: pageToken = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'callSetIds' field.
   * If nonempty, only return the `AlleleCall`s in these `CallSet`s.   */
  public java.util.List<java.lang.CharSequence> getCallSetIds() {
    return callSetIds;
  }

  /**
   * Sets the value of the 'callSetIds' field.
   * If nonempty, only return the `AlleleCall`s in these `CallSet`s.   * @param value the value to set.
   */
  public void setCallSetIds(java.util.List<java.lang.CharSequence> value) {
    this.callSetIds = value;
  }

  /**
   * Gets the value of the 'variantSetIds' field.
   * If nonempty, return only `AlleleCall`s in these `VariantSet`s.   */
  public java.util.List<java.lang.CharSequence> getVariantSetIds() {
    return variantSetIds;
  }

  /**
   * Sets the value of the 'variantSetIds' field.
   * If nonempty, return only `AlleleCall`s in these `VariantSet`s.   * @param value the value to set.
   */
  public void setVariantSetIds(java.util.List<java.lang.CharSequence> value) {
    this.variantSetIds = value;
  }

  /**
   * Gets the value of the 'alleleIds' field.
   * If nonempty, return only `AlleleCall`s associated with one of these `Allele`s.   */
  public java.util.List<java.lang.CharSequence> getAlleleIds() {
    return alleleIds;
  }

  /**
   * Sets the value of the 'alleleIds' field.
   * If nonempty, return only `AlleleCall`s associated with one of these `Allele`s.   * @param value the value to set.
   */
  public void setAlleleIds(java.util.List<java.lang.CharSequence> value) {
    this.alleleIds = value;
  }

  /**
   * Gets the value of the 'variantIds' field.
   * If nonempty, return only `AlleleCall`s associated with one of these
  `Variant`s.   */
  public java.util.List<java.lang.CharSequence> getVariantIds() {
    return variantIds;
  }

  /**
   * Sets the value of the 'variantIds' field.
   * If nonempty, return only `AlleleCall`s associated with one of these
  `Variant`s.   * @param value the value to set.
   */
  public void setVariantIds(java.util.List<java.lang.CharSequence> value) {
    this.variantIds = value;
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

  /** Creates a new SearchAlleleCallsRequest RecordBuilder */
  public static org.ga4gh.methods.SearchAlleleCallsRequest.Builder newBuilder() {
    return new org.ga4gh.methods.SearchAlleleCallsRequest.Builder();
  }
  
  /** Creates a new SearchAlleleCallsRequest RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.SearchAlleleCallsRequest.Builder newBuilder(org.ga4gh.methods.SearchAlleleCallsRequest.Builder other) {
    return new org.ga4gh.methods.SearchAlleleCallsRequest.Builder(other);
  }
  
  /** Creates a new SearchAlleleCallsRequest RecordBuilder by copying an existing SearchAlleleCallsRequest instance */
  public static org.ga4gh.methods.SearchAlleleCallsRequest.Builder newBuilder(org.ga4gh.methods.SearchAlleleCallsRequest other) {
    return new org.ga4gh.methods.SearchAlleleCallsRequest.Builder(other);
  }
  
  /**
   * RecordBuilder for SearchAlleleCallsRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchAlleleCallsRequest>
    implements org.apache.avro.data.RecordBuilder<SearchAlleleCallsRequest> {

    private java.util.List<java.lang.CharSequence> callSetIds;
    private java.util.List<java.lang.CharSequence> variantSetIds;
    private java.util.List<java.lang.CharSequence> alleleIds;
    private java.util.List<java.lang.CharSequence> variantIds;
    private java.lang.Integer pageSize;
    private java.lang.CharSequence pageToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.SearchAlleleCallsRequest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.SearchAlleleCallsRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.callSetIds)) {
        this.callSetIds = data().deepCopy(fields()[0].schema(), other.callSetIds);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.variantSetIds)) {
        this.variantSetIds = data().deepCopy(fields()[1].schema(), other.variantSetIds);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.alleleIds)) {
        this.alleleIds = data().deepCopy(fields()[2].schema(), other.alleleIds);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.variantIds)) {
        this.variantIds = data().deepCopy(fields()[3].schema(), other.variantIds);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.pageSize)) {
        this.pageSize = data().deepCopy(fields()[4].schema(), other.pageSize);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.pageToken)) {
        this.pageToken = data().deepCopy(fields()[5].schema(), other.pageToken);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SearchAlleleCallsRequest instance */
    private Builder(org.ga4gh.methods.SearchAlleleCallsRequest other) {
            super(org.ga4gh.methods.SearchAlleleCallsRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.callSetIds)) {
        this.callSetIds = data().deepCopy(fields()[0].schema(), other.callSetIds);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.variantSetIds)) {
        this.variantSetIds = data().deepCopy(fields()[1].schema(), other.variantSetIds);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.alleleIds)) {
        this.alleleIds = data().deepCopy(fields()[2].schema(), other.alleleIds);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.variantIds)) {
        this.variantIds = data().deepCopy(fields()[3].schema(), other.variantIds);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.pageSize)) {
        this.pageSize = data().deepCopy(fields()[4].schema(), other.pageSize);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.pageToken)) {
        this.pageToken = data().deepCopy(fields()[5].schema(), other.pageToken);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'callSetIds' field */
    public java.util.List<java.lang.CharSequence> getCallSetIds() {
      return callSetIds;
    }
    
    /** Sets the value of the 'callSetIds' field */
    public org.ga4gh.methods.SearchAlleleCallsRequest.Builder setCallSetIds(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[0], value);
      this.callSetIds = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'callSetIds' field has been set */
    public boolean hasCallSetIds() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'callSetIds' field */
    public org.ga4gh.methods.SearchAlleleCallsRequest.Builder clearCallSetIds() {
      callSetIds = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'variantSetIds' field */
    public java.util.List<java.lang.CharSequence> getVariantSetIds() {
      return variantSetIds;
    }
    
    /** Sets the value of the 'variantSetIds' field */
    public org.ga4gh.methods.SearchAlleleCallsRequest.Builder setVariantSetIds(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[1], value);
      this.variantSetIds = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'variantSetIds' field has been set */
    public boolean hasVariantSetIds() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'variantSetIds' field */
    public org.ga4gh.methods.SearchAlleleCallsRequest.Builder clearVariantSetIds() {
      variantSetIds = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'alleleIds' field */
    public java.util.List<java.lang.CharSequence> getAlleleIds() {
      return alleleIds;
    }
    
    /** Sets the value of the 'alleleIds' field */
    public org.ga4gh.methods.SearchAlleleCallsRequest.Builder setAlleleIds(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.alleleIds = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'alleleIds' field has been set */
    public boolean hasAlleleIds() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'alleleIds' field */
    public org.ga4gh.methods.SearchAlleleCallsRequest.Builder clearAlleleIds() {
      alleleIds = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'variantIds' field */
    public java.util.List<java.lang.CharSequence> getVariantIds() {
      return variantIds;
    }
    
    /** Sets the value of the 'variantIds' field */
    public org.ga4gh.methods.SearchAlleleCallsRequest.Builder setVariantIds(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[3], value);
      this.variantIds = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'variantIds' field has been set */
    public boolean hasVariantIds() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'variantIds' field */
    public org.ga4gh.methods.SearchAlleleCallsRequest.Builder clearVariantIds() {
      variantIds = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'pageSize' field */
    public java.lang.Integer getPageSize() {
      return pageSize;
    }
    
    /** Sets the value of the 'pageSize' field */
    public org.ga4gh.methods.SearchAlleleCallsRequest.Builder setPageSize(java.lang.Integer value) {
      validate(fields()[4], value);
      this.pageSize = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'pageSize' field has been set */
    public boolean hasPageSize() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'pageSize' field */
    public org.ga4gh.methods.SearchAlleleCallsRequest.Builder clearPageSize() {
      pageSize = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'pageToken' field */
    public java.lang.CharSequence getPageToken() {
      return pageToken;
    }
    
    /** Sets the value of the 'pageToken' field */
    public org.ga4gh.methods.SearchAlleleCallsRequest.Builder setPageToken(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.pageToken = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'pageToken' field has been set */
    public boolean hasPageToken() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'pageToken' field */
    public org.ga4gh.methods.SearchAlleleCallsRequest.Builder clearPageToken() {
      pageToken = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public SearchAlleleCallsRequest build() {
      try {
        SearchAlleleCallsRequest record = new SearchAlleleCallsRequest();
        record.callSetIds = fieldSetFlags()[0] ? this.callSetIds : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[0]);
        record.variantSetIds = fieldSetFlags()[1] ? this.variantSetIds : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[1]);
        record.alleleIds = fieldSetFlags()[2] ? this.alleleIds : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[2]);
        record.variantIds = fieldSetFlags()[3] ? this.variantIds : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[3]);
        record.pageSize = fieldSetFlags()[4] ? this.pageSize : (java.lang.Integer) defaultValue(fields()[4]);
        record.pageToken = fieldSetFlags()[5] ? this.pageToken : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}