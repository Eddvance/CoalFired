package io.coalfired.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import io.coalfired.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

/**
 * A base / value business entity used to represent money
 */
@Schema(description = "A base / value business entity used to represent money")
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-05-22T16:36:15.642271455Z[GMT]")


public class Money   {
  @JsonProperty("unit")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String unit = null;

  @JsonProperty("value")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Float value = null;


  public Money unit(String unit) { 

    this.unit = unit;
    return this;
  }

  /**
   * Currency (ISO4217 norm uses 3 letters to define the currency)
   * @return unit
   **/
  
  @Schema(description = "Currency (ISO4217 norm uses 3 letters to define the currency)")
  
  public String getUnit() {  
    return unit;
  }



  public void setUnit(String unit) { 
    this.unit = unit;
  }

  public Money value(Float value) { 

    this.value = value;
    return this;
  }

  /**
   * A positive floating point number
   * @return value
   **/
  
  @Schema(description = "A positive floating point number")
  
  public Float getValue() {  
    return value;
  }



  public void setValue(Float value) { 
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Money money = (Money) o;
    return Objects.equals(this.unit, money.unit) &&
        Objects.equals(this.value, money.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Money {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
