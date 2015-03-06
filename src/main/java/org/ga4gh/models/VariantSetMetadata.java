/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;  
@SuppressWarnings("all")
/** This metadata represents VCF header information. */
@org.apache.avro.specific.AvroGenerated
public class VariantSetMetadata extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VariantSetMetadata\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"This metadata represents VCF header information.\",\"fields\":[{\"name\":\"key\",\"type\":\"string\",\"doc\":\"The top-level key.\"},{\"name\":\"value\",\"type\":\"string\",\"doc\":\"The value field for simple metadata.\"},{\"name\":\"id\",\"type\":\"string\",\"doc\":\"User-provided ID field, not enforced by this API.\\n  Two or more pieces of structured metadata with identical\\n  id and key fields are considered equivalent.\"},{\"name\":\"type\",\"type\":\"string\",\"doc\":\"The type of data.\"},{\"name\":\"number\",\"type\":\"string\",\"doc\":\"The number of values that can be included in a field described by this\\n  metadata.\"},{\"name\":\"description\",\"type\":\"string\",\"doc\":\"A textual description of this metadata.\"},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"string\"}},\"doc\":\"Remaining structured metadata key-value pairs.\",\"default\":{}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The top-level key. */
  @Deprecated public java.lang.CharSequence key;
  /** The value field for simple metadata. */
  @Deprecated public java.lang.CharSequence value;
  /** User-provided ID field, not enforced by this API.
  Two or more pieces of structured metadata with identical
  id and key fields are considered equivalent. */
  @Deprecated public java.lang.CharSequence id;
  /** The type of data. */
  @Deprecated public java.lang.CharSequence type;
  /** The number of values that can be included in a field described by this
  metadata. */
  @Deprecated public java.lang.CharSequence number;
  /** A textual description of this metadata. */
  @Deprecated public java.lang.CharSequence description;
  /** Remaining structured metadata key-value pairs. */
  @Deprecated public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> info;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public VariantSetMetadata() {}

  /**
   * All-args constructor.
   */
  public VariantSetMetadata(java.lang.CharSequence key, java.lang.CharSequence value, java.lang.CharSequence id, java.lang.CharSequence type, java.lang.CharSequence number, java.lang.CharSequence description, java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> info) {
    this.key = key;
    this.value = value;
    this.id = id;
    this.type = type;
    this.number = number;
    this.description = description;
    this.info = info;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return key;
    case 1: return value;
    case 2: return id;
    case 3: return type;
    case 4: return number;
    case 5: return description;
    case 6: return info;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: key = (java.lang.CharSequence)value$; break;
    case 1: value = (java.lang.CharSequence)value$; break;
    case 2: id = (java.lang.CharSequence)value$; break;
    case 3: type = (java.lang.CharSequence)value$; break;
    case 4: number = (java.lang.CharSequence)value$; break;
    case 5: description = (java.lang.CharSequence)value$; break;
    case 6: info = (java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'key' field.
   * The top-level key.   */
  public java.lang.CharSequence getKey() {
    return key;
  }

  /**
   * Sets the value of the 'key' field.
   * The top-level key.   * @param value the value to set.
   */
  public void setKey(java.lang.CharSequence value) {
    this.key = value;
  }

  /**
   * Gets the value of the 'value' field.
   * The value field for simple metadata.   */
  public java.lang.CharSequence getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * The value field for simple metadata.   * @param value the value to set.
   */
  public void setValue(java.lang.CharSequence value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'id' field.
   * User-provided ID field, not enforced by this API.
  Two or more pieces of structured metadata with identical
  id and key fields are considered equivalent.   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * User-provided ID field, not enforced by this API.
  Two or more pieces of structured metadata with identical
  id and key fields are considered equivalent.   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'type' field.
   * The type of data.   */
  public java.lang.CharSequence getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * The type of data.   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'number' field.
   * The number of values that can be included in a field described by this
  metadata.   */
  public java.lang.CharSequence getNumber() {
    return number;
  }

  /**
   * Sets the value of the 'number' field.
   * The number of values that can be included in a field described by this
  metadata.   * @param value the value to set.
   */
  public void setNumber(java.lang.CharSequence value) {
    this.number = value;
  }

  /**
   * Gets the value of the 'description' field.
   * A textual description of this metadata.   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * A textual description of this metadata.   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'info' field.
   * Remaining structured metadata key-value pairs.   */
  public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> getInfo() {
    return info;
  }

  /**
   * Sets the value of the 'info' field.
   * Remaining structured metadata key-value pairs.   * @param value the value to set.
   */
  public void setInfo(java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> value) {
    this.info = value;
  }

  /** Creates a new VariantSetMetadata RecordBuilder */
  public static org.ga4gh.models.VariantSetMetadata.Builder newBuilder() {
    return new org.ga4gh.models.VariantSetMetadata.Builder();
  }
  
  /** Creates a new VariantSetMetadata RecordBuilder by copying an existing Builder */
  public static org.ga4gh.models.VariantSetMetadata.Builder newBuilder(org.ga4gh.models.VariantSetMetadata.Builder other) {
    return new org.ga4gh.models.VariantSetMetadata.Builder(other);
  }
  
  /** Creates a new VariantSetMetadata RecordBuilder by copying an existing VariantSetMetadata instance */
  public static org.ga4gh.models.VariantSetMetadata.Builder newBuilder(org.ga4gh.models.VariantSetMetadata other) {
    return new org.ga4gh.models.VariantSetMetadata.Builder(other);
  }
  
  /**
   * RecordBuilder for VariantSetMetadata instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VariantSetMetadata>
    implements org.apache.avro.data.RecordBuilder<VariantSetMetadata> {

    private java.lang.CharSequence key;
    private java.lang.CharSequence value;
    private java.lang.CharSequence id;
    private java.lang.CharSequence type;
    private java.lang.CharSequence number;
    private java.lang.CharSequence description;
    private java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> info;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.models.VariantSetMetadata.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.models.VariantSetMetadata.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.id)) {
        this.id = data().deepCopy(fields()[2].schema(), other.id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.number)) {
        this.number = data().deepCopy(fields()[4].schema(), other.number);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.description)) {
        this.description = data().deepCopy(fields()[5].schema(), other.description);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.info)) {
        this.info = data().deepCopy(fields()[6].schema(), other.info);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing VariantSetMetadata instance */
    private Builder(org.ga4gh.models.VariantSetMetadata other) {
            super(org.ga4gh.models.VariantSetMetadata.SCHEMA$);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.id)) {
        this.id = data().deepCopy(fields()[2].schema(), other.id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.number)) {
        this.number = data().deepCopy(fields()[4].schema(), other.number);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.description)) {
        this.description = data().deepCopy(fields()[5].schema(), other.description);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.info)) {
        this.info = data().deepCopy(fields()[6].schema(), other.info);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'key' field */
    public java.lang.CharSequence getKey() {
      return key;
    }
    
    /** Sets the value of the 'key' field */
    public org.ga4gh.models.VariantSetMetadata.Builder setKey(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.key = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'key' field has been set */
    public boolean hasKey() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'key' field */
    public org.ga4gh.models.VariantSetMetadata.Builder clearKey() {
      key = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'value' field */
    public java.lang.CharSequence getValue() {
      return value;
    }
    
    /** Sets the value of the 'value' field */
    public org.ga4gh.models.VariantSetMetadata.Builder setValue(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.value = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'value' field has been set */
    public boolean hasValue() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'value' field */
    public org.ga4gh.models.VariantSetMetadata.Builder clearValue() {
      value = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.ga4gh.models.VariantSetMetadata.Builder setId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.id = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'id' field */
    public org.ga4gh.models.VariantSetMetadata.Builder clearId() {
      id = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public java.lang.CharSequence getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public org.ga4gh.models.VariantSetMetadata.Builder setType(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.type = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'type' field */
    public org.ga4gh.models.VariantSetMetadata.Builder clearType() {
      type = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'number' field */
    public java.lang.CharSequence getNumber() {
      return number;
    }
    
    /** Sets the value of the 'number' field */
    public org.ga4gh.models.VariantSetMetadata.Builder setNumber(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.number = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'number' field has been set */
    public boolean hasNumber() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'number' field */
    public org.ga4gh.models.VariantSetMetadata.Builder clearNumber() {
      number = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.CharSequence getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public org.ga4gh.models.VariantSetMetadata.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.description = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'description' field */
    public org.ga4gh.models.VariantSetMetadata.Builder clearDescription() {
      description = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'info' field */
    public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> getInfo() {
      return info;
    }
    
    /** Sets the value of the 'info' field */
    public org.ga4gh.models.VariantSetMetadata.Builder setInfo(java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> value) {
      validate(fields()[6], value);
      this.info = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'info' field has been set */
    public boolean hasInfo() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'info' field */
    public org.ga4gh.models.VariantSetMetadata.Builder clearInfo() {
      info = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public VariantSetMetadata build() {
      try {
        VariantSetMetadata record = new VariantSetMetadata();
        record.key = fieldSetFlags()[0] ? this.key : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.value = fieldSetFlags()[1] ? this.value : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.id = fieldSetFlags()[2] ? this.id : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.type = fieldSetFlags()[3] ? this.type : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.number = fieldSetFlags()[4] ? this.number : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.description = fieldSetFlags()[5] ? this.description : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.info = fieldSetFlags()[6] ? this.info : (java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>>) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
