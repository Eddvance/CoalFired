package io.coalfired.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import io.coalfired.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import jakarta.validation.Valid;

/**
 * The event data structure
 */
@Schema(description = "The event data structure")
@Validated
@NotUndefined
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-05-22T16:36:15.642271455Z[GMT]")


public class ProductOfferingPriceStateChangeEventPayload   {
  @JsonProperty("productOfferingPrice")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private ProductOfferingPrice productOfferingPrice = null;


  public ProductOfferingPriceStateChangeEventPayload productOfferingPrice(ProductOfferingPrice productOfferingPrice) { 

    this.productOfferingPrice = productOfferingPrice;
    return this;
  }

  /**
   * Get productOfferingPrice
   * @return productOfferingPrice
   **/
  
  @Schema(description = "")
  
@Valid
  public ProductOfferingPrice getProductOfferingPrice() {  
    return productOfferingPrice;
  }



  public void setProductOfferingPrice(ProductOfferingPrice productOfferingPrice) { 
    this.productOfferingPrice = productOfferingPrice;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingPriceStateChangeEventPayload productOfferingPriceStateChangeEventPayload = (ProductOfferingPriceStateChangeEventPayload) o;
    return Objects.equals(this.productOfferingPrice, productOfferingPriceStateChangeEventPayload.productOfferingPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productOfferingPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingPriceStateChangeEventPayload {\n");
    
    sb.append("    productOfferingPrice: ").append(toIndentedString(productOfferingPrice)).append("\n");
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
