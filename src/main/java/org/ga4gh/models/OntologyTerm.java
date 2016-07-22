/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;  
@SuppressWarnings("all")
/** An ontology term describing an attribute. (e.g. the phenotype attribute
  'polydactyly' from HPO) */
@org.apache.avro.specific.AvroGenerated
public class OntologyTerm extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OntologyTerm\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"An ontology term describing an attribute. (e.g. the phenotype attribute\\n  'polydactyly' from HPO)\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Ontology source identifier - the identifier, a CURIE (preferred) or\\n  PURL for an ontology source e.g. http://purl.obolibrary.org/obo/hp.obo\\n  It differs from the standard GA4GH schema's :ref:`id <apidesign_object_ids>`\\n  in that it is a URI pointing to an information resource outside of the scope\\n  of the schema or its resource implementation.\"},{\"name\":\"term\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology term - the representation the id is pointing to.\",\"default\":null},{\"name\":\"sourceName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology source name - the name of ontology from which the term is obtained\\n  e.g. 'Human Phenotype Ontology'\",\"default\":null},{\"name\":\"sourceVersion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology source version - the version of the ontology from which the\\n  OntologyTerm is obtained; e.g. 2.6.1.\\n  There is no standard for ontology versioning and some frequently\\n  released ontologies may use a datestamp, or build number.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Ontology source identifier - the identifier, a CURIE (preferred) or
  PURL for an ontology source e.g. http://purl.obolibrary.org/obo/hp.obo
  It differs from the standard GA4GH schema's :ref:`id <apidesign_object_ids>`
  in that it is a URI pointing to an information resource outside of the scope
  of the schema or its resource implementation. */
   private java.lang.String id;
  /** Ontology term - the representation the id is pointing to. */
   private java.lang.String term;
  /** Ontology source name - the name of ontology from which the term is obtained
  e.g. 'Human Phenotype Ontology' */
   private java.lang.String sourceName;
  /** Ontology source version - the version of the ontology from which the
  OntologyTerm is obtained; e.g. 2.6.1.
  There is no standard for ontology versioning and some frequently
  released ontologies may use a datestamp, or build number. */
   private java.lang.String sourceVersion;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public OntologyTerm() {}

  /**
   * All-args constructor.
   */
  public OntologyTerm(java.lang.String id, java.lang.String term, java.lang.String sourceName, java.lang.String sourceVersion) {
    this.id = id;
    this.term = term;
    this.sourceName = sourceName;
    this.sourceVersion = sourceVersion;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return term;
    case 2: return sourceName;
    case 3: return sourceVersion;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: term = (java.lang.String)value$; break;
    case 2: sourceName = (java.lang.String)value$; break;
    case 3: sourceVersion = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * Ontology source identifier - the identifier, a CURIE (preferred) or
  PURL for an ontology source e.g. http://purl.obolibrary.org/obo/hp.obo
  It differs from the standard GA4GH schema's :ref:`id <apidesign_object_ids>`
  in that it is a URI pointing to an information resource outside of the scope
  of the schema or its resource implementation.   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * Ontology source identifier - the identifier, a CURIE (preferred) or
  PURL for an ontology source e.g. http://purl.obolibrary.org/obo/hp.obo
  It differs from the standard GA4GH schema's :ref:`id <apidesign_object_ids>`
  in that it is a URI pointing to an information resource outside of the scope
  of the schema or its resource implementation.   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'term' field.
   * Ontology term - the representation the id is pointing to.   */
  public java.lang.String getTerm() {
    return term;
  }

  /**
   * Sets the value of the 'term' field.
   * Ontology term - the representation the id is pointing to.   * @param value the value to set.
   */
  public void setTerm(java.lang.String value) {
    this.term = value;
  }

  /**
   * Gets the value of the 'sourceName' field.
   * Ontology source name - the name of ontology from which the term is obtained
  e.g. 'Human Phenotype Ontology'   */
  public java.lang.String getSourceName() {
    return sourceName;
  }

  /**
   * Sets the value of the 'sourceName' field.
   * Ontology source name - the name of ontology from which the term is obtained
  e.g. 'Human Phenotype Ontology'   * @param value the value to set.
   */
  public void setSourceName(java.lang.String value) {
    this.sourceName = value;
  }

  /**
   * Gets the value of the 'sourceVersion' field.
   * Ontology source version - the version of the ontology from which the
  OntologyTerm is obtained; e.g. 2.6.1.
  There is no standard for ontology versioning and some frequently
  released ontologies may use a datestamp, or build number.   */
  public java.lang.String getSourceVersion() {
    return sourceVersion;
  }

  /**
   * Sets the value of the 'sourceVersion' field.
   * Ontology source version - the version of the ontology from which the
  OntologyTerm is obtained; e.g. 2.6.1.
  There is no standard for ontology versioning and some frequently
  released ontologies may use a datestamp, or build number.   * @param value the value to set.
   */
  public void setSourceVersion(java.lang.String value) {
    this.sourceVersion = value;
  }

  /** Creates a new OntologyTerm RecordBuilder */
  public static org.ga4gh.models.OntologyTerm.Builder newBuilder() {
    return new org.ga4gh.models.OntologyTerm.Builder();
  }
  
  /** Creates a new OntologyTerm RecordBuilder by copying an existing Builder */
  public static org.ga4gh.models.OntologyTerm.Builder newBuilder(org.ga4gh.models.OntologyTerm.Builder other) {
    return new org.ga4gh.models.OntologyTerm.Builder(other);
  }
  
  /** Creates a new OntologyTerm RecordBuilder by copying an existing OntologyTerm instance */
  public static org.ga4gh.models.OntologyTerm.Builder newBuilder(org.ga4gh.models.OntologyTerm other) {
    return new org.ga4gh.models.OntologyTerm.Builder(other);
  }
  
  /**
   * RecordBuilder for OntologyTerm instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OntologyTerm>
    implements org.apache.avro.data.RecordBuilder<OntologyTerm> {

    private java.lang.String id;
    private java.lang.String term;
    private java.lang.String sourceName;
    private java.lang.String sourceVersion;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.models.OntologyTerm.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.models.OntologyTerm.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.term)) {
        this.term = data().deepCopy(fields()[1].schema(), other.term);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sourceName)) {
        this.sourceName = data().deepCopy(fields()[2].schema(), other.sourceName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.sourceVersion)) {
        this.sourceVersion = data().deepCopy(fields()[3].schema(), other.sourceVersion);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing OntologyTerm instance */
    private Builder(org.ga4gh.models.OntologyTerm other) {
            super(org.ga4gh.models.OntologyTerm.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.term)) {
        this.term = data().deepCopy(fields()[1].schema(), other.term);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sourceName)) {
        this.sourceName = data().deepCopy(fields()[2].schema(), other.sourceName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.sourceVersion)) {
        this.sourceVersion = data().deepCopy(fields()[3].schema(), other.sourceVersion);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.ga4gh.models.OntologyTerm.Builder setId(java.lang.String value) {
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
    public org.ga4gh.models.OntologyTerm.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'term' field */
    public java.lang.String getTerm() {
      return term;
    }
    
    /** Sets the value of the 'term' field */
    public org.ga4gh.models.OntologyTerm.Builder setTerm(java.lang.String value) {
      validate(fields()[1], value);
      this.term = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'term' field has been set */
    public boolean hasTerm() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'term' field */
    public org.ga4gh.models.OntologyTerm.Builder clearTerm() {
      term = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'sourceName' field */
    public java.lang.String getSourceName() {
      return sourceName;
    }
    
    /** Sets the value of the 'sourceName' field */
    public org.ga4gh.models.OntologyTerm.Builder setSourceName(java.lang.String value) {
      validate(fields()[2], value);
      this.sourceName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'sourceName' field has been set */
    public boolean hasSourceName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'sourceName' field */
    public org.ga4gh.models.OntologyTerm.Builder clearSourceName() {
      sourceName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'sourceVersion' field */
    public java.lang.String getSourceVersion() {
      return sourceVersion;
    }
    
    /** Sets the value of the 'sourceVersion' field */
    public org.ga4gh.models.OntologyTerm.Builder setSourceVersion(java.lang.String value) {
      validate(fields()[3], value);
      this.sourceVersion = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'sourceVersion' field has been set */
    public boolean hasSourceVersion() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'sourceVersion' field */
    public org.ga4gh.models.OntologyTerm.Builder clearSourceVersion() {
      sourceVersion = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public OntologyTerm build() {
      try {
        OntologyTerm record = new OntologyTerm();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.term = fieldSetFlags()[1] ? this.term : (java.lang.String) defaultValue(fields()[1]);
        record.sourceName = fieldSetFlags()[2] ? this.sourceName : (java.lang.String) defaultValue(fields()[2]);
        record.sourceVersion = fieldSetFlags()[3] ? this.sourceVersion : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}