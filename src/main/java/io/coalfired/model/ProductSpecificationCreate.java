package io.coalfired.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import io.coalfired.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role. Skipped properties: id,href
 */
@Schema(description = "Is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role. Skipped properties: id,href")
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-05-22T16:36:15.642271455Z[GMT]")


public class ProductSpecificationCreate   {
  @JsonProperty("brand")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String brand = null;

  @JsonProperty("description")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String description = null;

  @JsonProperty("isBundle")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean isBundle = null;

  @JsonProperty("lastUpdate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime lastUpdate = null;

  @JsonProperty("lifecycleStatus")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String lifecycleStatus = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("productNumber")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String productNumber = null;

  @JsonProperty("version")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String version = null;

  @JsonProperty("attachment")
  @Valid
  private List<AttachmentRefOrValue> attachment = null;
  @JsonProperty("bundledProductSpecification")
  @Valid
  private List<BundledProductSpecification> bundledProductSpecification = null;
  @JsonProperty("productSpecCharacteristic")
  @Valid
  private List<ProductSpecificationCharacteristic> productSpecCharacteristic = null;
  @JsonProperty("productSpecificationRelationship")
  @Valid
  private List<ProductSpecificationRelationship> productSpecificationRelationship = null;
  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;
  @JsonProperty("resourceSpecification")
  @Valid
  private List<ResourceSpecificationRef> resourceSpecification = null;
  @JsonProperty("serviceSpecification")
  @Valid
  private List<ServiceSpecificationRef> serviceSpecification = null;
  @JsonProperty("targetProductSchema")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private TargetProductSchema targetProductSchema = null;

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


  public ProductSpecificationCreate brand(String brand) { 

    this.brand = brand;
    return this;
  }

  /**
   * The manufacturer or trademark of the specification
   * @return brand
   **/
  
  @Schema(description = "The manufacturer or trademark of the specification")
  
  public String getBrand() {  
    return brand;
  }



  public void setBrand(String brand) { 
    this.brand = brand;
  }

  public ProductSpecificationCreate description(String description) { 

    this.description = description;
    return this;
  }

  /**
   * A narrative that explains in detail what the product specification is
   * @return description
   **/
  
  @Schema(description = "A narrative that explains in detail what the product specification is")
  
  public String getDescription() {  
    return description;
  }



  public void setDescription(String description) { 
    this.description = description;
  }

  public ProductSpecificationCreate isBundle(Boolean isBundle) { 

    this.isBundle = isBundle;
    return this;
  }

  /**
   * isBundle determines whether a productSpecification represents a single productSpecification (false), or a bundle of productSpecification (true).
   * @return isBundle
   **/
  
  @Schema(description = "isBundle determines whether a productSpecification represents a single productSpecification (false), or a bundle of productSpecification (true).")
  
  public Boolean isIsBundle() {  
    return isBundle;
  }



  public void setIsBundle(Boolean isBundle) { 
    this.isBundle = isBundle;
  }

  public ProductSpecificationCreate lastUpdate(OffsetDateTime lastUpdate) { 

    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date and time of the last update
   * @return lastUpdate
   **/
  
  @Schema(description = "Date and time of the last update")
  
@Valid
  public OffsetDateTime getLastUpdate() {  
    return lastUpdate;
  }



  public void setLastUpdate(OffsetDateTime lastUpdate) { 
    this.lastUpdate = lastUpdate;
  }

  public ProductSpecificationCreate lifecycleStatus(String lifecycleStatus) { 

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

  public ProductSpecificationCreate name(String name) { 

    this.name = name;
    return this;
  }

  /**
   * Name of the product specification
   * @return name
   **/
  
  @Schema(required = true, description = "Name of the product specification")
  
  @NotNull
  public String getName() {  
    return name;
  }



  public void setName(String name) { 

    this.name = name;
  }

  public ProductSpecificationCreate productNumber(String productNumber) { 

    this.productNumber = productNumber;
    return this;
  }

  /**
   * An identification number assigned to uniquely identity the specification
   * @return productNumber
   **/
  
  @Schema(description = "An identification number assigned to uniquely identity the specification")
  
  public String getProductNumber() {  
    return productNumber;
  }



  public void setProductNumber(String productNumber) { 
    this.productNumber = productNumber;
  }

  public ProductSpecificationCreate version(String version) { 

    this.version = version;
    return this;
  }

  /**
   * Product specification version
   * @return version
   **/
  
  @Schema(description = "Product specification version")
  
  public String getVersion() {  
    return version;
  }



  public void setVersion(String version) { 
    this.version = version;
  }

  public ProductSpecificationCreate attachment(List<AttachmentRefOrValue> attachment) { 

    this.attachment = attachment;
    return this;
  }

  public ProductSpecificationCreate addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<AttachmentRefOrValue>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * Complements the description of an element (for instance a product) through video, pictures...
   * @return attachment
   **/
  
  @Schema(description = "Complements the description of an element (for instance a product) through video, pictures...")
  @Valid
  public List<AttachmentRefOrValue> getAttachment() {  
    return attachment;
  }



  public void setAttachment(List<AttachmentRefOrValue> attachment) { 
    this.attachment = attachment;
  }

  public ProductSpecificationCreate bundledProductSpecification(List<BundledProductSpecification> bundledProductSpecification) { 

    this.bundledProductSpecification = bundledProductSpecification;
    return this;
  }

  public ProductSpecificationCreate addBundledProductSpecificationItem(BundledProductSpecification bundledProductSpecificationItem) {
    if (this.bundledProductSpecification == null) {
      this.bundledProductSpecification = new ArrayList<BundledProductSpecification>();
    }
    this.bundledProductSpecification.add(bundledProductSpecificationItem);
    return this;
  }

  /**
   * A type of ProductSpecification that belongs to a grouping of ProductSpecifications made available to the market. It inherits of all attributes of ProductSpecification.
   * @return bundledProductSpecification
   **/
  
  @Schema(description = "A type of ProductSpecification that belongs to a grouping of ProductSpecifications made available to the market. It inherits of all attributes of ProductSpecification.")
  @Valid
  public List<BundledProductSpecification> getBundledProductSpecification() {  
    return bundledProductSpecification;
  }



  public void setBundledProductSpecification(List<BundledProductSpecification> bundledProductSpecification) { 
    this.bundledProductSpecification = bundledProductSpecification;
  }

  public ProductSpecificationCreate productSpecCharacteristic(List<ProductSpecificationCharacteristic> productSpecCharacteristic) { 

    this.productSpecCharacteristic = productSpecCharacteristic;
    return this;
  }

  public ProductSpecificationCreate addProductSpecCharacteristicItem(ProductSpecificationCharacteristic productSpecCharacteristicItem) {
    if (this.productSpecCharacteristic == null) {
      this.productSpecCharacteristic = new ArrayList<ProductSpecificationCharacteristic>();
    }
    this.productSpecCharacteristic.add(productSpecCharacteristicItem);
    return this;
  }

  /**
   * A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) = 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.
   * @return productSpecCharacteristic
   **/
  
  @Schema(description = "A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) = 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.")
  @Valid
  public List<ProductSpecificationCharacteristic> getProductSpecCharacteristic() {  
    return productSpecCharacteristic;
  }



  public void setProductSpecCharacteristic(List<ProductSpecificationCharacteristic> productSpecCharacteristic) { 
    this.productSpecCharacteristic = productSpecCharacteristic;
  }

  public ProductSpecificationCreate productSpecificationRelationship(List<ProductSpecificationRelationship> productSpecificationRelationship) { 

    this.productSpecificationRelationship = productSpecificationRelationship;
    return this;
  }

  public ProductSpecificationCreate addProductSpecificationRelationshipItem(ProductSpecificationRelationship productSpecificationRelationshipItem) {
    if (this.productSpecificationRelationship == null) {
      this.productSpecificationRelationship = new ArrayList<ProductSpecificationRelationship>();
    }
    this.productSpecificationRelationship.add(productSpecificationRelationshipItem);
    return this;
  }

  /**
   * A migration, substitution, dependency or exclusivity relationship between/among product specifications.
   * @return productSpecificationRelationship
   **/
  
  @Schema(description = "A migration, substitution, dependency or exclusivity relationship between/among product specifications.")
  @Valid
  public List<ProductSpecificationRelationship> getProductSpecificationRelationship() {  
    return productSpecificationRelationship;
  }



  public void setProductSpecificationRelationship(List<ProductSpecificationRelationship> productSpecificationRelationship) { 
    this.productSpecificationRelationship = productSpecificationRelationship;
  }

  public ProductSpecificationCreate relatedParty(List<RelatedParty> relatedParty) { 

    this.relatedParty = relatedParty;
    return this;
  }

  public ProductSpecificationCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * A related party defines party or party role linked to a specific entity.
   * @return relatedParty
   **/
  
  @Schema(description = "A related party defines party or party role linked to a specific entity.")
  @Valid
  public List<RelatedParty> getRelatedParty() {  
    return relatedParty;
  }



  public void setRelatedParty(List<RelatedParty> relatedParty) { 
    this.relatedParty = relatedParty;
  }

  public ProductSpecificationCreate resourceSpecification(List<ResourceSpecificationRef> resourceSpecification) { 

    this.resourceSpecification = resourceSpecification;
    return this;
  }

  public ProductSpecificationCreate addResourceSpecificationItem(ResourceSpecificationRef resourceSpecificationItem) {
    if (this.resourceSpecification == null) {
      this.resourceSpecification = new ArrayList<ResourceSpecificationRef>();
    }
    this.resourceSpecification.add(resourceSpecificationItem);
    return this;
  }

  /**
   * The ResourceSpecification is required to realize a ProductSpecification.
   * @return resourceSpecification
   **/
  
  @Schema(description = "The ResourceSpecification is required to realize a ProductSpecification.")
  @Valid
  public List<ResourceSpecificationRef> getResourceSpecification() {  
    return resourceSpecification;
  }



  public void setResourceSpecification(List<ResourceSpecificationRef> resourceSpecification) { 
    this.resourceSpecification = resourceSpecification;
  }

  public ProductSpecificationCreate serviceSpecification(List<ServiceSpecificationRef> serviceSpecification) { 

    this.serviceSpecification = serviceSpecification;
    return this;
  }

  public ProductSpecificationCreate addServiceSpecificationItem(ServiceSpecificationRef serviceSpecificationItem) {
    if (this.serviceSpecification == null) {
      this.serviceSpecification = new ArrayList<ServiceSpecificationRef>();
    }
    this.serviceSpecification.add(serviceSpecificationItem);
    return this;
  }

  /**
   * ServiceSpecification(s) required to realize a ProductSpecification.
   * @return serviceSpecification
   **/
  
  @Schema(description = "ServiceSpecification(s) required to realize a ProductSpecification.")
  @Valid
  public List<ServiceSpecificationRef> getServiceSpecification() {  
    return serviceSpecification;
  }



  public void setServiceSpecification(List<ServiceSpecificationRef> serviceSpecification) { 
    this.serviceSpecification = serviceSpecification;
  }

  public ProductSpecificationCreate targetProductSchema(TargetProductSchema targetProductSchema) { 

    this.targetProductSchema = targetProductSchema;
    return this;
  }

  /**
   * Get targetProductSchema
   * @return targetProductSchema
   **/
  
  @Schema(description = "")
  
@Valid
  public TargetProductSchema getTargetProductSchema() {  
    return targetProductSchema;
  }



  public void setTargetProductSchema(TargetProductSchema targetProductSchema) { 
    this.targetProductSchema = targetProductSchema;
  }

  public ProductSpecificationCreate validFor(TimePeriod validFor) { 

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

  public ProductSpecificationCreate _atBaseType(String _atBaseType) { 

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

  public ProductSpecificationCreate _atSchemaLocation(String _atSchemaLocation) { 

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

  public ProductSpecificationCreate _atType(String _atType) { 

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
    ProductSpecificationCreate productSpecificationCreate = (ProductSpecificationCreate) o;
    return Objects.equals(this.brand, productSpecificationCreate.brand) &&
        Objects.equals(this.description, productSpecificationCreate.description) &&
        Objects.equals(this.isBundle, productSpecificationCreate.isBundle) &&
        Objects.equals(this.lastUpdate, productSpecificationCreate.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, productSpecificationCreate.lifecycleStatus) &&
        Objects.equals(this.name, productSpecificationCreate.name) &&
        Objects.equals(this.productNumber, productSpecificationCreate.productNumber) &&
        Objects.equals(this.version, productSpecificationCreate.version) &&
        Objects.equals(this.attachment, productSpecificationCreate.attachment) &&
        Objects.equals(this.bundledProductSpecification, productSpecificationCreate.bundledProductSpecification) &&
        Objects.equals(this.productSpecCharacteristic, productSpecificationCreate.productSpecCharacteristic) &&
        Objects.equals(this.productSpecificationRelationship, productSpecificationCreate.productSpecificationRelationship) &&
        Objects.equals(this.relatedParty, productSpecificationCreate.relatedParty) &&
        Objects.equals(this.resourceSpecification, productSpecificationCreate.resourceSpecification) &&
        Objects.equals(this.serviceSpecification, productSpecificationCreate.serviceSpecification) &&
        Objects.equals(this.targetProductSchema, productSpecificationCreate.targetProductSchema) &&
        Objects.equals(this.validFor, productSpecificationCreate.validFor) &&
        Objects.equals(this._atBaseType, productSpecificationCreate._atBaseType) &&
        Objects.equals(this._atSchemaLocation, productSpecificationCreate._atSchemaLocation) &&
        Objects.equals(this._atType, productSpecificationCreate._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, description, isBundle, lastUpdate, lifecycleStatus, name, productNumber, version, attachment, bundledProductSpecification, productSpecCharacteristic, productSpecificationRelationship, relatedParty, resourceSpecification, serviceSpecification, targetProductSchema, validFor, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationCreate {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productNumber: ").append(toIndentedString(productNumber)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    bundledProductSpecification: ").append(toIndentedString(bundledProductSpecification)).append("\n");
    sb.append("    productSpecCharacteristic: ").append(toIndentedString(productSpecCharacteristic)).append("\n");
    sb.append("    productSpecificationRelationship: ").append(toIndentedString(productSpecificationRelationship)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    resourceSpecification: ").append(toIndentedString(resourceSpecification)).append("\n");
    sb.append("    serviceSpecification: ").append(toIndentedString(serviceSpecification)).append("\n");
    sb.append("    targetProductSchema: ").append(toIndentedString(targetProductSchema)).append("\n");
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
