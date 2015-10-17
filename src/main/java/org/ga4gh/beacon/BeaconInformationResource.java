/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.beacon;  
@SuppressWarnings("all")
/** BeaconInformationResource */
@org.apache.avro.specific.AvroGenerated
public class BeaconInformationResource extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BeaconInformationResource\",\"namespace\":\"org.ga4gh.beacon\",\"doc\":\"BeaconInformationResource\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"(Unique) beacon ID. Recommended pattern: [organization]-[beacon] (no special characters).\"},{\"name\":\"organization\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Name of the owning organization.\"},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Beacon description.\"},{\"name\":\"datasets\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataSetResource\",\"doc\":\"DataSetResource\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Dataset name\"},{\"name\":\"reference\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Reference genome\"},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Dataset description\",\"default\":null},{\"name\":\"size\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DataSizeResource\",\"doc\":\"DataSetSizeResource\",\"fields\":[{\"name\":\"variants\",\"type\":\"int\",\"doc\":\"Total number of variant positions in the data set\"},{\"name\":\"samples\",\"type\":\"int\",\"doc\":\"Total number of samples in the data set\"}]}],\"doc\":\"Dimensions of the data set. Should be provided if the beacon reports allele frequencies.\",\"default\":null},{\"name\":\"multiple\",\"type\":\"boolean\",\"doc\":\"True if this dataset contains data from 2 or more other datasets.\"},{\"name\":\"datasets\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"List of names of each of the datasets that comprises this aggregated dataset. Should be provided if ‘multiple’ is true.\",\"default\":[]},{\"name\":\"data_use\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataUseResource\",\"doc\":\"DataUseResource\",\"fields\":[{\"name\":\"category\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Data Use category.\"},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Description of Data Use category.\",\"default\":null},{\"name\":\"requirements\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataUseRequirementResource\",\"doc\":\"DataUseRequirementResource\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Data Use requirement\"},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Description of Data Use requirement.\",\"default\":null}]}},\"doc\":\"Data Use requirements.\",\"default\":[]}]}},\"doc\":\"Data use limitations, specified as a set of DataUseResource.\",\"default\":[]}]}},\"doc\":\"Datasets served by the beacon.\",\"default\":[]},{\"name\":\"api\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Beacon API version supported.\"},{\"name\":\"homepage\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"URL to the homepage for this beacon.\",\"default\":null},{\"name\":\"email\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"An email address for contact.\",\"default\":null},{\"name\":\"auth\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Auth type. Expected value - OAUTH2. Defaults to NONE.\",\"default\":null},{\"name\":\"queries\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Examples of interesting queries, e.g. a few queries demonstrating different types of responses.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** (Unique) beacon ID. Recommended pattern: [organization]-[beacon] (no special characters). */
   private java.lang.String id;
  /** Name of the owning organization. */
   private java.lang.String organization;
  /** Beacon description. */
   private java.lang.String description;
  /** Datasets served by the beacon. */
   private java.util.List<org.ga4gh.beacon.DataSetResource> datasets;
  /** Beacon API version supported. */
   private java.lang.String api;
  /** URL to the homepage for this beacon. */
   private java.lang.String homepage;
  /** An email address for contact. */
   private java.lang.String email;
  /** Auth type. Expected value - OAUTH2. Defaults to NONE. */
   private java.lang.String auth;
  /** Examples of interesting queries, e.g. a few queries demonstrating different types of responses. */
   private java.lang.String queries;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public BeaconInformationResource() {}

  /**
   * All-args constructor.
   */
  public BeaconInformationResource(java.lang.String id, java.lang.String organization, java.lang.String description, java.util.List<org.ga4gh.beacon.DataSetResource> datasets, java.lang.String api, java.lang.String homepage, java.lang.String email, java.lang.String auth, java.lang.String queries) {
    this.id = id;
    this.organization = organization;
    this.description = description;
    this.datasets = datasets;
    this.api = api;
    this.homepage = homepage;
    this.email = email;
    this.auth = auth;
    this.queries = queries;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return organization;
    case 2: return description;
    case 3: return datasets;
    case 4: return api;
    case 5: return homepage;
    case 6: return email;
    case 7: return auth;
    case 8: return queries;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: organization = (java.lang.String)value$; break;
    case 2: description = (java.lang.String)value$; break;
    case 3: datasets = (java.util.List<org.ga4gh.beacon.DataSetResource>)value$; break;
    case 4: api = (java.lang.String)value$; break;
    case 5: homepage = (java.lang.String)value$; break;
    case 6: email = (java.lang.String)value$; break;
    case 7: auth = (java.lang.String)value$; break;
    case 8: queries = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * (Unique) beacon ID. Recommended pattern: [organization]-[beacon] (no special characters).   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * (Unique) beacon ID. Recommended pattern: [organization]-[beacon] (no special characters).   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'organization' field.
   * Name of the owning organization.   */
  public java.lang.String getOrganization() {
    return organization;
  }

  /**
   * Sets the value of the 'organization' field.
   * Name of the owning organization.   * @param value the value to set.
   */
  public void setOrganization(java.lang.String value) {
    this.organization = value;
  }

  /**
   * Gets the value of the 'description' field.
   * Beacon description.   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * Beacon description.   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'datasets' field.
   * Datasets served by the beacon.   */
  public java.util.List<org.ga4gh.beacon.DataSetResource> getDatasets() {
    return datasets;
  }

  /**
   * Sets the value of the 'datasets' field.
   * Datasets served by the beacon.   * @param value the value to set.
   */
  public void setDatasets(java.util.List<org.ga4gh.beacon.DataSetResource> value) {
    this.datasets = value;
  }

  /**
   * Gets the value of the 'api' field.
   * Beacon API version supported.   */
  public java.lang.String getApi() {
    return api;
  }

  /**
   * Sets the value of the 'api' field.
   * Beacon API version supported.   * @param value the value to set.
   */
  public void setApi(java.lang.String value) {
    this.api = value;
  }

  /**
   * Gets the value of the 'homepage' field.
   * URL to the homepage for this beacon.   */
  public java.lang.String getHomepage() {
    return homepage;
  }

  /**
   * Sets the value of the 'homepage' field.
   * URL to the homepage for this beacon.   * @param value the value to set.
   */
  public void setHomepage(java.lang.String value) {
    this.homepage = value;
  }

  /**
   * Gets the value of the 'email' field.
   * An email address for contact.   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Sets the value of the 'email' field.
   * An email address for contact.   * @param value the value to set.
   */
  public void setEmail(java.lang.String value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'auth' field.
   * Auth type. Expected value - OAUTH2. Defaults to NONE.   */
  public java.lang.String getAuth() {
    return auth;
  }

  /**
   * Sets the value of the 'auth' field.
   * Auth type. Expected value - OAUTH2. Defaults to NONE.   * @param value the value to set.
   */
  public void setAuth(java.lang.String value) {
    this.auth = value;
  }

  /**
   * Gets the value of the 'queries' field.
   * Examples of interesting queries, e.g. a few queries demonstrating different types of responses.   */
  public java.lang.String getQueries() {
    return queries;
  }

  /**
   * Sets the value of the 'queries' field.
   * Examples of interesting queries, e.g. a few queries demonstrating different types of responses.   * @param value the value to set.
   */
  public void setQueries(java.lang.String value) {
    this.queries = value;
  }

  /** Creates a new BeaconInformationResource RecordBuilder */
  public static org.ga4gh.beacon.BeaconInformationResource.Builder newBuilder() {
    return new org.ga4gh.beacon.BeaconInformationResource.Builder();
  }
  
  /** Creates a new BeaconInformationResource RecordBuilder by copying an existing Builder */
  public static org.ga4gh.beacon.BeaconInformationResource.Builder newBuilder(org.ga4gh.beacon.BeaconInformationResource.Builder other) {
    return new org.ga4gh.beacon.BeaconInformationResource.Builder(other);
  }
  
  /** Creates a new BeaconInformationResource RecordBuilder by copying an existing BeaconInformationResource instance */
  public static org.ga4gh.beacon.BeaconInformationResource.Builder newBuilder(org.ga4gh.beacon.BeaconInformationResource other) {
    return new org.ga4gh.beacon.BeaconInformationResource.Builder(other);
  }
  
  /**
   * RecordBuilder for BeaconInformationResource instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BeaconInformationResource>
    implements org.apache.avro.data.RecordBuilder<BeaconInformationResource> {

    private java.lang.String id;
    private java.lang.String organization;
    private java.lang.String description;
    private java.util.List<org.ga4gh.beacon.DataSetResource> datasets;
    private java.lang.String api;
    private java.lang.String homepage;
    private java.lang.String email;
    private java.lang.String auth;
    private java.lang.String queries;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.beacon.BeaconInformationResource.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.beacon.BeaconInformationResource.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.organization)) {
        this.organization = data().deepCopy(fields()[1].schema(), other.organization);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.datasets)) {
        this.datasets = data().deepCopy(fields()[3].schema(), other.datasets);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.api)) {
        this.api = data().deepCopy(fields()[4].schema(), other.api);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.homepage)) {
        this.homepage = data().deepCopy(fields()[5].schema(), other.homepage);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.email)) {
        this.email = data().deepCopy(fields()[6].schema(), other.email);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.auth)) {
        this.auth = data().deepCopy(fields()[7].schema(), other.auth);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.queries)) {
        this.queries = data().deepCopy(fields()[8].schema(), other.queries);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing BeaconInformationResource instance */
    private Builder(org.ga4gh.beacon.BeaconInformationResource other) {
            super(org.ga4gh.beacon.BeaconInformationResource.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.organization)) {
        this.organization = data().deepCopy(fields()[1].schema(), other.organization);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.datasets)) {
        this.datasets = data().deepCopy(fields()[3].schema(), other.datasets);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.api)) {
        this.api = data().deepCopy(fields()[4].schema(), other.api);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.homepage)) {
        this.homepage = data().deepCopy(fields()[5].schema(), other.homepage);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.email)) {
        this.email = data().deepCopy(fields()[6].schema(), other.email);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.auth)) {
        this.auth = data().deepCopy(fields()[7].schema(), other.auth);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.queries)) {
        this.queries = data().deepCopy(fields()[8].schema(), other.queries);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder setId(java.lang.String value) {
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
    public org.ga4gh.beacon.BeaconInformationResource.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'organization' field */
    public java.lang.String getOrganization() {
      return organization;
    }
    
    /** Sets the value of the 'organization' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder setOrganization(java.lang.String value) {
      validate(fields()[1], value);
      this.organization = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'organization' field has been set */
    public boolean hasOrganization() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'organization' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder clearOrganization() {
      organization = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.String getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder setDescription(java.lang.String value) {
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
    public org.ga4gh.beacon.BeaconInformationResource.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'datasets' field */
    public java.util.List<org.ga4gh.beacon.DataSetResource> getDatasets() {
      return datasets;
    }
    
    /** Sets the value of the 'datasets' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder setDatasets(java.util.List<org.ga4gh.beacon.DataSetResource> value) {
      validate(fields()[3], value);
      this.datasets = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'datasets' field has been set */
    public boolean hasDatasets() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'datasets' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder clearDatasets() {
      datasets = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'api' field */
    public java.lang.String getApi() {
      return api;
    }
    
    /** Sets the value of the 'api' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder setApi(java.lang.String value) {
      validate(fields()[4], value);
      this.api = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'api' field has been set */
    public boolean hasApi() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'api' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder clearApi() {
      api = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'homepage' field */
    public java.lang.String getHomepage() {
      return homepage;
    }
    
    /** Sets the value of the 'homepage' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder setHomepage(java.lang.String value) {
      validate(fields()[5], value);
      this.homepage = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'homepage' field has been set */
    public boolean hasHomepage() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'homepage' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder clearHomepage() {
      homepage = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'email' field */
    public java.lang.String getEmail() {
      return email;
    }
    
    /** Sets the value of the 'email' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder setEmail(java.lang.String value) {
      validate(fields()[6], value);
      this.email = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'email' field has been set */
    public boolean hasEmail() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'email' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder clearEmail() {
      email = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'auth' field */
    public java.lang.String getAuth() {
      return auth;
    }
    
    /** Sets the value of the 'auth' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder setAuth(java.lang.String value) {
      validate(fields()[7], value);
      this.auth = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'auth' field has been set */
    public boolean hasAuth() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'auth' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder clearAuth() {
      auth = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'queries' field */
    public java.lang.String getQueries() {
      return queries;
    }
    
    /** Sets the value of the 'queries' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder setQueries(java.lang.String value) {
      validate(fields()[8], value);
      this.queries = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'queries' field has been set */
    public boolean hasQueries() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'queries' field */
    public org.ga4gh.beacon.BeaconInformationResource.Builder clearQueries() {
      queries = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public BeaconInformationResource build() {
      try {
        BeaconInformationResource record = new BeaconInformationResource();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.organization = fieldSetFlags()[1] ? this.organization : (java.lang.String) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.String) defaultValue(fields()[2]);
        record.datasets = fieldSetFlags()[3] ? this.datasets : (java.util.List<org.ga4gh.beacon.DataSetResource>) defaultValue(fields()[3]);
        record.api = fieldSetFlags()[4] ? this.api : (java.lang.String) defaultValue(fields()[4]);
        record.homepage = fieldSetFlags()[5] ? this.homepage : (java.lang.String) defaultValue(fields()[5]);
        record.email = fieldSetFlags()[6] ? this.email : (java.lang.String) defaultValue(fields()[6]);
        record.auth = fieldSetFlags()[7] ? this.auth : (java.lang.String) defaultValue(fields()[7]);
        record.queries = fieldSetFlags()[8] ? this.queries : (java.lang.String) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
