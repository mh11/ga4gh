/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;  
@SuppressWarnings("all")
/** ReadStats can be used to provide summary statistics about read data. */
@org.apache.avro.specific.AvroGenerated
public class ReadStats extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ReadStats\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"ReadStats can be used to provide summary statistics about read data.\",\"fields\":[{\"name\":\"alignedReadCount\",\"type\":[\"null\",\"long\"],\"doc\":\"The number of aligned reads.\",\"default\":null},{\"name\":\"unalignedReadCount\",\"type\":[\"null\",\"long\"],\"doc\":\"The number of unaligned reads.\",\"default\":null},{\"name\":\"baseCount\",\"type\":[\"null\",\"long\"],\"doc\":\"The total number of bases.\\n  This is equivalent to the sum of `alignedSequence.length` for all reads.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The number of aligned reads. */
   private java.lang.Long alignedReadCount;
  /** The number of unaligned reads. */
   private java.lang.Long unalignedReadCount;
  /** The total number of bases.
  This is equivalent to the sum of `alignedSequence.length` for all reads. */
   private java.lang.Long baseCount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ReadStats() {}

  /**
   * All-args constructor.
   */
  public ReadStats(java.lang.Long alignedReadCount, java.lang.Long unalignedReadCount, java.lang.Long baseCount) {
    this.alignedReadCount = alignedReadCount;
    this.unalignedReadCount = unalignedReadCount;
    this.baseCount = baseCount;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return alignedReadCount;
    case 1: return unalignedReadCount;
    case 2: return baseCount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: alignedReadCount = (java.lang.Long)value$; break;
    case 1: unalignedReadCount = (java.lang.Long)value$; break;
    case 2: baseCount = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'alignedReadCount' field.
   * The number of aligned reads.   */
  public java.lang.Long getAlignedReadCount() {
    return alignedReadCount;
  }

  /**
   * Sets the value of the 'alignedReadCount' field.
   * The number of aligned reads.   * @param value the value to set.
   */
  public void setAlignedReadCount(java.lang.Long value) {
    this.alignedReadCount = value;
  }

  /**
   * Gets the value of the 'unalignedReadCount' field.
   * The number of unaligned reads.   */
  public java.lang.Long getUnalignedReadCount() {
    return unalignedReadCount;
  }

  /**
   * Sets the value of the 'unalignedReadCount' field.
   * The number of unaligned reads.   * @param value the value to set.
   */
  public void setUnalignedReadCount(java.lang.Long value) {
    this.unalignedReadCount = value;
  }

  /**
   * Gets the value of the 'baseCount' field.
   * The total number of bases.
  This is equivalent to the sum of `alignedSequence.length` for all reads.   */
  public java.lang.Long getBaseCount() {
    return baseCount;
  }

  /**
   * Sets the value of the 'baseCount' field.
   * The total number of bases.
  This is equivalent to the sum of `alignedSequence.length` for all reads.   * @param value the value to set.
   */
  public void setBaseCount(java.lang.Long value) {
    this.baseCount = value;
  }

  /** Creates a new ReadStats RecordBuilder */
  public static org.ga4gh.models.ReadStats.Builder newBuilder() {
    return new org.ga4gh.models.ReadStats.Builder();
  }
  
  /** Creates a new ReadStats RecordBuilder by copying an existing Builder */
  public static org.ga4gh.models.ReadStats.Builder newBuilder(org.ga4gh.models.ReadStats.Builder other) {
    return new org.ga4gh.models.ReadStats.Builder(other);
  }
  
  /** Creates a new ReadStats RecordBuilder by copying an existing ReadStats instance */
  public static org.ga4gh.models.ReadStats.Builder newBuilder(org.ga4gh.models.ReadStats other) {
    return new org.ga4gh.models.ReadStats.Builder(other);
  }
  
  /**
   * RecordBuilder for ReadStats instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ReadStats>
    implements org.apache.avro.data.RecordBuilder<ReadStats> {

    private java.lang.Long alignedReadCount;
    private java.lang.Long unalignedReadCount;
    private java.lang.Long baseCount;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.models.ReadStats.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.models.ReadStats.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.alignedReadCount)) {
        this.alignedReadCount = data().deepCopy(fields()[0].schema(), other.alignedReadCount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.unalignedReadCount)) {
        this.unalignedReadCount = data().deepCopy(fields()[1].schema(), other.unalignedReadCount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.baseCount)) {
        this.baseCount = data().deepCopy(fields()[2].schema(), other.baseCount);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ReadStats instance */
    private Builder(org.ga4gh.models.ReadStats other) {
            super(org.ga4gh.models.ReadStats.SCHEMA$);
      if (isValidValue(fields()[0], other.alignedReadCount)) {
        this.alignedReadCount = data().deepCopy(fields()[0].schema(), other.alignedReadCount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.unalignedReadCount)) {
        this.unalignedReadCount = data().deepCopy(fields()[1].schema(), other.unalignedReadCount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.baseCount)) {
        this.baseCount = data().deepCopy(fields()[2].schema(), other.baseCount);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'alignedReadCount' field */
    public java.lang.Long getAlignedReadCount() {
      return alignedReadCount;
    }
    
    /** Sets the value of the 'alignedReadCount' field */
    public org.ga4gh.models.ReadStats.Builder setAlignedReadCount(java.lang.Long value) {
      validate(fields()[0], value);
      this.alignedReadCount = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'alignedReadCount' field has been set */
    public boolean hasAlignedReadCount() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'alignedReadCount' field */
    public org.ga4gh.models.ReadStats.Builder clearAlignedReadCount() {
      alignedReadCount = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'unalignedReadCount' field */
    public java.lang.Long getUnalignedReadCount() {
      return unalignedReadCount;
    }
    
    /** Sets the value of the 'unalignedReadCount' field */
    public org.ga4gh.models.ReadStats.Builder setUnalignedReadCount(java.lang.Long value) {
      validate(fields()[1], value);
      this.unalignedReadCount = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'unalignedReadCount' field has been set */
    public boolean hasUnalignedReadCount() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'unalignedReadCount' field */
    public org.ga4gh.models.ReadStats.Builder clearUnalignedReadCount() {
      unalignedReadCount = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'baseCount' field */
    public java.lang.Long getBaseCount() {
      return baseCount;
    }
    
    /** Sets the value of the 'baseCount' field */
    public org.ga4gh.models.ReadStats.Builder setBaseCount(java.lang.Long value) {
      validate(fields()[2], value);
      this.baseCount = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'baseCount' field has been set */
    public boolean hasBaseCount() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'baseCount' field */
    public org.ga4gh.models.ReadStats.Builder clearBaseCount() {
      baseCount = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public ReadStats build() {
      try {
        ReadStats record = new ReadStats();
        record.alignedReadCount = fieldSetFlags()[0] ? this.alignedReadCount : (java.lang.Long) defaultValue(fields()[0]);
        record.unalignedReadCount = fieldSetFlags()[1] ? this.unalignedReadCount : (java.lang.Long) defaultValue(fields()[1]);
        record.baseCount = fieldSetFlags()[2] ? this.baseCount : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
