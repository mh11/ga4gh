/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.beacon;  
@SuppressWarnings("all")
/** ErrorResource */
@org.apache.avro.specific.AvroGenerated
public class ErrorResource extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ErrorResource\",\"namespace\":\"org.ga4gh.beacon\",\"doc\":\"ErrorResource\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"allele\"},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"# observed\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** allele */
   private java.lang.String name;
  /** # observed */
   private java.lang.String description;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ErrorResource() {}

  /**
   * All-args constructor.
   */
  public ErrorResource(java.lang.String name, java.lang.String description) {
    this.name = name;
    this.description = description;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return description;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: description = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * allele   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * allele   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   * # observed   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * # observed   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /** Creates a new ErrorResource RecordBuilder */
  public static org.ga4gh.beacon.ErrorResource.Builder newBuilder() {
    return new org.ga4gh.beacon.ErrorResource.Builder();
  }
  
  /** Creates a new ErrorResource RecordBuilder by copying an existing Builder */
  public static org.ga4gh.beacon.ErrorResource.Builder newBuilder(org.ga4gh.beacon.ErrorResource.Builder other) {
    return new org.ga4gh.beacon.ErrorResource.Builder(other);
  }
  
  /** Creates a new ErrorResource RecordBuilder by copying an existing ErrorResource instance */
  public static org.ga4gh.beacon.ErrorResource.Builder newBuilder(org.ga4gh.beacon.ErrorResource other) {
    return new org.ga4gh.beacon.ErrorResource.Builder(other);
  }
  
  /**
   * RecordBuilder for ErrorResource instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ErrorResource>
    implements org.apache.avro.data.RecordBuilder<ErrorResource> {

    private java.lang.String name;
    private java.lang.String description;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.beacon.ErrorResource.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.beacon.ErrorResource.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ErrorResource instance */
    private Builder(org.ga4gh.beacon.ErrorResource other) {
            super(org.ga4gh.beacon.ErrorResource.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.ga4gh.beacon.ErrorResource.Builder setName(java.lang.String value) {
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
    public org.ga4gh.beacon.ErrorResource.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.String getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public org.ga4gh.beacon.ErrorResource.Builder setDescription(java.lang.String value) {
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
    public org.ga4gh.beacon.ErrorResource.Builder clearDescription() {
      description = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public ErrorResource build() {
      try {
        ErrorResource record = new ErrorResource();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.description = fieldSetFlags()[1] ? this.description : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
