package io.coalfired.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import io.coalfired.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;

/**
 * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates. Skipped properties: id,href,lastUpdate
 */
@Schema(description = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates. Skipped properties: id,href,lastUpdate")
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-05-22T16:36:15.642271455Z[GMT]")


public class CategoryUpdate   {
  @JsonProperty("description")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String description = null;

  @JsonProperty("isRoot")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean isRoot = null;

  @JsonProperty("lifecycleStatus")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String lifecycleStatus = null;

  @JsonProperty("name")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String name = null;

  @JsonProperty("parentId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String parentId = null;

  @JsonProperty("version")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String version = null;

  @JsonProperty("productOffering")
  @Valid
  private List<ProductOfferingRef> productOffering = null;
  @JsonProperty("subCategory")
  @Valid
  private List<CategoryRef> subCategory = null;
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


  public CategoryUpdate description(String description) { 

    this.description = description;
    return this;
  }

  /**
   * Description of the category
   * @return description
   **/
  
  @Schema(description = "Description of the category")
  
  public String getDescription() {  
    return description;
  }



  public void setDescription(String description) { 
    this.description = description;
  }

  public CategoryUpdate isRoot(Boolean isRoot) { 

    this.isRoot = isRoot;
    return this;
  }

  /**
   * If true, this Boolean indicates that the category is a root of categories
   * @return isRoot
   **/
  
  @Schema(description = "If true, this Boolean indicates that the category is a root of categories")
  
  public Boolean isIsRoot() {  
    return isRoot;
  }



  public void setIsRoot(Boolean isRoot) { 
    this.isRoot = isRoot;
  }

  public CategoryUpdate lifecycleStatus(String lifecycleStatus) { 

    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * Used to indicate the current lifecycle status
   * @return lifecycleStatus
   **/
  
  @Schema(description = "Used to indicate the current lifecycle status")
  
  public String getLifecycleStatus() {  
    return lifecycleStatus;
  }



  public void setLifecycleStatus(String lifecycleStatus) { 
    this.lifecycleStatus = lifecycleStatus;
  }

  public CategoryUpdate name(String name) { 

    this.name = name;
    return this;
  }

  /**
   * Name of the category
   * @return name
   **/
  
  @Schema(description = "Name of the category")
  
  public String getName() {  
    return name;
  }



  public void setName(String name) { 
    this.name = name;
  }

  public CategoryUpdate parentId(String parentId) { 

    this.parentId = parentId;
    return this;
  }

  /**
   * Unique identifier of the parent category
   * @return parentId
   **/
  
  @Schema(description = "Unique identifier of the parent category")
  
  public String getParentId() {  
    return parentId;
  }



  public void setParentId(String parentId) { 
    this.parentId = parentId;
  }

  public CategoryUpdate version(String version) { 

    this.version = version;
    return this;
  }

  /**
   * Category version
   * @return version
   **/
  
  @Schema(description = "Category version")
  
  public String getVersion() {  
    return version;
  }



  public void setVersion(String version) { 
    this.version = version;
  }

  public CategoryUpdate productOffering(List<ProductOfferingRef> productOffering) { 

    this.productOffering = productOffering;
    return this;
  }

  public CategoryUpdate addProductOfferingItem(ProductOfferingRef productOfferingItem) {
    if (this.productOffering == null) {
      this.productOffering = new ArrayList<ProductOfferingRef>();
    }
    this.productOffering.add(productOfferingItem);
    return this;
  }

  /**
   * A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information.
   * @return productOffering
   **/
  
  @Schema(description = "A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information.")
  @Valid
  public List<ProductOfferingRef> getProductOffering() {  
    return productOffering;
  }



  public void setProductOffering(List<ProductOfferingRef> productOffering) { 
    this.productOffering = productOffering;
  }

  public CategoryUpdate subCategory(List<CategoryRef> subCategory) { 

    this.subCategory = subCategory;
    return this;
  }

  public CategoryUpdate addSubCategoryItem(CategoryRef subCategoryItem) {
    if (this.subCategory == null) {
      this.subCategory = new ArrayList<CategoryRef>();
    }
    this.subCategory.add(subCategoryItem);
    return this;
  }

  /**
   * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other (sub-)categories and/or product offerings.
   * @return subCategory
   **/
  
  @Schema(description = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other (sub-)categories and/or product offerings.")
  @Valid
  public List<CategoryRef> getSubCategory() {  
    return subCategory;
  }



  public void setSubCategory(List<CategoryRef> subCategory) { 
    this.subCategory = subCategory;
  }

  public CategoryUpdate validFor(TimePeriod validFor) { 

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

  public CategoryUpdate _atBaseType(String _atBaseType) { 

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

  public CategoryUpdate _atSchemaLocation(String _atSchemaLocation) { 

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

  public CategoryUpdate _atType(String _atType) { 

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
    CategoryUpdate categoryUpdate = (CategoryUpdate) o;
    return Objects.equals(this.description, categoryUpdate.description) &&
        Objects.equals(this.isRoot, categoryUpdate.isRoot) &&
        Objects.equals(this.lifecycleStatus, categoryUpdate.lifecycleStatus) &&
        Objects.equals(this.name, categoryUpdate.name) &&
        Objects.equals(this.parentId, categoryUpdate.parentId) &&
        Objects.equals(this.version, categoryUpdate.version) &&
        Objects.equals(this.productOffering, categoryUpdate.productOffering) &&
        Objects.equals(this.subCategory, categoryUpdate.subCategory) &&
        Objects.equals(this.validFor, categoryUpdate.validFor) &&
        Objects.equals(this._atBaseType, categoryUpdate._atBaseType) &&
        Objects.equals(this._atSchemaLocation, categoryUpdate._atSchemaLocation) &&
        Objects.equals(this._atType, categoryUpdate._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isRoot, lifecycleStatus, name, parentId, version, productOffering, subCategory, validFor, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryUpdate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isRoot: ").append(toIndentedString(isRoot)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
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
