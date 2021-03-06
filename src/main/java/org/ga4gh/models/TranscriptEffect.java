/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;  
@SuppressWarnings("all")
/** A transcript effect record is a set of information describing the
effect of an allele on a transcript */
@org.apache.avro.specific.AvroGenerated
public class TranscriptEffect extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TranscriptEffect\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A transcript effect record is a set of information describing the\\neffect of an allele on a transcript\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the transcript effect record\"},{\"name\":\"featureId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The id of the transcript feature the annotation is relative to\"},{\"name\":\"alternateBases\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Alternate allele - a variant may have more than one alternate allele,\\n  each of which will have distinct annotation.\",\"default\":null},{\"name\":\"effects\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OntologyTerm\",\"doc\":\"An ontology term describing an attribute. (e.g. the phenotype attribute\\n  'polydactyly' from HPO)\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Ontology source identifier - the identifier, a CURIE (preferred) or\\n  PURL for an ontology source e.g. http://purl.obolibrary.org/obo/hp.obo\\n  It differs from the standard GA4GH schema's :ref:`id <apidesign_object_ids>`\\n  in that it is a URI pointing to an information resource outside of the scope\\n  of the schema or its resource implementation.\"},{\"name\":\"term\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology term - the representation the id is pointing to.\",\"default\":null},{\"name\":\"sourceName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology source name - the name of ontology from which the term is obtained\\n  e.g. 'Human Phenotype Ontology'\",\"default\":null},{\"name\":\"sourceVersion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology source version - the version of the ontology from which the\\n  OntologyTerm is obtained; e.g. 2.6.1.\\n  There is no standard for ontology versioning and some frequently\\n  released ontologies may use a datestamp, or build number.\",\"default\":null}]}},\"doc\":\"Effect of variant on this feature\"},{\"name\":\"hgvsAnnotation\",\"type\":{\"type\":\"record\",\"name\":\"HGVSAnnotation\",\"doc\":\"A HGVSAnnotation record holds Human Genome Variation Society descriptions\\nof the sequence change with respect to genomic, transcript and protein\\nsequences. See: http://www.hgvs.org/mutnomen/recs.html.\\nDescriptions should be provided at genomic level. Descriptions at transcript\\nlevel should be provided when the allele lies within a transcript. Descriptions\\nat protein level should be provided when the allele lies within the translated\\nsequence or stop codon.\",\"fields\":[{\"name\":\"genomic\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"transcript\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"protein\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]},\"doc\":\"Human Genome Variation Society variant descriptions\"},{\"name\":\"cDNALocation\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AlleleLocation\",\"doc\":\"An allele location record holds the location of an allele relative to a\\nnon-genomic coordinate system such as a CDS or protein and holds the\\nreference and alternate sequence where appropriate\",\"fields\":[{\"name\":\"start\",\"type\":\"int\",\"doc\":\"Relative start position of the allele in this coordinate system\"},{\"name\":\"end\",\"type\":[\"null\",\"int\"],\"doc\":\"Relative end position of the allele in this coordinate system\",\"default\":null},{\"name\":\"referenceSequence\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Reference sequence in feature (this should be the codon at CDS level)\",\"default\":null},{\"name\":\"alternateSequence\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Alternate sequence in feature (this should be the codon at CDS level)\",\"default\":null}]}],\"doc\":\"Change relative to cDNA\",\"default\":null},{\"name\":\"CDSLocation\",\"type\":[\"null\",\"AlleleLocation\"],\"default\":null},{\"name\":\"proteinLocation\",\"type\":[\"null\",\"AlleleLocation\"],\"doc\":\"Change relative to protein\",\"default\":null},{\"name\":\"analysisResults\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AnalysisResult\",\"doc\":\"An AnalysisResult record holds the output of a prediction package such\\nas SIFT on a specific allele.\",\"fields\":[{\"name\":\"analysisId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the analysis record for this result\"},{\"name\":\"result\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The text-based result for this analysis\"},{\"name\":\"score\",\"type\":[\"null\",\"int\"],\"doc\":\"The numeric score for this analysis\"}]}},\"doc\":\"Output from prediction packages such as SIFT\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The ID of the transcript effect record */
   private java.lang.String id;
  /** The id of the transcript feature the annotation is relative to */
   private java.lang.String featureId;
  /** Alternate allele - a variant may have more than one alternate allele,
  each of which will have distinct annotation. */
   private java.lang.String alternateBases;
  /** Effect of variant on this feature */
   private java.util.List<org.ga4gh.models.OntologyTerm> effects;
  /** Human Genome Variation Society variant descriptions */
   private org.ga4gh.models.HGVSAnnotation hgvsAnnotation;
  /** Change relative to cDNA */
   private org.ga4gh.models.AlleleLocation cDNALocation;
   private org.ga4gh.models.AlleleLocation CDSLocation;
  /** Change relative to protein */
   private org.ga4gh.models.AlleleLocation proteinLocation;
  /** Output from prediction packages such as SIFT */
   private java.util.List<org.ga4gh.models.AnalysisResult> analysisResults;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public TranscriptEffect() {}

  /**
   * All-args constructor.
   */
  public TranscriptEffect(java.lang.String id, java.lang.String featureId, java.lang.String alternateBases, java.util.List<org.ga4gh.models.OntologyTerm> effects, org.ga4gh.models.HGVSAnnotation hgvsAnnotation, org.ga4gh.models.AlleleLocation cDNALocation, org.ga4gh.models.AlleleLocation CDSLocation, org.ga4gh.models.AlleleLocation proteinLocation, java.util.List<org.ga4gh.models.AnalysisResult> analysisResults) {
    this.id = id;
    this.featureId = featureId;
    this.alternateBases = alternateBases;
    this.effects = effects;
    this.hgvsAnnotation = hgvsAnnotation;
    this.cDNALocation = cDNALocation;
    this.CDSLocation = CDSLocation;
    this.proteinLocation = proteinLocation;
    this.analysisResults = analysisResults;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return featureId;
    case 2: return alternateBases;
    case 3: return effects;
    case 4: return hgvsAnnotation;
    case 5: return cDNALocation;
    case 6: return CDSLocation;
    case 7: return proteinLocation;
    case 8: return analysisResults;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: featureId = (java.lang.String)value$; break;
    case 2: alternateBases = (java.lang.String)value$; break;
    case 3: effects = (java.util.List<org.ga4gh.models.OntologyTerm>)value$; break;
    case 4: hgvsAnnotation = (org.ga4gh.models.HGVSAnnotation)value$; break;
    case 5: cDNALocation = (org.ga4gh.models.AlleleLocation)value$; break;
    case 6: CDSLocation = (org.ga4gh.models.AlleleLocation)value$; break;
    case 7: proteinLocation = (org.ga4gh.models.AlleleLocation)value$; break;
    case 8: analysisResults = (java.util.List<org.ga4gh.models.AnalysisResult>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * The ID of the transcript effect record   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * The ID of the transcript effect record   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'featureId' field.
   * The id of the transcript feature the annotation is relative to   */
  public java.lang.String getFeatureId() {
    return featureId;
  }

  /**
   * Sets the value of the 'featureId' field.
   * The id of the transcript feature the annotation is relative to   * @param value the value to set.
   */
  public void setFeatureId(java.lang.String value) {
    this.featureId = value;
  }

  /**
   * Gets the value of the 'alternateBases' field.
   * Alternate allele - a variant may have more than one alternate allele,
  each of which will have distinct annotation.   */
  public java.lang.String getAlternateBases() {
    return alternateBases;
  }

  /**
   * Sets the value of the 'alternateBases' field.
   * Alternate allele - a variant may have more than one alternate allele,
  each of which will have distinct annotation.   * @param value the value to set.
   */
  public void setAlternateBases(java.lang.String value) {
    this.alternateBases = value;
  }

  /**
   * Gets the value of the 'effects' field.
   * Effect of variant on this feature   */
  public java.util.List<org.ga4gh.models.OntologyTerm> getEffects() {
    return effects;
  }

  /**
   * Sets the value of the 'effects' field.
   * Effect of variant on this feature   * @param value the value to set.
   */
  public void setEffects(java.util.List<org.ga4gh.models.OntologyTerm> value) {
    this.effects = value;
  }

  /**
   * Gets the value of the 'hgvsAnnotation' field.
   * Human Genome Variation Society variant descriptions   */
  public org.ga4gh.models.HGVSAnnotation getHgvsAnnotation() {
    return hgvsAnnotation;
  }

  /**
   * Sets the value of the 'hgvsAnnotation' field.
   * Human Genome Variation Society variant descriptions   * @param value the value to set.
   */
  public void setHgvsAnnotation(org.ga4gh.models.HGVSAnnotation value) {
    this.hgvsAnnotation = value;
  }

  /**
   * Gets the value of the 'cDNALocation' field.
   * Change relative to cDNA   */
  public org.ga4gh.models.AlleleLocation getCDNALocation() {
    return cDNALocation;
  }

  /**
   * Sets the value of the 'cDNALocation' field.
   * Change relative to cDNA   * @param value the value to set.
   */
  public void setCDNALocation(org.ga4gh.models.AlleleLocation value) {
    this.cDNALocation = value;
  }

  /**
   * Gets the value of the 'CDSLocation' field.
   */
  public org.ga4gh.models.AlleleLocation getCDSLocation() {
    return CDSLocation;
  }

  /**
   * Sets the value of the 'CDSLocation' field.
   * @param value the value to set.
   */
  public void setCDSLocation(org.ga4gh.models.AlleleLocation value) {
    this.CDSLocation = value;
  }

  /**
   * Gets the value of the 'proteinLocation' field.
   * Change relative to protein   */
  public org.ga4gh.models.AlleleLocation getProteinLocation() {
    return proteinLocation;
  }

  /**
   * Sets the value of the 'proteinLocation' field.
   * Change relative to protein   * @param value the value to set.
   */
  public void setProteinLocation(org.ga4gh.models.AlleleLocation value) {
    this.proteinLocation = value;
  }

  /**
   * Gets the value of the 'analysisResults' field.
   * Output from prediction packages such as SIFT   */
  public java.util.List<org.ga4gh.models.AnalysisResult> getAnalysisResults() {
    return analysisResults;
  }

  /**
   * Sets the value of the 'analysisResults' field.
   * Output from prediction packages such as SIFT   * @param value the value to set.
   */
  public void setAnalysisResults(java.util.List<org.ga4gh.models.AnalysisResult> value) {
    this.analysisResults = value;
  }

  /** Creates a new TranscriptEffect RecordBuilder */
  public static org.ga4gh.models.TranscriptEffect.Builder newBuilder() {
    return new org.ga4gh.models.TranscriptEffect.Builder();
  }
  
  /** Creates a new TranscriptEffect RecordBuilder by copying an existing Builder */
  public static org.ga4gh.models.TranscriptEffect.Builder newBuilder(org.ga4gh.models.TranscriptEffect.Builder other) {
    return new org.ga4gh.models.TranscriptEffect.Builder(other);
  }
  
  /** Creates a new TranscriptEffect RecordBuilder by copying an existing TranscriptEffect instance */
  public static org.ga4gh.models.TranscriptEffect.Builder newBuilder(org.ga4gh.models.TranscriptEffect other) {
    return new org.ga4gh.models.TranscriptEffect.Builder(other);
  }
  
  /**
   * RecordBuilder for TranscriptEffect instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TranscriptEffect>
    implements org.apache.avro.data.RecordBuilder<TranscriptEffect> {

    private java.lang.String id;
    private java.lang.String featureId;
    private java.lang.String alternateBases;
    private java.util.List<org.ga4gh.models.OntologyTerm> effects;
    private org.ga4gh.models.HGVSAnnotation hgvsAnnotation;
    private org.ga4gh.models.AlleleLocation cDNALocation;
    private org.ga4gh.models.AlleleLocation CDSLocation;
    private org.ga4gh.models.AlleleLocation proteinLocation;
    private java.util.List<org.ga4gh.models.AnalysisResult> analysisResults;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.models.TranscriptEffect.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.models.TranscriptEffect.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.featureId)) {
        this.featureId = data().deepCopy(fields()[1].schema(), other.featureId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.alternateBases)) {
        this.alternateBases = data().deepCopy(fields()[2].schema(), other.alternateBases);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.effects)) {
        this.effects = data().deepCopy(fields()[3].schema(), other.effects);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.hgvsAnnotation)) {
        this.hgvsAnnotation = data().deepCopy(fields()[4].schema(), other.hgvsAnnotation);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.cDNALocation)) {
        this.cDNALocation = data().deepCopy(fields()[5].schema(), other.cDNALocation);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.CDSLocation)) {
        this.CDSLocation = data().deepCopy(fields()[6].schema(), other.CDSLocation);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.proteinLocation)) {
        this.proteinLocation = data().deepCopy(fields()[7].schema(), other.proteinLocation);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.analysisResults)) {
        this.analysisResults = data().deepCopy(fields()[8].schema(), other.analysisResults);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing TranscriptEffect instance */
    private Builder(org.ga4gh.models.TranscriptEffect other) {
            super(org.ga4gh.models.TranscriptEffect.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.featureId)) {
        this.featureId = data().deepCopy(fields()[1].schema(), other.featureId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.alternateBases)) {
        this.alternateBases = data().deepCopy(fields()[2].schema(), other.alternateBases);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.effects)) {
        this.effects = data().deepCopy(fields()[3].schema(), other.effects);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.hgvsAnnotation)) {
        this.hgvsAnnotation = data().deepCopy(fields()[4].schema(), other.hgvsAnnotation);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.cDNALocation)) {
        this.cDNALocation = data().deepCopy(fields()[5].schema(), other.cDNALocation);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.CDSLocation)) {
        this.CDSLocation = data().deepCopy(fields()[6].schema(), other.CDSLocation);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.proteinLocation)) {
        this.proteinLocation = data().deepCopy(fields()[7].schema(), other.proteinLocation);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.analysisResults)) {
        this.analysisResults = data().deepCopy(fields()[8].schema(), other.analysisResults);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.ga4gh.models.TranscriptEffect.Builder setId(java.lang.String value) {
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
    public org.ga4gh.models.TranscriptEffect.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'featureId' field */
    public java.lang.String getFeatureId() {
      return featureId;
    }
    
    /** Sets the value of the 'featureId' field */
    public org.ga4gh.models.TranscriptEffect.Builder setFeatureId(java.lang.String value) {
      validate(fields()[1], value);
      this.featureId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'featureId' field has been set */
    public boolean hasFeatureId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'featureId' field */
    public org.ga4gh.models.TranscriptEffect.Builder clearFeatureId() {
      featureId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'alternateBases' field */
    public java.lang.String getAlternateBases() {
      return alternateBases;
    }
    
    /** Sets the value of the 'alternateBases' field */
    public org.ga4gh.models.TranscriptEffect.Builder setAlternateBases(java.lang.String value) {
      validate(fields()[2], value);
      this.alternateBases = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'alternateBases' field has been set */
    public boolean hasAlternateBases() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'alternateBases' field */
    public org.ga4gh.models.TranscriptEffect.Builder clearAlternateBases() {
      alternateBases = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'effects' field */
    public java.util.List<org.ga4gh.models.OntologyTerm> getEffects() {
      return effects;
    }
    
    /** Sets the value of the 'effects' field */
    public org.ga4gh.models.TranscriptEffect.Builder setEffects(java.util.List<org.ga4gh.models.OntologyTerm> value) {
      validate(fields()[3], value);
      this.effects = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'effects' field has been set */
    public boolean hasEffects() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'effects' field */
    public org.ga4gh.models.TranscriptEffect.Builder clearEffects() {
      effects = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'hgvsAnnotation' field */
    public org.ga4gh.models.HGVSAnnotation getHgvsAnnotation() {
      return hgvsAnnotation;
    }
    
    /** Sets the value of the 'hgvsAnnotation' field */
    public org.ga4gh.models.TranscriptEffect.Builder setHgvsAnnotation(org.ga4gh.models.HGVSAnnotation value) {
      validate(fields()[4], value);
      this.hgvsAnnotation = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'hgvsAnnotation' field has been set */
    public boolean hasHgvsAnnotation() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'hgvsAnnotation' field */
    public org.ga4gh.models.TranscriptEffect.Builder clearHgvsAnnotation() {
      hgvsAnnotation = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'cDNALocation' field */
    public org.ga4gh.models.AlleleLocation getCDNALocation() {
      return cDNALocation;
    }
    
    /** Sets the value of the 'cDNALocation' field */
    public org.ga4gh.models.TranscriptEffect.Builder setCDNALocation(org.ga4gh.models.AlleleLocation value) {
      validate(fields()[5], value);
      this.cDNALocation = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'cDNALocation' field has been set */
    public boolean hasCDNALocation() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'cDNALocation' field */
    public org.ga4gh.models.TranscriptEffect.Builder clearCDNALocation() {
      cDNALocation = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'CDSLocation' field */
    public org.ga4gh.models.AlleleLocation getCDSLocation() {
      return CDSLocation;
    }
    
    /** Sets the value of the 'CDSLocation' field */
    public org.ga4gh.models.TranscriptEffect.Builder setCDSLocation(org.ga4gh.models.AlleleLocation value) {
      validate(fields()[6], value);
      this.CDSLocation = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'CDSLocation' field has been set */
    public boolean hasCDSLocation() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'CDSLocation' field */
    public org.ga4gh.models.TranscriptEffect.Builder clearCDSLocation() {
      CDSLocation = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'proteinLocation' field */
    public org.ga4gh.models.AlleleLocation getProteinLocation() {
      return proteinLocation;
    }
    
    /** Sets the value of the 'proteinLocation' field */
    public org.ga4gh.models.TranscriptEffect.Builder setProteinLocation(org.ga4gh.models.AlleleLocation value) {
      validate(fields()[7], value);
      this.proteinLocation = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'proteinLocation' field has been set */
    public boolean hasProteinLocation() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'proteinLocation' field */
    public org.ga4gh.models.TranscriptEffect.Builder clearProteinLocation() {
      proteinLocation = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'analysisResults' field */
    public java.util.List<org.ga4gh.models.AnalysisResult> getAnalysisResults() {
      return analysisResults;
    }
    
    /** Sets the value of the 'analysisResults' field */
    public org.ga4gh.models.TranscriptEffect.Builder setAnalysisResults(java.util.List<org.ga4gh.models.AnalysisResult> value) {
      validate(fields()[8], value);
      this.analysisResults = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'analysisResults' field has been set */
    public boolean hasAnalysisResults() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'analysisResults' field */
    public org.ga4gh.models.TranscriptEffect.Builder clearAnalysisResults() {
      analysisResults = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public TranscriptEffect build() {
      try {
        TranscriptEffect record = new TranscriptEffect();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.featureId = fieldSetFlags()[1] ? this.featureId : (java.lang.String) defaultValue(fields()[1]);
        record.alternateBases = fieldSetFlags()[2] ? this.alternateBases : (java.lang.String) defaultValue(fields()[2]);
        record.effects = fieldSetFlags()[3] ? this.effects : (java.util.List<org.ga4gh.models.OntologyTerm>) defaultValue(fields()[3]);
        record.hgvsAnnotation = fieldSetFlags()[4] ? this.hgvsAnnotation : (org.ga4gh.models.HGVSAnnotation) defaultValue(fields()[4]);
        record.cDNALocation = fieldSetFlags()[5] ? this.cDNALocation : (org.ga4gh.models.AlleleLocation) defaultValue(fields()[5]);
        record.CDSLocation = fieldSetFlags()[6] ? this.CDSLocation : (org.ga4gh.models.AlleleLocation) defaultValue(fields()[6]);
        record.proteinLocation = fieldSetFlags()[7] ? this.proteinLocation : (org.ga4gh.models.AlleleLocation) defaultValue(fields()[7]);
        record.analysisResults = fieldSetFlags()[8] ? this.analysisResults : (java.util.List<org.ga4gh.models.AnalysisResult>) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
