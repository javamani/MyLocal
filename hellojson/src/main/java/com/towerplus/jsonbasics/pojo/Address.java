
package com.towerplus.jsonbasics.pojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addressID",
    "creationDateTime",
    "lastUpdDateTime",
    "country",
    "state",
    "pinCode",
    "streetName",
    "buildingName",
    "flatNumber"
})
@Generated("jsonschema2pojo")
public class Address {

    /**
     * The addressID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressID")
    private String addressID;
    /**
     * The creationDateTime Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("creationDateTime")
    private String creationDateTime;
    /**
     * The lastUpdDateTime Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastUpdDateTime")
    private String lastUpdDateTime;
    /**
     * The country Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    private String country;
    /**
     * The state Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    private String state;
    /**
     * The pinCode Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("pinCode")
    private String pinCode;
    /**
     * The streetName Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("streetName")
    private String streetName;
    /**
     * The buildingName Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("buildingName")
    private String buildingName;
    /**
     * The flatNumber Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("flatNumber")
    private String flatNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The addressID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressID")
    public String getAddressID() {
        return addressID;
    }

    /**
     * The addressID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressID")
    public void setAddressID(String addressID) {
        this.addressID = addressID;
    }

    public Address withAddressID(String addressID) {
        this.addressID = addressID;
        return this;
    }

    /**
     * The creationDateTime Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("creationDateTime")
    public String getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * The creationDateTime Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("creationDateTime")
    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public Address withCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * The lastUpdDateTime Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastUpdDateTime")
    public String getLastUpdDateTime() {
        return lastUpdDateTime;
    }

    /**
     * The lastUpdDateTime Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastUpdDateTime")
    public void setLastUpdDateTime(String lastUpdDateTime) {
        this.lastUpdDateTime = lastUpdDateTime;
    }

    public Address withLastUpdDateTime(String lastUpdDateTime) {
        this.lastUpdDateTime = lastUpdDateTime;
        return this;
    }

    /**
     * The country Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * The country Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Address withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * The state Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * The state Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Address withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The pinCode Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("pinCode")
    public String getPinCode() {
        return pinCode;
    }

    /**
     * The pinCode Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("pinCode")
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public Address withPinCode(String pinCode) {
        this.pinCode = pinCode;
        return this;
    }

    /**
     * The streetName Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    /**
     * The streetName Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Address withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     * The buildingName Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("buildingName")
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * The buildingName Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("buildingName")
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Address withBuildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    /**
     * The flatNumber Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("flatNumber")
    public String getFlatNumber() {
        return flatNumber;
    }

    /**
     * The flatNumber Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("flatNumber")
    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public Address withFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Address withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addressID");
        sb.append('=');
        sb.append(((this.addressID == null)?"<null>":this.addressID));
        sb.append(',');
        sb.append("creationDateTime");
        sb.append('=');
        sb.append(((this.creationDateTime == null)?"<null>":this.creationDateTime));
        sb.append(',');
        sb.append("lastUpdDateTime");
        sb.append('=');
        sb.append(((this.lastUpdDateTime == null)?"<null>":this.lastUpdDateTime));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("pinCode");
        sb.append('=');
        sb.append(((this.pinCode == null)?"<null>":this.pinCode));
        sb.append(',');
        sb.append("streetName");
        sb.append('=');
        sb.append(((this.streetName == null)?"<null>":this.streetName));
        sb.append(',');
        sb.append("buildingName");
        sb.append('=');
        sb.append(((this.buildingName == null)?"<null>":this.buildingName));
        sb.append(',');
        sb.append("flatNumber");
        sb.append('=');
        sb.append(((this.flatNumber == null)?"<null>":this.flatNumber));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.buildingName == null)? 0 :this.buildingName.hashCode()));
        result = ((result* 31)+((this.streetName == null)? 0 :this.streetName.hashCode()));
        result = ((result* 31)+((this.flatNumber == null)? 0 :this.flatNumber.hashCode()));
        result = ((result* 31)+((this.pinCode == null)? 0 :this.pinCode.hashCode()));
        result = ((result* 31)+((this.lastUpdDateTime == null)? 0 :this.lastUpdDateTime.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.addressID == null)? 0 :this.addressID.hashCode()));
        result = ((result* 31)+((this.creationDateTime == null)? 0 :this.creationDateTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return (((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.buildingName == rhs.buildingName)||((this.buildingName!= null)&&this.buildingName.equals(rhs.buildingName))))&&((this.streetName == rhs.streetName)||((this.streetName!= null)&&this.streetName.equals(rhs.streetName))))&&((this.flatNumber == rhs.flatNumber)||((this.flatNumber!= null)&&this.flatNumber.equals(rhs.flatNumber))))&&((this.pinCode == rhs.pinCode)||((this.pinCode!= null)&&this.pinCode.equals(rhs.pinCode))))&&((this.lastUpdDateTime == rhs.lastUpdDateTime)||((this.lastUpdDateTime!= null)&&this.lastUpdDateTime.equals(rhs.lastUpdDateTime))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.addressID == rhs.addressID)||((this.addressID!= null)&&this.addressID.equals(rhs.addressID))))&&((this.creationDateTime == rhs.creationDateTime)||((this.creationDateTime!= null)&&this.creationDateTime.equals(rhs.creationDateTime))));
    }

}
