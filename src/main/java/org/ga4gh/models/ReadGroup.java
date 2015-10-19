/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ReadGroup extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ReadGroup\",\"namespace\":\"org.ga4gh.models\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The read group ID.\"},{\"name\":\"datasetId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The ID of the dataset this read group belongs to.\",\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The read group name.\",\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The read group description.\",\"default\":null},{\"name\":\"sampleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The sample this read group's data was generated from.\"},{\"name\":\"experiment\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Experiment\",\"fields\":[{\"name\":\"libraryId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The library used as part of this experiment.\",\"default\":null},{\"name\":\"platformUnit\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The platform unit used as part of this experiment.\",\"default\":null},{\"name\":\"sequencingCenter\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The sequencing center used as part of this experiment.\"},{\"name\":\"instrumentModel\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The instrument model used as part of this experiment.\\n  This maps to sequencing technology in BAM.\"}]}],\"doc\":\"The experiment used to generate this read group.\"},{\"name\":\"predictedInsertSize\",\"type\":[\"null\",\"int\"],\"doc\":\"The predicted insert size of this read group.\",\"default\":null},{\"name\":\"created\",\"type\":[\"null\",\"long\"],\"doc\":\"The time at which this read group was created in milliseconds from the epoch.\",\"default\":null},{\"name\":\"updated\",\"type\":[\"null\",\"long\"],\"doc\":\"The time at which this read group was last updated in milliseconds\\n  from the epoch.\",\"default\":null},{\"name\":\"stats\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ReadStats\",\"fields\":[{\"name\":\"alignedReadCount\",\"type\":[\"null\",\"long\"],\"doc\":\"The number of aligned reads.\",\"default\":null},{\"name\":\"unalignedReadCount\",\"type\":[\"null\",\"long\"],\"doc\":\"The number of unaligned reads.\",\"default\":null},{\"name\":\"baseCount\",\"type\":[\"null\",\"long\"],\"doc\":\"The total number of bases.\\n  This is equivalent to the sum of `alignedSequence.length` for all reads.\",\"default\":null}]}],\"doc\":\"Statistical data on reads in this read group.\",\"default\":null},{\"name\":\"programs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Program\",\"fields\":[{\"name\":\"commandLine\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The command line used to run this program.\",\"default\":null},{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The user specified ID of the program.\",\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of the program.\",\"default\":null},{\"name\":\"prevProgramId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The ID of the program run before this one.\",\"default\":null},{\"name\":\"version\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The version of the program run.\",\"default\":null}]}},\"doc\":\"The programs used to generate this read group.\",\"default\":[]},{\"name\":\"referenceSetId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The reference set the reads in this read group are aligned to.\\n  Required if there are any read alignments.\",\"default\":null},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"},\"doc\":\"A map of additional read group information.\",\"default\":{}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The read group ID. */
   private java.lang.String id;
  /** The ID of the dataset this read group belongs to. */
   private java.lang.String datasetId;
  /** The read group name. */
   private java.lang.String name;
  /** The read group description. */
   private java.lang.String description;
  /** The sample this read group's data was generated from. */
   private java.lang.String sampleId;
  /** The experiment used to generate this read group. */
   private org.ga4gh.models.Experiment experiment;
  /** The predicted insert size of this read group. */
   private java.lang.Integer predictedInsertSize;
  /** The time at which this read group was created in milliseconds from the epoch. */
   private java.lang.Long created;
  /** The time at which this read group was last updated in milliseconds
  from the epoch. */
   private java.lang.Long updated;
  /** Statistical data on reads in this read group. */
   private org.ga4gh.models.ReadStats stats;
  /** The programs used to generate this read group. */
   private java.util.List<org.ga4gh.models.Program> programs;
  /** The reference set the reads in this read group are aligned to.
  Required if there are any read alignments. */
   private java.lang.String referenceSetId;
  /** A map of additional read group information. */
   private java.util.Map<java.lang.String,java.util.List<java.lang.String>> info;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ReadGroup() {}

  /**
   * All-args constructor.
   */
  public ReadGroup(java.lang.String id, java.lang.String datasetId, java.lang.String name, java.lang.String description, java.lang.String sampleId, org.ga4gh.models.Experiment experiment, java.lang.Integer predictedInsertSize, java.lang.Long created, java.lang.Long updated, org.ga4gh.models.ReadStats stats, java.util.List<org.ga4gh.models.Program> programs, java.lang.String referenceSetId, java.util.Map<java.lang.String,java.util.List<java.lang.String>> info) {
    this.id = id;
    this.datasetId = datasetId;
    this.name = name;
    this.description = description;
    this.sampleId = sampleId;
    this.experiment = experiment;
    this.predictedInsertSize = predictedInsertSize;
    this.created = created;
    this.updated = updated;
    this.stats = stats;
    this.programs = programs;
    this.referenceSetId = referenceSetId;
    this.info = info;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return datasetId;
    case 2: return name;
    case 3: return description;
    case 4: return sampleId;
    case 5: return experiment;
    case 6: return predictedInsertSize;
    case 7: return created;
    case 8: return updated;
    case 9: return stats;
    case 10: return programs;
    case 11: return referenceSetId;
    case 12: return info;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: datasetId = (java.lang.String)value$; break;
    case 2: name = (java.lang.String)value$; break;
    case 3: description = (java.lang.String)value$; break;
    case 4: sampleId = (java.lang.String)value$; break;
    case 5: experiment = (org.ga4gh.models.Experiment)value$; break;
    case 6: predictedInsertSize = (java.lang.Integer)value$; break;
    case 7: created = (java.lang.Long)value$; break;
    case 8: updated = (java.lang.Long)value$; break;
    case 9: stats = (org.ga4gh.models.ReadStats)value$; break;
    case 10: programs = (java.util.List<org.ga4gh.models.Program>)value$; break;
    case 11: referenceSetId = (java.lang.String)value$; break;
    case 12: info = (java.util.Map<java.lang.String,java.util.List<java.lang.String>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * The read group ID.   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * The read group ID.   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'datasetId' field.
   * The ID of the dataset this read group belongs to.   */
  public java.lang.String getDatasetId() {
    return datasetId;
  }

  /**
   * Sets the value of the 'datasetId' field.
   * The ID of the dataset this read group belongs to.   * @param value the value to set.
   */
  public void setDatasetId(java.lang.String value) {
    this.datasetId = value;
  }

  /**
   * Gets the value of the 'name' field.
   * The read group name.   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * The read group name.   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   * The read group description.   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * The read group description.   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'sampleId' field.
   * The sample this read group's data was generated from.   */
  public java.lang.String getSampleId() {
    return sampleId;
  }

  /**
   * Sets the value of the 'sampleId' field.
   * The sample this read group's data was generated from.   * @param value the value to set.
   */
  public void setSampleId(java.lang.String value) {
    this.sampleId = value;
  }

  /**
   * Gets the value of the 'experiment' field.
   * The experiment used to generate this read group.   */
  public org.ga4gh.models.Experiment getExperiment() {
    return experiment;
  }

  /**
   * Sets the value of the 'experiment' field.
   * The experiment used to generate this read group.   * @param value the value to set.
   */
  public void setExperiment(org.ga4gh.models.Experiment value) {
    this.experiment = value;
  }

  /**
   * Gets the value of the 'predictedInsertSize' field.
   * The predicted insert size of this read group.   */
  public java.lang.Integer getPredictedInsertSize() {
    return predictedInsertSize;
  }

  /**
   * Sets the value of the 'predictedInsertSize' field.
   * The predicted insert size of this read group.   * @param value the value to set.
   */
  public void setPredictedInsertSize(java.lang.Integer value) {
    this.predictedInsertSize = value;
  }

  /**
   * Gets the value of the 'created' field.
   * The time at which this read group was created in milliseconds from the epoch.   */
  public java.lang.Long getCreated() {
    return created;
  }

  /**
   * Sets the value of the 'created' field.
   * The time at which this read group was created in milliseconds from the epoch.   * @param value the value to set.
   */
  public void setCreated(java.lang.Long value) {
    this.created = value;
  }

  /**
   * Gets the value of the 'updated' field.
   * The time at which this read group was last updated in milliseconds
  from the epoch.   */
  public java.lang.Long getUpdated() {
    return updated;
  }

  /**
   * Sets the value of the 'updated' field.
   * The time at which this read group was last updated in milliseconds
  from the epoch.   * @param value the value to set.
   */
  public void setUpdated(java.lang.Long value) {
    this.updated = value;
  }

  /**
   * Gets the value of the 'stats' field.
   * Statistical data on reads in this read group.   */
  public org.ga4gh.models.ReadStats getStats() {
    return stats;
  }

  /**
   * Sets the value of the 'stats' field.
   * Statistical data on reads in this read group.   * @param value the value to set.
   */
  public void setStats(org.ga4gh.models.ReadStats value) {
    this.stats = value;
  }

  /**
   * Gets the value of the 'programs' field.
   * The programs used to generate this read group.   */
  public java.util.List<org.ga4gh.models.Program> getPrograms() {
    return programs;
  }

  /**
   * Sets the value of the 'programs' field.
   * The programs used to generate this read group.   * @param value the value to set.
   */
  public void setPrograms(java.util.List<org.ga4gh.models.Program> value) {
    this.programs = value;
  }

  /**
   * Gets the value of the 'referenceSetId' field.
   * The reference set the reads in this read group are aligned to.
  Required if there are any read alignments.   */
  public java.lang.String getReferenceSetId() {
    return referenceSetId;
  }

  /**
   * Sets the value of the 'referenceSetId' field.
   * The reference set the reads in this read group are aligned to.
  Required if there are any read alignments.   * @param value the value to set.
   */
  public void setReferenceSetId(java.lang.String value) {
    this.referenceSetId = value;
  }

  /**
   * Gets the value of the 'info' field.
   * A map of additional read group information.   */
  public java.util.Map<java.lang.String,java.util.List<java.lang.String>> getInfo() {
    return info;
  }

  /**
   * Sets the value of the 'info' field.
   * A map of additional read group information.   * @param value the value to set.
   */
  public void setInfo(java.util.Map<java.lang.String,java.util.List<java.lang.String>> value) {
    this.info = value;
  }

  /** Creates a new ReadGroup RecordBuilder */
  public static org.ga4gh.models.ReadGroup.Builder newBuilder() {
    return new org.ga4gh.models.ReadGroup.Builder();
  }
  
  /** Creates a new ReadGroup RecordBuilder by copying an existing Builder */
  public static org.ga4gh.models.ReadGroup.Builder newBuilder(org.ga4gh.models.ReadGroup.Builder other) {
    return new org.ga4gh.models.ReadGroup.Builder(other);
  }
  
  /** Creates a new ReadGroup RecordBuilder by copying an existing ReadGroup instance */
  public static org.ga4gh.models.ReadGroup.Builder newBuilder(org.ga4gh.models.ReadGroup other) {
    return new org.ga4gh.models.ReadGroup.Builder(other);
  }
  
  /**
   * RecordBuilder for ReadGroup instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ReadGroup>
    implements org.apache.avro.data.RecordBuilder<ReadGroup> {

    private java.lang.String id;
    private java.lang.String datasetId;
    private java.lang.String name;
    private java.lang.String description;
    private java.lang.String sampleId;
    private org.ga4gh.models.Experiment experiment;
    private java.lang.Integer predictedInsertSize;
    private java.lang.Long created;
    private java.lang.Long updated;
    private org.ga4gh.models.ReadStats stats;
    private java.util.List<org.ga4gh.models.Program> programs;
    private java.lang.String referenceSetId;
    private java.util.Map<java.lang.String,java.util.List<java.lang.String>> info;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.models.ReadGroup.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.models.ReadGroup.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.datasetId)) {
        this.datasetId = data().deepCopy(fields()[1].schema(), other.datasetId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.sampleId)) {
        this.sampleId = data().deepCopy(fields()[4].schema(), other.sampleId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.experiment)) {
        this.experiment = data().deepCopy(fields()[5].schema(), other.experiment);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.predictedInsertSize)) {
        this.predictedInsertSize = data().deepCopy(fields()[6].schema(), other.predictedInsertSize);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.created)) {
        this.created = data().deepCopy(fields()[7].schema(), other.created);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.updated)) {
        this.updated = data().deepCopy(fields()[8].schema(), other.updated);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.stats)) {
        this.stats = data().deepCopy(fields()[9].schema(), other.stats);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.programs)) {
        this.programs = data().deepCopy(fields()[10].schema(), other.programs);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.referenceSetId)) {
        this.referenceSetId = data().deepCopy(fields()[11].schema(), other.referenceSetId);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.info)) {
        this.info = data().deepCopy(fields()[12].schema(), other.info);
        fieldSetFlags()[12] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ReadGroup instance */
    private Builder(org.ga4gh.models.ReadGroup other) {
            super(org.ga4gh.models.ReadGroup.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.datasetId)) {
        this.datasetId = data().deepCopy(fields()[1].schema(), other.datasetId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.sampleId)) {
        this.sampleId = data().deepCopy(fields()[4].schema(), other.sampleId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.experiment)) {
        this.experiment = data().deepCopy(fields()[5].schema(), other.experiment);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.predictedInsertSize)) {
        this.predictedInsertSize = data().deepCopy(fields()[6].schema(), other.predictedInsertSize);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.created)) {
        this.created = data().deepCopy(fields()[7].schema(), other.created);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.updated)) {
        this.updated = data().deepCopy(fields()[8].schema(), other.updated);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.stats)) {
        this.stats = data().deepCopy(fields()[9].schema(), other.stats);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.programs)) {
        this.programs = data().deepCopy(fields()[10].schema(), other.programs);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.referenceSetId)) {
        this.referenceSetId = data().deepCopy(fields()[11].schema(), other.referenceSetId);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.info)) {
        this.info = data().deepCopy(fields()[12].schema(), other.info);
        fieldSetFlags()[12] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.ga4gh.models.ReadGroup.Builder setId(java.lang.String value) {
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
    public org.ga4gh.models.ReadGroup.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'datasetId' field */
    public java.lang.String getDatasetId() {
      return datasetId;
    }
    
    /** Sets the value of the 'datasetId' field */
    public org.ga4gh.models.ReadGroup.Builder setDatasetId(java.lang.String value) {
      validate(fields()[1], value);
      this.datasetId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'datasetId' field has been set */
    public boolean hasDatasetId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'datasetId' field */
    public org.ga4gh.models.ReadGroup.Builder clearDatasetId() {
      datasetId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.ga4gh.models.ReadGroup.Builder setName(java.lang.String value) {
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
    public org.ga4gh.models.ReadGroup.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.String getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public org.ga4gh.models.ReadGroup.Builder setDescription(java.lang.String value) {
      validate(fields()[3], value);
      this.description = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'description' field */
    public org.ga4gh.models.ReadGroup.Builder clearDescription() {
      description = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'sampleId' field */
    public java.lang.String getSampleId() {
      return sampleId;
    }
    
    /** Sets the value of the 'sampleId' field */
    public org.ga4gh.models.ReadGroup.Builder setSampleId(java.lang.String value) {
      validate(fields()[4], value);
      this.sampleId = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'sampleId' field has been set */
    public boolean hasSampleId() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'sampleId' field */
    public org.ga4gh.models.ReadGroup.Builder clearSampleId() {
      sampleId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'experiment' field */
    public org.ga4gh.models.Experiment getExperiment() {
      return experiment;
    }
    
    /** Sets the value of the 'experiment' field */
    public org.ga4gh.models.ReadGroup.Builder setExperiment(org.ga4gh.models.Experiment value) {
      validate(fields()[5], value);
      this.experiment = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'experiment' field has been set */
    public boolean hasExperiment() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'experiment' field */
    public org.ga4gh.models.ReadGroup.Builder clearExperiment() {
      experiment = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'predictedInsertSize' field */
    public java.lang.Integer getPredictedInsertSize() {
      return predictedInsertSize;
    }
    
    /** Sets the value of the 'predictedInsertSize' field */
    public org.ga4gh.models.ReadGroup.Builder setPredictedInsertSize(java.lang.Integer value) {
      validate(fields()[6], value);
      this.predictedInsertSize = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'predictedInsertSize' field has been set */
    public boolean hasPredictedInsertSize() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'predictedInsertSize' field */
    public org.ga4gh.models.ReadGroup.Builder clearPredictedInsertSize() {
      predictedInsertSize = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'created' field */
    public java.lang.Long getCreated() {
      return created;
    }
    
    /** Sets the value of the 'created' field */
    public org.ga4gh.models.ReadGroup.Builder setCreated(java.lang.Long value) {
      validate(fields()[7], value);
      this.created = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'created' field has been set */
    public boolean hasCreated() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'created' field */
    public org.ga4gh.models.ReadGroup.Builder clearCreated() {
      created = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'updated' field */
    public java.lang.Long getUpdated() {
      return updated;
    }
    
    /** Sets the value of the 'updated' field */
    public org.ga4gh.models.ReadGroup.Builder setUpdated(java.lang.Long value) {
      validate(fields()[8], value);
      this.updated = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'updated' field has been set */
    public boolean hasUpdated() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'updated' field */
    public org.ga4gh.models.ReadGroup.Builder clearUpdated() {
      updated = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'stats' field */
    public org.ga4gh.models.ReadStats getStats() {
      return stats;
    }
    
    /** Sets the value of the 'stats' field */
    public org.ga4gh.models.ReadGroup.Builder setStats(org.ga4gh.models.ReadStats value) {
      validate(fields()[9], value);
      this.stats = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'stats' field has been set */
    public boolean hasStats() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'stats' field */
    public org.ga4gh.models.ReadGroup.Builder clearStats() {
      stats = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'programs' field */
    public java.util.List<org.ga4gh.models.Program> getPrograms() {
      return programs;
    }
    
    /** Sets the value of the 'programs' field */
    public org.ga4gh.models.ReadGroup.Builder setPrograms(java.util.List<org.ga4gh.models.Program> value) {
      validate(fields()[10], value);
      this.programs = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'programs' field has been set */
    public boolean hasPrograms() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'programs' field */
    public org.ga4gh.models.ReadGroup.Builder clearPrograms() {
      programs = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'referenceSetId' field */
    public java.lang.String getReferenceSetId() {
      return referenceSetId;
    }
    
    /** Sets the value of the 'referenceSetId' field */
    public org.ga4gh.models.ReadGroup.Builder setReferenceSetId(java.lang.String value) {
      validate(fields()[11], value);
      this.referenceSetId = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'referenceSetId' field has been set */
    public boolean hasReferenceSetId() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'referenceSetId' field */
    public org.ga4gh.models.ReadGroup.Builder clearReferenceSetId() {
      referenceSetId = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'info' field */
    public java.util.Map<java.lang.String,java.util.List<java.lang.String>> getInfo() {
      return info;
    }
    
    /** Sets the value of the 'info' field */
    public org.ga4gh.models.ReadGroup.Builder setInfo(java.util.Map<java.lang.String,java.util.List<java.lang.String>> value) {
      validate(fields()[12], value);
      this.info = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'info' field has been set */
    public boolean hasInfo() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'info' field */
    public org.ga4gh.models.ReadGroup.Builder clearInfo() {
      info = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    @Override
    public ReadGroup build() {
      try {
        ReadGroup record = new ReadGroup();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.datasetId = fieldSetFlags()[1] ? this.datasetId : (java.lang.String) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.String) defaultValue(fields()[2]);
        record.description = fieldSetFlags()[3] ? this.description : (java.lang.String) defaultValue(fields()[3]);
        record.sampleId = fieldSetFlags()[4] ? this.sampleId : (java.lang.String) defaultValue(fields()[4]);
        record.experiment = fieldSetFlags()[5] ? this.experiment : (org.ga4gh.models.Experiment) defaultValue(fields()[5]);
        record.predictedInsertSize = fieldSetFlags()[6] ? this.predictedInsertSize : (java.lang.Integer) defaultValue(fields()[6]);
        record.created = fieldSetFlags()[7] ? this.created : (java.lang.Long) defaultValue(fields()[7]);
        record.updated = fieldSetFlags()[8] ? this.updated : (java.lang.Long) defaultValue(fields()[8]);
        record.stats = fieldSetFlags()[9] ? this.stats : (org.ga4gh.models.ReadStats) defaultValue(fields()[9]);
        record.programs = fieldSetFlags()[10] ? this.programs : (java.util.List<org.ga4gh.models.Program>) defaultValue(fields()[10]);
        record.referenceSetId = fieldSetFlags()[11] ? this.referenceSetId : (java.lang.String) defaultValue(fields()[11]);
        record.info = fieldSetFlags()[12] ? this.info : (java.util.Map<java.lang.String,java.util.List<java.lang.String>>) defaultValue(fields()[12]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
