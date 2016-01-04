/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;  
@SuppressWarnings("all")
/** A Dataset is a collection of related data of multiple types.
Data providers decide how to group data into datasets.
See [Metadata API](../api/metadata.html) for a more detailed discussion. */
@org.apache.avro.specific.AvroGenerated
public class Dataset extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Dataset\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A Dataset is a collection of related data of multiple types.\\nData providers decide how to group data into datasets.\\nSee [Metadata API](../api/metadata.html) for a more detailed discussion.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The dataset's id, locally unique to the server instance.\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of the dataset.\",\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Additional, human-readable information on the dataset.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The dataset's id, locally unique to the server instance. */
   private java.lang.String id;
  /** The name of the dataset. */
   private java.lang.String name;
  /** Additional, human-readable information on the dataset. */
   private java.lang.String description;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Dataset() {}

  /**
   * All-args constructor.
   */
  public Dataset(java.lang.String id, java.lang.String name, java.lang.String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return description;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: name = (java.lang.String)value$; break;
    case 2: description = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * The dataset's id, locally unique to the server instance.   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * The dataset's id, locally unique to the server instance.   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * The name of the dataset.   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * The name of the dataset.   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   * Additional, human-readable information on the dataset.   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * Additional, human-readable information on the dataset.   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /** Creates a new Dataset RecordBuilder */
  public static org.ga4gh.models.Dataset.Builder newBuilder() {
    return new org.ga4gh.models.Dataset.Builder();
  }
  
  /** Creates a new Dataset RecordBuilder by copying an existing Builder */
  public static org.ga4gh.models.Dataset.Builder newBuilder(org.ga4gh.models.Dataset.Builder other) {
    return new org.ga4gh.models.Dataset.Builder(other);
  }
  
  /** Creates a new Dataset RecordBuilder by copying an existing Dataset instance */
  public static org.ga4gh.models.Dataset.Builder newBuilder(org.ga4gh.models.Dataset other) {
    return new org.ga4gh.models.Dataset.Builder(other);
  }
  
  /**
   * RecordBuilder for Dataset instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Dataset>
    implements org.apache.avro.data.RecordBuilder<Dataset> {

    private java.lang.String id;
    private java.lang.String name;
    private java.lang.String description;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.models.Dataset.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.models.Dataset.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Dataset instance */
    private Builder(org.ga4gh.models.Dataset other) {
            super(org.ga4gh.models.Dataset.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.ga4gh.models.Dataset.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public org.ga4gh.models.Dataset.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.ga4gh.models.Dataset.Builder setName(java.lang.String value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public org.ga4gh.models.Dataset.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.String getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public org.ga4gh.models.Dataset.Builder setDescription(java.lang.String value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'description' field */
    public org.ga4gh.models.Dataset.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Dataset build() {
      try {
        Dataset record = new Dataset();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.String) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
