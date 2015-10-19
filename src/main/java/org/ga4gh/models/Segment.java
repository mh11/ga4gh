/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;  
@SuppressWarnings("all")
/** A `Segment` is a range on a sequence, possibly including the joins at the
sequence's ends. It does not include base data. (The bases for a sequence are
available through the `getSequenceBases()` API call.)

In the sequence "GTGG", the segment starting at index 1 on the forward strand
with length 2 is the "TG" on the forward strand. The length-2 segment starting
at index 1 on the reverse strand is "AC", corresponding to the first two base
pairs of the sequence, or the last two bases of the reverse complement. */
@org.apache.avro.specific.AvroGenerated
public class Segment extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Segment\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A `Segment` is a range on a sequence, possibly including the joins at the\\nsequence's ends. It does not include base data. (The bases for a sequence are\\navailable through the `getSequenceBases()` API call.)\\n\\nIn the sequence \\\"GTGG\\\", the segment starting at index 1 on the forward strand\\nwith length 2 is the \\\"TG\\\" on the forward strand. The length-2 segment starting\\nat index 1 on the reverse strand is \\\"AC\\\", corresponding to the first two base\\npairs of the sequence, or the last two bases of the reverse complement.\",\"fields\":[{\"name\":\"start\",\"type\":{\"type\":\"record\",\"name\":\"Position\",\"doc\":\"A `Position` is a side of a base pair in some already known sequence. A\\n`Position` is represented by a sequence name or ID, a base number on that\\nsequence (0-based), and a `Strand` to indicate the left or right side.\\n\\nFor example, given the sequence \\\"GTGG\\\", the `Position` on that sequence at\\noffset 1 in the forward orientation would be the left side of the T/A base pair.\\nThe base at this `Position` is \\\"T\\\". Alternately, for offset 1 in the reverse\\norientation, the `Position` would be the right side of the T/A base pair, and\\nthe base at the `Position` is \\\"A\\\".\\n\\nOffsets added to a `Position` are interpreted as reading along its strand;\\nadding to a reverse strand position actually subtracts from its `position`\\nmember.\",\"fields\":[{\"name\":\"referenceName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of the reference sequence in whatever reference set is being used.\\n  Does not generally include a \\\"chr\\\" prefix, so for example \\\"X\\\" would be used\\n  for the X chromosome.\\n\\n  If `sequenceId` is null, this must not be null.\",\"default\":null},{\"name\":\"sequenceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The ID of the sequence on which the `Position` is located. This may be a\\n  `Reference` sequence, or a novel piece of sequence associated with a\\n  `VariantSet`.\\n\\n  If `referenceName` is null, this must not be null.\\n\\n  If the server supports the \\\"graph\\\" mode, this must not be null.\",\"default\":null},{\"name\":\"position\",\"type\":\"long\",\"doc\":\"The 0-based offset from the start of the forward strand for that sequence.\\n  Genomic positions are non-negative integers less than sequence length.\"},{\"name\":\"strand\",\"type\":{\"type\":\"enum\",\"name\":\"Strand\",\"doc\":\"Indicates the DNA strand associate for some data item.\\n* `POS_STRAND`:  The postive (+) strand.\\n* `NEG_STRAND`: The negative (-) strand.\\n* `NO_STRAND`: Strand-independent data or data where the strand can not be determined.\",\"symbols\":[\"POS_STRAND\",\"NEG_STRAND\",\"NO_STRAND\"]},\"doc\":\"Strand the position is associated with. `POS_STRAND` represents the forward\\n  strand, or equivalently the left side of a base, and `NEG_STRAND` represents\\n  the reverse strand, or equivalently the right side of a base.\"}]},\"doc\":\"The sequence ID and start index of this `Segment`. This base is always\\n  included in the segment, regardless of orientation.\"},{\"name\":\"length\",\"type\":\"long\",\"doc\":\"The length of this `Segment`'s sequence. If `start` is on the forward strand,\\n  the `Segment` contains the range [`start.position`, `start.position` +\\n  `length`). If `start` is on the reverse strand, the `Segment` contains the\\n  range (`start.position` - `length`, `start.position`]. This is equivalent to\\n  starting from the side indicated by `start`, and traversing through that base\\n  out to the specified length.\"},{\"name\":\"startJoin\",\"type\":[\"null\",\"Position\"],\"doc\":\"Start and end `Position`s where this `Segment` attaches to other sequences.\\n  Note that the segmentId for start and end might not be the same. The\\n  `Segment`s covering the sequences onto which this `Segment` is joined are\\n  called its \\\"parents\\\", while this segment is a \\\"child\\\".\\n\\n  Joins may occur on the outer sides of the terminal bases in a sequence: the\\n  left side of the base at index 0, and the right side of the base with maximum\\n  index. These are the \\\"terminal sides\\\" of the sequence. `startJoin` is the join\\n  on the side indicated by `start`, and may only be set if that side is a\\n  terminal side. Similarly, `endJoin` is the join on the opposite side of the\\n  piece of sequence selected by the segment, and may only be set if that side is\\n  a terminal side. The value of `startJoin` or `endJoin`, if set, is the side to\\n  which the corresponding side of this `Sequence` is connected.\",\"default\":null},{\"name\":\"endJoin\",\"type\":[\"null\",\"Position\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The sequence ID and start index of this `Segment`. This base is always
  included in the segment, regardless of orientation. */
   private org.ga4gh.models.Position start;
  /** The length of this `Segment`'s sequence. If `start` is on the forward strand,
  the `Segment` contains the range [`start.position`, `start.position` +
  `length`). If `start` is on the reverse strand, the `Segment` contains the
  range (`start.position` - `length`, `start.position`]. This is equivalent to
  starting from the side indicated by `start`, and traversing through that base
  out to the specified length. */
   private long length;
  /** Start and end `Position`s where this `Segment` attaches to other sequences.
  Note that the segmentId for start and end might not be the same. The
  `Segment`s covering the sequences onto which this `Segment` is joined are
  called its "parents", while this segment is a "child".

  Joins may occur on the outer sides of the terminal bases in a sequence: the
  left side of the base at index 0, and the right side of the base with maximum
  index. These are the "terminal sides" of the sequence. `startJoin` is the join
  on the side indicated by `start`, and may only be set if that side is a
  terminal side. Similarly, `endJoin` is the join on the opposite side of the
  piece of sequence selected by the segment, and may only be set if that side is
  a terminal side. The value of `startJoin` or `endJoin`, if set, is the side to
  which the corresponding side of this `Sequence` is connected. */
   private org.ga4gh.models.Position startJoin;
   private org.ga4gh.models.Position endJoin;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Segment() {}

  /**
   * All-args constructor.
   */
  public Segment(org.ga4gh.models.Position start, java.lang.Long length, org.ga4gh.models.Position startJoin, org.ga4gh.models.Position endJoin) {
    this.start = start;
    this.length = length;
    this.startJoin = startJoin;
    this.endJoin = endJoin;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return start;
    case 1: return length;
    case 2: return startJoin;
    case 3: return endJoin;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: start = (org.ga4gh.models.Position)value$; break;
    case 1: length = (java.lang.Long)value$; break;
    case 2: startJoin = (org.ga4gh.models.Position)value$; break;
    case 3: endJoin = (org.ga4gh.models.Position)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'start' field.
   * The sequence ID and start index of this `Segment`. This base is always
  included in the segment, regardless of orientation.   */
  public org.ga4gh.models.Position getStart() {
    return start;
  }

  /**
   * Sets the value of the 'start' field.
   * The sequence ID and start index of this `Segment`. This base is always
  included in the segment, regardless of orientation.   * @param value the value to set.
   */
  public void setStart(org.ga4gh.models.Position value) {
    this.start = value;
  }

  /**
   * Gets the value of the 'length' field.
   * The length of this `Segment`'s sequence. If `start` is on the forward strand,
  the `Segment` contains the range [`start.position`, `start.position` +
  `length`). If `start` is on the reverse strand, the `Segment` contains the
  range (`start.position` - `length`, `start.position`]. This is equivalent to
  starting from the side indicated by `start`, and traversing through that base
  out to the specified length.   */
  public java.lang.Long getLength() {
    return length;
  }

  /**
   * Sets the value of the 'length' field.
   * The length of this `Segment`'s sequence. If `start` is on the forward strand,
  the `Segment` contains the range [`start.position`, `start.position` +
  `length`). If `start` is on the reverse strand, the `Segment` contains the
  range (`start.position` - `length`, `start.position`]. This is equivalent to
  starting from the side indicated by `start`, and traversing through that base
  out to the specified length.   * @param value the value to set.
   */
  public void setLength(java.lang.Long value) {
    this.length = value;
  }

  /**
   * Gets the value of the 'startJoin' field.
   * Start and end `Position`s where this `Segment` attaches to other sequences.
  Note that the segmentId for start and end might not be the same. The
  `Segment`s covering the sequences onto which this `Segment` is joined are
  called its "parents", while this segment is a "child".

  Joins may occur on the outer sides of the terminal bases in a sequence: the
  left side of the base at index 0, and the right side of the base with maximum
  index. These are the "terminal sides" of the sequence. `startJoin` is the join
  on the side indicated by `start`, and may only be set if that side is a
  terminal side. Similarly, `endJoin` is the join on the opposite side of the
  piece of sequence selected by the segment, and may only be set if that side is
  a terminal side. The value of `startJoin` or `endJoin`, if set, is the side to
  which the corresponding side of this `Sequence` is connected.   */
  public org.ga4gh.models.Position getStartJoin() {
    return startJoin;
  }

  /**
   * Sets the value of the 'startJoin' field.
   * Start and end `Position`s where this `Segment` attaches to other sequences.
  Note that the segmentId for start and end might not be the same. The
  `Segment`s covering the sequences onto which this `Segment` is joined are
  called its "parents", while this segment is a "child".

  Joins may occur on the outer sides of the terminal bases in a sequence: the
  left side of the base at index 0, and the right side of the base with maximum
  index. These are the "terminal sides" of the sequence. `startJoin` is the join
  on the side indicated by `start`, and may only be set if that side is a
  terminal side. Similarly, `endJoin` is the join on the opposite side of the
  piece of sequence selected by the segment, and may only be set if that side is
  a terminal side. The value of `startJoin` or `endJoin`, if set, is the side to
  which the corresponding side of this `Sequence` is connected.   * @param value the value to set.
   */
  public void setStartJoin(org.ga4gh.models.Position value) {
    this.startJoin = value;
  }

  /**
   * Gets the value of the 'endJoin' field.
   */
  public org.ga4gh.models.Position getEndJoin() {
    return endJoin;
  }

  /**
   * Sets the value of the 'endJoin' field.
   * @param value the value to set.
   */
  public void setEndJoin(org.ga4gh.models.Position value) {
    this.endJoin = value;
  }

  /** Creates a new Segment RecordBuilder */
  public static org.ga4gh.models.Segment.Builder newBuilder() {
    return new org.ga4gh.models.Segment.Builder();
  }
  
  /** Creates a new Segment RecordBuilder by copying an existing Builder */
  public static org.ga4gh.models.Segment.Builder newBuilder(org.ga4gh.models.Segment.Builder other) {
    return new org.ga4gh.models.Segment.Builder(other);
  }
  
  /** Creates a new Segment RecordBuilder by copying an existing Segment instance */
  public static org.ga4gh.models.Segment.Builder newBuilder(org.ga4gh.models.Segment other) {
    return new org.ga4gh.models.Segment.Builder(other);
  }
  
  /**
   * RecordBuilder for Segment instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Segment>
    implements org.apache.avro.data.RecordBuilder<Segment> {

    private org.ga4gh.models.Position start;
    private long length;
    private org.ga4gh.models.Position startJoin;
    private org.ga4gh.models.Position endJoin;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.models.Segment.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.models.Segment.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.start)) {
        this.start = data().deepCopy(fields()[0].schema(), other.start);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.length)) {
        this.length = data().deepCopy(fields()[1].schema(), other.length);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.startJoin)) {
        this.startJoin = data().deepCopy(fields()[2].schema(), other.startJoin);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.endJoin)) {
        this.endJoin = data().deepCopy(fields()[3].schema(), other.endJoin);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Segment instance */
    private Builder(org.ga4gh.models.Segment other) {
            super(org.ga4gh.models.Segment.SCHEMA$);
      if (isValidValue(fields()[0], other.start)) {
        this.start = data().deepCopy(fields()[0].schema(), other.start);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.length)) {
        this.length = data().deepCopy(fields()[1].schema(), other.length);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.startJoin)) {
        this.startJoin = data().deepCopy(fields()[2].schema(), other.startJoin);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.endJoin)) {
        this.endJoin = data().deepCopy(fields()[3].schema(), other.endJoin);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'start' field */
    public org.ga4gh.models.Position getStart() {
      return start;
    }
    
    /** Sets the value of the 'start' field */
    public org.ga4gh.models.Segment.Builder setStart(org.ga4gh.models.Position value) {
      validate(fields()[0], value);
      this.start = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'start' field has been set */
    public boolean hasStart() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'start' field */
    public org.ga4gh.models.Segment.Builder clearStart() {
      start = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'length' field */
    public java.lang.Long getLength() {
      return length;
    }
    
    /** Sets the value of the 'length' field */
    public org.ga4gh.models.Segment.Builder setLength(long value) {
      validate(fields()[1], value);
      this.length = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'length' field has been set */
    public boolean hasLength() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'length' field */
    public org.ga4gh.models.Segment.Builder clearLength() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'startJoin' field */
    public org.ga4gh.models.Position getStartJoin() {
      return startJoin;
    }
    
    /** Sets the value of the 'startJoin' field */
    public org.ga4gh.models.Segment.Builder setStartJoin(org.ga4gh.models.Position value) {
      validate(fields()[2], value);
      this.startJoin = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'startJoin' field has been set */
    public boolean hasStartJoin() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'startJoin' field */
    public org.ga4gh.models.Segment.Builder clearStartJoin() {
      startJoin = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'endJoin' field */
    public org.ga4gh.models.Position getEndJoin() {
      return endJoin;
    }
    
    /** Sets the value of the 'endJoin' field */
    public org.ga4gh.models.Segment.Builder setEndJoin(org.ga4gh.models.Position value) {
      validate(fields()[3], value);
      this.endJoin = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'endJoin' field has been set */
    public boolean hasEndJoin() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'endJoin' field */
    public org.ga4gh.models.Segment.Builder clearEndJoin() {
      endJoin = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Segment build() {
      try {
        Segment record = new Segment();
        record.start = fieldSetFlags()[0] ? this.start : (org.ga4gh.models.Position) defaultValue(fields()[0]);
        record.length = fieldSetFlags()[1] ? this.length : (java.lang.Long) defaultValue(fields()[1]);
        record.startJoin = fieldSetFlags()[2] ? this.startJoin : (org.ga4gh.models.Position) defaultValue(fields()[2]);
        record.endJoin = fieldSetFlags()[3] ? this.endJoin : (org.ga4gh.models.Position) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
