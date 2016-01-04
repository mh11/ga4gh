/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;  
@SuppressWarnings("all")
/** A `Call` represents the determination of genotype with respect to a
particular `Variant`.

It may include associated information such as quality
and phasing. For example, a call might assign a probability of 0.32 to
the occurrence of a SNP named rs1234 in a call set with the name NA12345. */
@org.apache.avro.specific.AvroGenerated
public class Call extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Call\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A `Call` represents the determination of genotype with respect to a\\nparticular `Variant`.\\n\\nIt may include associated information such as quality\\nand phasing. For example, a call might assign a probability of 0.32 to\\nthe occurrence of a SNP named rs1234 in a call set with the name NA12345.\",\"fields\":[{\"name\":\"callSetName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of the call set this variant call belongs to.\\n  If this field is not present, the ordering of the call sets from a\\n  `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match\\n  the ordering of the calls on this `Variant`.\\n  The number of results will also be the same.\",\"default\":null},{\"name\":\"callSetId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The ID of the call set this variant call belongs to.\\n\\n  If this field is not present, the ordering of the call sets from a\\n  `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match\\n  the ordering of the calls on this `Variant`.\\n  The number of results will also be the same.\",\"default\":null},{\"name\":\"genotype\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"doc\":\"The genotype of this variant call.\\n\\n  A 0 value represents the reference allele of the associated `Variant`. Any\\n  other value is a 1-based index into the alternate alleles of the associated\\n  `Variant`.\\n\\n  If a variant had a referenceBases field of \\\"T\\\", an alternateBases\\n  value of [\\\"A\\\", \\\"C\\\"], and the genotype was [2, 1], that would mean the call\\n  represented the heterozygous value \\\"CA\\\" for this variant. If the genotype\\n  was instead [0, 1] the represented value would be \\\"TA\\\". Ordering of the\\n  genotype values is important if the phaseset field is present.\",\"default\":[]},{\"name\":\"phaseset\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"If this field is not null, this variant call's genotype ordering implies\\n  the phase of the bases and is consistent with any other variant calls on\\n  the same contig which have the same phaseset string.\",\"default\":null},{\"name\":\"genotypeLikelihood\",\"type\":{\"type\":\"array\",\"items\":\"double\"},\"doc\":\"The genotype likelihoods for this variant call. Each array entry\\n  represents how likely a specific genotype is for this call as\\n  log10(P(data | genotype)), analogous to the GL tag in the VCF spec. The\\n  value ordering is defined by the GL tag in the VCF spec.\",\"default\":[]},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"},\"doc\":\"A map of additional variant call information.\",\"default\":{}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The name of the call set this variant call belongs to.
  If this field is not present, the ordering of the call sets from a
  `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match
  the ordering of the calls on this `Variant`.
  The number of results will also be the same. */
   private java.lang.String callSetName;
  /** The ID of the call set this variant call belongs to.

  If this field is not present, the ordering of the call sets from a
  `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match
  the ordering of the calls on this `Variant`.
  The number of results will also be the same. */
   private java.lang.String callSetId;
  /** The genotype of this variant call.

  A 0 value represents the reference allele of the associated `Variant`. Any
  other value is a 1-based index into the alternate alleles of the associated
  `Variant`.

  If a variant had a referenceBases field of "T", an alternateBases
  value of ["A", "C"], and the genotype was [2, 1], that would mean the call
  represented the heterozygous value "CA" for this variant. If the genotype
  was instead [0, 1] the represented value would be "TA". Ordering of the
  genotype values is important if the phaseset field is present. */
   private java.util.List<java.lang.Integer> genotype;
  /** If this field is not null, this variant call's genotype ordering implies
  the phase of the bases and is consistent with any other variant calls on
  the same contig which have the same phaseset string. */
   private java.lang.String phaseset;
  /** The genotype likelihoods for this variant call. Each array entry
  represents how likely a specific genotype is for this call as
  log10(P(data | genotype)), analogous to the GL tag in the VCF spec. The
  value ordering is defined by the GL tag in the VCF spec. */
   private java.util.List<java.lang.Double> genotypeLikelihood;
  /** A map of additional variant call information. */
   private java.util.Map<java.lang.String,java.util.List<java.lang.String>> info;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Call() {}

  /**
   * All-args constructor.
   */
  public Call(java.lang.String callSetName, java.lang.String callSetId, java.util.List<java.lang.Integer> genotype, java.lang.String phaseset, java.util.List<java.lang.Double> genotypeLikelihood, java.util.Map<java.lang.String,java.util.List<java.lang.String>> info) {
    this.callSetName = callSetName;
    this.callSetId = callSetId;
    this.genotype = genotype;
    this.phaseset = phaseset;
    this.genotypeLikelihood = genotypeLikelihood;
    this.info = info;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return callSetName;
    case 1: return callSetId;
    case 2: return genotype;
    case 3: return phaseset;
    case 4: return genotypeLikelihood;
    case 5: return info;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: callSetName = (java.lang.String)value$; break;
    case 1: callSetId = (java.lang.String)value$; break;
    case 2: genotype = (java.util.List<java.lang.Integer>)value$; break;
    case 3: phaseset = (java.lang.String)value$; break;
    case 4: genotypeLikelihood = (java.util.List<java.lang.Double>)value$; break;
    case 5: info = (java.util.Map<java.lang.String,java.util.List<java.lang.String>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'callSetName' field.
   * The name of the call set this variant call belongs to.
  If this field is not present, the ordering of the call sets from a
  `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match
  the ordering of the calls on this `Variant`.
  The number of results will also be the same.   */
  public java.lang.String getCallSetName() {
    return callSetName;
  }

  /**
   * Sets the value of the 'callSetName' field.
   * The name of the call set this variant call belongs to.
  If this field is not present, the ordering of the call sets from a
  `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match
  the ordering of the calls on this `Variant`.
  The number of results will also be the same.   * @param value the value to set.
   */
  public void setCallSetName(java.lang.String value) {
    this.callSetName = value;
  }

  /**
   * Gets the value of the 'callSetId' field.
   * The ID of the call set this variant call belongs to.

  If this field is not present, the ordering of the call sets from a
  `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match
  the ordering of the calls on this `Variant`.
  The number of results will also be the same.   */
  public java.lang.String getCallSetId() {
    return callSetId;
  }

  /**
   * Sets the value of the 'callSetId' field.
   * The ID of the call set this variant call belongs to.

  If this field is not present, the ordering of the call sets from a
  `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match
  the ordering of the calls on this `Variant`.
  The number of results will also be the same.   * @param value the value to set.
   */
  public void setCallSetId(java.lang.String value) {
    this.callSetId = value;
  }

  /**
   * Gets the value of the 'genotype' field.
   * The genotype of this variant call.

  A 0 value represents the reference allele of the associated `Variant`. Any
  other value is a 1-based index into the alternate alleles of the associated
  `Variant`.

  If a variant had a referenceBases field of "T", an alternateBases
  value of ["A", "C"], and the genotype was [2, 1], that would mean the call
  represented the heterozygous value "CA" for this variant. If the genotype
  was instead [0, 1] the represented value would be "TA". Ordering of the
  genotype values is important if the phaseset field is present.   */
  public java.util.List<java.lang.Integer> getGenotype() {
    return genotype;
  }

  /**
   * Sets the value of the 'genotype' field.
   * The genotype of this variant call.

  A 0 value represents the reference allele of the associated `Variant`. Any
  other value is a 1-based index into the alternate alleles of the associated
  `Variant`.

  If a variant had a referenceBases field of "T", an alternateBases
  value of ["A", "C"], and the genotype was [2, 1], that would mean the call
  represented the heterozygous value "CA" for this variant. If the genotype
  was instead [0, 1] the represented value would be "TA". Ordering of the
  genotype values is important if the phaseset field is present.   * @param value the value to set.
   */
  public void setGenotype(java.util.List<java.lang.Integer> value) {
    this.genotype = value;
  }

  /**
   * Gets the value of the 'phaseset' field.
   * If this field is not null, this variant call's genotype ordering implies
  the phase of the bases and is consistent with any other variant calls on
  the same contig which have the same phaseset string.   */
  public java.lang.String getPhaseset() {
    return phaseset;
  }

  /**
   * Sets the value of the 'phaseset' field.
   * If this field is not null, this variant call's genotype ordering implies
  the phase of the bases and is consistent with any other variant calls on
  the same contig which have the same phaseset string.   * @param value the value to set.
   */
  public void setPhaseset(java.lang.String value) {
    this.phaseset = value;
  }

  /**
   * Gets the value of the 'genotypeLikelihood' field.
   * The genotype likelihoods for this variant call. Each array entry
  represents how likely a specific genotype is for this call as
  log10(P(data | genotype)), analogous to the GL tag in the VCF spec. The
  value ordering is defined by the GL tag in the VCF spec.   */
  public java.util.List<java.lang.Double> getGenotypeLikelihood() {
    return genotypeLikelihood;
  }

  /**
   * Sets the value of the 'genotypeLikelihood' field.
   * The genotype likelihoods for this variant call. Each array entry
  represents how likely a specific genotype is for this call as
  log10(P(data | genotype)), analogous to the GL tag in the VCF spec. The
  value ordering is defined by the GL tag in the VCF spec.   * @param value the value to set.
   */
  public void setGenotypeLikelihood(java.util.List<java.lang.Double> value) {
    this.genotypeLikelihood = value;
  }

  /**
   * Gets the value of the 'info' field.
   * A map of additional variant call information.   */
  public java.util.Map<java.lang.String,java.util.List<java.lang.String>> getInfo() {
    return info;
  }

  /**
   * Sets the value of the 'info' field.
   * A map of additional variant call information.   * @param value the value to set.
   */
  public void setInfo(java.util.Map<java.lang.String,java.util.List<java.lang.String>> value) {
    this.info = value;
  }

  /** Creates a new Call RecordBuilder */
  public static org.ga4gh.models.Call.Builder newBuilder() {
    return new org.ga4gh.models.Call.Builder();
  }
  
  /** Creates a new Call RecordBuilder by copying an existing Builder */
  public static org.ga4gh.models.Call.Builder newBuilder(org.ga4gh.models.Call.Builder other) {
    return new org.ga4gh.models.Call.Builder(other);
  }
  
  /** Creates a new Call RecordBuilder by copying an existing Call instance */
  public static org.ga4gh.models.Call.Builder newBuilder(org.ga4gh.models.Call other) {
    return new org.ga4gh.models.Call.Builder(other);
  }
  
  /**
   * RecordBuilder for Call instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Call>
    implements org.apache.avro.data.RecordBuilder<Call> {

    private java.lang.String callSetName;
    private java.lang.String callSetId;
    private java.util.List<java.lang.Integer> genotype;
    private java.lang.String phaseset;
    private java.util.List<java.lang.Double> genotypeLikelihood;
    private java.util.Map<java.lang.String,java.util.List<java.lang.String>> info;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.models.Call.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.models.Call.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.callSetName)) {
        this.callSetName = data().deepCopy(fields()[0].schema(), other.callSetName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.callSetId)) {
        this.callSetId = data().deepCopy(fields()[1].schema(), other.callSetId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.genotype)) {
        this.genotype = data().deepCopy(fields()[2].schema(), other.genotype);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.phaseset)) {
        this.phaseset = data().deepCopy(fields()[3].schema(), other.phaseset);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.genotypeLikelihood)) {
        this.genotypeLikelihood = data().deepCopy(fields()[4].schema(), other.genotypeLikelihood);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.info)) {
        this.info = data().deepCopy(fields()[5].schema(), other.info);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Call instance */
    private Builder(org.ga4gh.models.Call other) {
            super(org.ga4gh.models.Call.SCHEMA$);
      if (isValidValue(fields()[0], other.callSetName)) {
        this.callSetName = data().deepCopy(fields()[0].schema(), other.callSetName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.callSetId)) {
        this.callSetId = data().deepCopy(fields()[1].schema(), other.callSetId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.genotype)) {
        this.genotype = data().deepCopy(fields()[2].schema(), other.genotype);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.phaseset)) {
        this.phaseset = data().deepCopy(fields()[3].schema(), other.phaseset);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.genotypeLikelihood)) {
        this.genotypeLikelihood = data().deepCopy(fields()[4].schema(), other.genotypeLikelihood);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.info)) {
        this.info = data().deepCopy(fields()[5].schema(), other.info);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'callSetName' field */
    public java.lang.String getCallSetName() {
      return callSetName;
    }
    
    /** Sets the value of the 'callSetName' field */
    public org.ga4gh.models.Call.Builder setCallSetName(java.lang.String value) {
      validate(fields()[0], value);
      this.callSetName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'callSetName' field has been set */
    public boolean hasCallSetName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'callSetName' field */
    public org.ga4gh.models.Call.Builder clearCallSetName() {
      callSetName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'callSetId' field */
    public java.lang.String getCallSetId() {
      return callSetId;
    }
    
    /** Sets the value of the 'callSetId' field */
    public org.ga4gh.models.Call.Builder setCallSetId(java.lang.String value) {
      validate(fields()[1], value);
      this.callSetId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'callSetId' field has been set */
    public boolean hasCallSetId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'callSetId' field */
    public org.ga4gh.models.Call.Builder clearCallSetId() {
      callSetId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'genotype' field */
    public java.util.List<java.lang.Integer> getGenotype() {
      return genotype;
    }
    
    /** Sets the value of the 'genotype' field */
    public org.ga4gh.models.Call.Builder setGenotype(java.util.List<java.lang.Integer> value) {
      validate(fields()[2], value);
      this.genotype = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'genotype' field has been set */
    public boolean hasGenotype() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'genotype' field */
    public org.ga4gh.models.Call.Builder clearGenotype() {
      genotype = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'phaseset' field */
    public java.lang.String getPhaseset() {
      return phaseset;
    }
    
    /** Sets the value of the 'phaseset' field */
    public org.ga4gh.models.Call.Builder setPhaseset(java.lang.String value) {
      validate(fields()[3], value);
      this.phaseset = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'phaseset' field has been set */
    public boolean hasPhaseset() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'phaseset' field */
    public org.ga4gh.models.Call.Builder clearPhaseset() {
      phaseset = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'genotypeLikelihood' field */
    public java.util.List<java.lang.Double> getGenotypeLikelihood() {
      return genotypeLikelihood;
    }
    
    /** Sets the value of the 'genotypeLikelihood' field */
    public org.ga4gh.models.Call.Builder setGenotypeLikelihood(java.util.List<java.lang.Double> value) {
      validate(fields()[4], value);
      this.genotypeLikelihood = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'genotypeLikelihood' field has been set */
    public boolean hasGenotypeLikelihood() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'genotypeLikelihood' field */
    public org.ga4gh.models.Call.Builder clearGenotypeLikelihood() {
      genotypeLikelihood = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'info' field */
    public java.util.Map<java.lang.String,java.util.List<java.lang.String>> getInfo() {
      return info;
    }
    
    /** Sets the value of the 'info' field */
    public org.ga4gh.models.Call.Builder setInfo(java.util.Map<java.lang.String,java.util.List<java.lang.String>> value) {
      validate(fields()[5], value);
      this.info = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'info' field has been set */
    public boolean hasInfo() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'info' field */
    public org.ga4gh.models.Call.Builder clearInfo() {
      info = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public Call build() {
      try {
        Call record = new Call();
        record.callSetName = fieldSetFlags()[0] ? this.callSetName : (java.lang.String) defaultValue(fields()[0]);
        record.callSetId = fieldSetFlags()[1] ? this.callSetId : (java.lang.String) defaultValue(fields()[1]);
        record.genotype = fieldSetFlags()[2] ? this.genotype : (java.util.List<java.lang.Integer>) defaultValue(fields()[2]);
        record.phaseset = fieldSetFlags()[3] ? this.phaseset : (java.lang.String) defaultValue(fields()[3]);
        record.genotypeLikelihood = fieldSetFlags()[4] ? this.genotypeLikelihood : (java.util.List<java.lang.Double>) defaultValue(fields()[4]);
        record.info = fieldSetFlags()[5] ? this.info : (java.util.Map<java.lang.String,java.util.List<java.lang.String>>) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
