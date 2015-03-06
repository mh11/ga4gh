/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.beacon;  
@SuppressWarnings("all")
/** DataUseResource */
@org.apache.avro.specific.AvroGenerated
public class DataUseResource extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataUseResource\",\"namespace\":\"org.ga4gh.beacon\",\"doc\":\"DataUseResource\",\"fields\":[{\"name\":\"category\",\"type\":\"string\",\"doc\":\"Data Use category.\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"doc\":\"Description of Data Use category.\",\"default\":null},{\"name\":\"requirements\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataUseRequirementResource\",\"doc\":\"DataUseRequirementResource\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Data Use requirement\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"doc\":\"Description of Data Use requirement.\",\"default\":null}]}},\"doc\":\"Data Use requirements.\",\"default\":[]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Data Use category. */
  @Deprecated public java.lang.CharSequence category;
  /** Description of Data Use category. */
  @Deprecated public java.lang.CharSequence description;
  /** Data Use requirements. */
  @Deprecated public java.util.List<org.ga4gh.beacon.DataUseRequirementResource> requirements;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public DataUseResource() {}

  /**
   * All-args constructor.
   */
  public DataUseResource(java.lang.CharSequence category, java.lang.CharSequence description, java.util.List<org.ga4gh.beacon.DataUseRequirementResource> requirements) {
    this.category = category;
    this.description = description;
    this.requirements = requirements;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return category;
    case 1: return description;
    case 2: return requirements;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: category = (java.lang.CharSequence)value$; break;
    case 1: description = (java.lang.CharSequence)value$; break;
    case 2: requirements = (java.util.List<org.ga4gh.beacon.DataUseRequirementResource>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'category' field.
   * Data Use category.   */
  public java.lang.CharSequence getCategory() {
    return category;
  }

  /**
   * Sets the value of the 'category' field.
   * Data Use category.   * @param value the value to set.
   */
  public void setCategory(java.lang.CharSequence value) {
    this.category = value;
  }

  /**
   * Gets the value of the 'description' field.
   * Description of Data Use category.   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * Description of Data Use category.   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'requirements' field.
   * Data Use requirements.   */
  public java.util.List<org.ga4gh.beacon.DataUseRequirementResource> getRequirements() {
    return requirements;
  }

  /**
   * Sets the value of the 'requirements' field.
   * Data Use requirements.   * @param value the value to set.
   */
  public void setRequirements(java.util.List<org.ga4gh.beacon.DataUseRequirementResource> value) {
    this.requirements = value;
  }

  /** Creates a new DataUseResource RecordBuilder */
  public static org.ga4gh.beacon.DataUseResource.Builder newBuilder() {
    return new org.ga4gh.beacon.DataUseResource.Builder();
  }
  
  /** Creates a new DataUseResource RecordBuilder by copying an existing Builder */
  public static org.ga4gh.beacon.DataUseResource.Builder newBuilder(org.ga4gh.beacon.DataUseResource.Builder other) {
    return new org.ga4gh.beacon.DataUseResource.Builder(other);
  }
  
  /** Creates a new DataUseResource RecordBuilder by copying an existing DataUseResource instance */
  public static org.ga4gh.beacon.DataUseResource.Builder newBuilder(org.ga4gh.beacon.DataUseResource other) {
    return new org.ga4gh.beacon.DataUseResource.Builder(other);
  }
  
  /**
   * RecordBuilder for DataUseResource instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataUseResource>
    implements org.apache.avro.data.RecordBuilder<DataUseResource> {

    private java.lang.CharSequence category;
    private java.lang.CharSequence description;
    private java.util.List<org.ga4gh.beacon.DataUseRequirementResource> requirements;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.beacon.DataUseResource.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.beacon.DataUseResource.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.category)) {
        this.category = data().deepCopy(fields()[0].schema(), other.category);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.requirements)) {
        this.requirements = data().deepCopy(fields()[2].schema(), other.requirements);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing DataUseResource instance */
    private Builder(org.ga4gh.beacon.DataUseResource other) {
            super(org.ga4gh.beacon.DataUseResource.SCHEMA$);
      if (isValidValue(fields()[0], other.category)) {
        this.category = data().deepCopy(fields()[0].schema(), other.category);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.requirements)) {
        this.requirements = data().deepCopy(fields()[2].schema(), other.requirements);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'category' field */
    public java.lang.CharSequence getCategory() {
      return category;
    }
    
    /** Sets the value of the 'category' field */
    public org.ga4gh.beacon.DataUseResource.Builder setCategory(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.category = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'category' field has been set */
    public boolean hasCategory() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'category' field */
    public org.ga4gh.beacon.DataUseResource.Builder clearCategory() {
      category = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.CharSequence getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public org.ga4gh.beacon.DataUseResource.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.description = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'description' field */
    public org.ga4gh.beacon.DataUseResource.Builder clearDescription() {
      description = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'requirements' field */
    public java.util.List<org.ga4gh.beacon.DataUseRequirementResource> getRequirements() {
      return requirements;
    }
    
    /** Sets the value of the 'requirements' field */
    public org.ga4gh.beacon.DataUseResource.Builder setRequirements(java.util.List<org.ga4gh.beacon.DataUseRequirementResource> value) {
      validate(fields()[2], value);
      this.requirements = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'requirements' field has been set */
    public boolean hasRequirements() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'requirements' field */
    public org.ga4gh.beacon.DataUseResource.Builder clearRequirements() {
      requirements = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public DataUseResource build() {
      try {
        DataUseResource record = new DataUseResource();
        record.category = fieldSetFlags()[0] ? this.category : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.description = fieldSetFlags()[1] ? this.description : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.requirements = fieldSetFlags()[2] ? this.requirements : (java.util.List<org.ga4gh.beacon.DataUseRequirementResource>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}