package io.coalfired.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import io.coalfired.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;

/**
 * A condition under which a ProductOffering is made available to Customers. For instance, a productOffering can be offered with multiple commitment periods.
 */
@Schema(description = "A condition under which a ProductOffering is made available to Customers. For instance, a productOffering can be offered with multiple commitment periods.")
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-05-22T16:36:15.642271455Z[GMT]")


public class ProductOfferingTerm   {
  @JsonProperty("description")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String description = null;

  @JsonProperty("name")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String name = null;

  @JsonProperty("duration")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Quantity duration = null;

  @JsonProperty("validFor")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String _atSchemaLocation = null;

  @JsonProperty("@type")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String _atType = null;


  public ProductOfferingTerm description(String description) { 

    this.description = description;
    return this;
  }

  /**
   * Description of the productOfferingTerm
   * @return description
   **/
  
  @Schema(description = "Description of the productOfferingTerm")
  
  public String getDescription() {  
    return description;
  }



  public void setDescription(String description) { 
    this.description = description;
  }

  public ProductOfferingTerm name(String name) { 

    this.name = name;
    return this;
  }

  /**
   * Name of the productOfferingTerm
   * @return name
   **/
  
  @Schema(description = "Name of the productOfferingTerm")
  
  public String getName() {  
    return name;
  }



  public void setName(String name) { 
    this.name = name;
  }

  public ProductOfferingTerm duration(Quantity duration) { 

    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   **/
  
  @Schema(description = "")
  
@Valid
  public Quantity getDuration() {  
    return duration;
  }



  public void setDuration(Quantity duration) { 
    this.duration = duration;
  }

  public ProductOfferingTerm validFor(TimePeriod validFor) { 

    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   **/
  
  @Schema(description = "")
  
@Valid
  public TimePeriod getValidFor() {  
    return validFor;
  }



  public void setValidFor(TimePeriod validFor) { 
    this.validFor = validFor;
  }

  public ProductOfferingTerm _atBaseType(String _atBaseType) { 

    this._atBaseType = _atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return _atBaseType
   **/
  
  @Schema(description = "When sub-classing, this defines the super-class")
  
  public String getAtBaseType() {  
    return _atBaseType;
  }



  public void setAtBaseType(String _atBaseType) { 
    this._atBaseType = _atBaseType;
  }

  public ProductOfferingTerm _atSchemaLocation(String _atSchemaLocation) { 

    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return _atSchemaLocation
   **/
  
  @Schema(description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  
  public String getAtSchemaLocation() {  
    return _atSchemaLocation;
  }



  public void setAtSchemaLocation(String _atSchemaLocation) { 
    this._atSchemaLocation = _atSchemaLocation;
  }

  public ProductOfferingTerm _atType(String _atType) { 

    this._atType = _atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return _atType
   **/
  
  @Schema(description = "When sub-classing, this defines the sub-class entity name")
  
  public String getAtType() {  
    return _atType;
  }



  public void setAtType(String _atType) { 
    this._atType = _atType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingTerm productOfferingTerm = (ProductOfferingTerm) o;
    return Objects.equals(this.description, productOfferingTerm.description) &&
        Objects.equals(this.name, productOfferingTerm.name) &&
        Objects.equals(this.duration, productOfferingTerm.duration) &&
        Objects.equals(this.validFor, productOfferingTerm.validFor) &&
        Objects.equals(this._atBaseType, productOfferingTerm._atBaseType) &&
        Objects.equals(this._atSchemaLocation, productOfferingTerm._atSchemaLocation) &&
        Objects.equals(this._atType, productOfferingTerm._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, duration, validFor, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingTerm {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
