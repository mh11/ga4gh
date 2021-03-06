/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;  
@SuppressWarnings("all")
/** A VariantAnnotationSet record groups VariantAnnotation records. It is derived
from a VariantSet and holds information describing the software and reference
data used in the annotation. */
@org.apache.avro.specific.AvroGenerated
public class VariantAnnotationSet extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VariantAnnotationSet\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A VariantAnnotationSet record groups VariantAnnotation records. It is derived\\nfrom a VariantSet and holds information describing the software and reference\\ndata used in the annotation.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the variant annotation set record\"},{\"name\":\"variantSetId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the variant set to which this annotation set belongs\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The variant annotation set name.\",\"default\":null},{\"name\":\"analysis\",\"type\":{\"type\":\"record\",\"name\":\"Analysis\",\"doc\":\"An analysis contains an interpretation of one or several experiments.\\n(e.g. SNVs, copy number variations, methylation status) together with\\ninformation about the methodology used.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Formats of id | name | description | accessions are described in the\\n  documentation on general attributes and formats.\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"createDateTime\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The time at which this record was created. \\n  Format: :ref:`ISO 8601 <metadata_date_time>`\",\"default\":null},{\"name\":\"updateDateTime\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The time at which this record was last updated.\\n  Format: :ref:`ISO 8601 <metadata_date_time>`\"},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The type of analysis.\",\"default\":null},{\"name\":\"software\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"The software run to generate this analysis.\",\"default\":[]},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"},\"doc\":\"A map of additional analysis information.\",\"default\":{}}]},\"doc\":\"Analysis details. It is essential to supply versions for all software and\\n  reference data used.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The ID of the variant annotation set record */
   private java.lang.String id;
  /** The ID of the variant set to which this annotation set belongs */
   private java.lang.String variantSetId;
  /** The variant annotation set name. */
   private java.lang.String name;
  /** Analysis details. It is essential to supply versions for all software and
  reference data used. */
   private org.ga4gh.models.Analysis analysis;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public VariantAnnotationSet() {}

  /**
   * All-args constructor.
   */
  public VariantAnnotationSet(java.lang.String id, java.lang.String variantSetId, java.lang.String name, org.ga4gh.models.Analysis analysis) {
    this.id = id;
    this.variantSetId = variantSetId;
    this.name = name;
    this.analysis = analysis;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return variantSetId;
    case 2: return name;
    case 3: return analysis;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: variantSetId = (java.lang.String)value$; break;
    case 2: name = (java.lang.String)value$; break;
    case 3: analysis = (org.ga4gh.models.Analysis)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * The ID of the variant annotation set record   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * The ID of the variant annotation set record   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'variantSetId' field.
   * The ID of the variant set to which this annotation set belongs   */
  public java.lang.String getVariantSetId() {
    return variantSetId;
  }

  /**
   * Sets the value of the 'variantSetId' field.
   * The ID of the variant set to which this annotation set belongs   * @param value the value to set.
   */
  public void setVariantSetId(java.lang.String value) {
    this.variantSetId = value;
  }

  /**
   * Gets the value of the 'name' field.
   * The variant annotation set name.   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * The variant annotation set name.   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'analysis' field.
   * Analysis details. It is essential to supply versions for all software and
  reference data used.   */
  public org.ga4gh.models.Analysis getAnalysis() {
    return analysis;
  }

  /**
   * Sets the value of the 'analysis' field.
   * Analysis details. It is essential to supply versions for all software and
  reference data used.   * @param value the value to set.
   */
  public void setAnalysis(org.ga4gh.models.Analysis value) {
    this.analysis = value;
  }

  /** Creates a new VariantAnnotationSet RecordBuilder */
  public static org.ga4gh.models.VariantAnnotationSet.Builder newBuilder() {
    return new org.ga4gh.models.VariantAnnotationSet.Builder();
  }
  
  /** Creates a new VariantAnnotationSet RecordBuilder by copying an existing Builder */
  public static org.ga4gh.models.VariantAnnotationSet.Builder newBuilder(org.ga4gh.models.VariantAnnotationSet.Builder other) {
    return new org.ga4gh.models.VariantAnnotationSet.Builder(other);
  }
  
  /** Creates a new VariantAnnotationSet RecordBuilder by copying an existing VariantAnnotationSet instance */
  public static org.ga4gh.models.VariantAnnotationSet.Builder newBuilder(org.ga4gh.models.VariantAnnotationSet other) {
    return new org.ga4gh.models.VariantAnnotationSet.Builder(other);
  }
  
  /**
   * RecordBuilder for VariantAnnotationSet instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VariantAnnotationSet>
    implements org.apache.avro.data.RecordBuilder<VariantAnnotationSet> {

    private java.lang.String id;
    private java.lang.String variantSetId;
    private java.lang.String name;
    private org.ga4gh.models.Analysis analysis;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.models.VariantAnnotationSet.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.models.VariantAnnotationSet.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.variantSetId)) {
        this.variantSetId = data().deepCopy(fields()[1].schema(), other.variantSetId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.analysis)) {
        this.analysis = data().deepCopy(fields()[3].schema(), other.analysis);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing VariantAnnotationSet instance */
    private Builder(org.ga4gh.models.VariantAnnotationSet other) {
            super(org.ga4gh.models.VariantAnnotationSet.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.variantSetId)) {
        this.variantSetId = data().deepCopy(fields()[1].schema(), other.variantSetId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.analysis)) {
        this.analysis = data().deepCopy(fields()[3].schema(), other.analysis);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.ga4gh.models.VariantAnnotationSet.Builder setId(java.lang.String value) {
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
    public org.ga4gh.models.VariantAnnotationSet.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'variantSetId' field */
    public java.lang.String getVariantSetId() {
      return variantSetId;
    }
    
    /** Sets the value of the 'variantSetId' field */
    public org.ga4gh.models.VariantAnnotationSet.Builder setVariantSetId(java.lang.String value) {
      validate(fields()[1], value);
      this.variantSetId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'variantSetId' field has been set */
    public boolean hasVariantSetId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'variantSetId' field */
    public org.ga4gh.models.VariantAnnotationSet.Builder clearVariantSetId() {
      variantSetId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.ga4gh.models.VariantAnnotationSet.Builder setName(java.lang.String value) {
      validate(fields()[2], value);
      this.name = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'name' field */
    public org.ga4gh.models.VariantAnnotationSet.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'analysis' field */
    public org.ga4gh.models.Analysis getAnalysis() {
      return analysis;
    }
    
    /** Sets the value of the 'analysis' field */
    public org.ga4gh.models.VariantAnnotationSet.Builder setAnalysis(org.ga4gh.models.Analysis value) {
      validate(fields()[3], value);
      this.analysis = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'analysis' field has been set */
    public boolean hasAnalysis() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'analysis' field */
    public org.ga4gh.models.VariantAnnotationSet.Builder clearAnalysis() {
      analysis = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public VariantAnnotationSet build() {
      try {
        VariantAnnotationSet record = new VariantAnnotationSet();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.variantSetId = fieldSetFlags()[1] ? this.variantSetId : (java.lang.String) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.String) defaultValue(fields()[2]);
        record.analysis = fieldSetFlags()[3] ? this.analysis : (org.ga4gh.models.Analysis) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
