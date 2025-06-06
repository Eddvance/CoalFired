package io.coalfired.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import io.coalfired.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;

/**
 * Represents a task used to import resources from a file
 */
@Schema(description = "Represents a task used to import resources from a file")
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-05-22T16:36:15.642271455Z[GMT]")


public class ImportJob   {
  @JsonProperty("id")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String id = null;

  @JsonProperty("href")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String href = null;

  @JsonProperty("completionDate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime completionDate = null;

  @JsonProperty("contentType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String contentType = null;

  @JsonProperty("creationDate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime creationDate = null;

  @JsonProperty("errorLog")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String errorLog = null;

  @JsonProperty("path")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String path = null;

  @JsonProperty("url")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String url = null;

  @JsonProperty("status")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private JobStateType status = null;

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


  public ImportJob id(String id) { 

    this.id = id;
    return this;
  }

  /**
   * Identifier of the import job
   * @return id
   **/
  
  @Schema(description = "Identifier of the import job")
  
  public String getId() {  
    return id;
  }



  public void setId(String id) { 
    this.id = id;
  }

  public ImportJob href(String href) { 

    this.href = href;
    return this;
  }

  /**
   * Reference of the import job
   * @return href
   **/
  
  @Schema(description = "Reference of the import job")
  
  public String getHref() {  
    return href;
  }



  public void setHref(String href) { 
    this.href = href;
  }

  public ImportJob completionDate(OffsetDateTime completionDate) { 

    this.completionDate = completionDate;
    return this;
  }

  /**
   * Date at which the job was completed
   * @return completionDate
   **/
  
  @Schema(description = "Date at which the job was completed")
  
@Valid
  public OffsetDateTime getCompletionDate() {  
    return completionDate;
  }



  public void setCompletionDate(OffsetDateTime completionDate) { 
    this.completionDate = completionDate;
  }

  public ImportJob contentType(String contentType) { 

    this.contentType = contentType;
    return this;
  }

  /**
   * Indicates the format of the imported data
   * @return contentType
   **/
  
  @Schema(description = "Indicates the format of the imported data")
  
  public String getContentType() {  
    return contentType;
  }



  public void setContentType(String contentType) { 
    this.contentType = contentType;
  }

  public ImportJob creationDate(OffsetDateTime creationDate) { 

    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date at which the job was created
   * @return creationDate
   **/
  
  @Schema(description = "Date at which the job was created")
  
@Valid
  public OffsetDateTime getCreationDate() {  
    return creationDate;
  }



  public void setCreationDate(OffsetDateTime creationDate) { 
    this.creationDate = creationDate;
  }

  public ImportJob errorLog(String errorLog) { 

    this.errorLog = errorLog;
    return this;
  }

  /**
   * Reason for failure if status is failed
   * @return errorLog
   **/
  
  @Schema(description = "Reason for failure if status is failed")
  
  public String getErrorLog() {  
    return errorLog;
  }



  public void setErrorLog(String errorLog) { 
    this.errorLog = errorLog;
  }

  public ImportJob path(String path) { 

    this.path = path;
    return this;
  }

  /**
   * URL of the root resource where the content of the file specified by the import job must be applied
   * @return path
   **/
  
  @Schema(description = "URL of the root resource where the content of the file specified by the import job must be applied")
  
  public String getPath() {  
    return path;
  }



  public void setPath(String path) { 
    this.path = path;
  }

  public ImportJob url(String url) { 

    this.url = url;
    return this;
  }

  /**
   * URL of the file containing the data to be imported
   * @return url
   **/
  
  @Schema(description = "URL of the file containing the data to be imported")
  
  public String getUrl() {  
    return url;
  }



  public void setUrl(String url) { 
    this.url = url;
  }

  public ImportJob status(JobStateType status) { 

    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  
  @Schema(description = "")
  
@Valid
  public JobStateType getStatus() {  
    return status;
  }



  public void setStatus(JobStateType status) { 
    this.status = status;
  }

  public ImportJob _atBaseType(String _atBaseType) { 

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

  public ImportJob _atSchemaLocation(String _atSchemaLocation) { 

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

  public ImportJob _atType(String _atType) { 

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
    ImportJob importJob = (ImportJob) o;
    return Objects.equals(this.id, importJob.id) &&
        Objects.equals(this.href, importJob.href) &&
        Objects.equals(this.completionDate, importJob.completionDate) &&
        Objects.equals(this.contentType, importJob.contentType) &&
        Objects.equals(this.creationDate, importJob.creationDate) &&
        Objects.equals(this.errorLog, importJob.errorLog) &&
        Objects.equals(this.path, importJob.path) &&
        Objects.equals(this.url, importJob.url) &&
        Objects.equals(this.status, importJob.status) &&
        Objects.equals(this._atBaseType, importJob._atBaseType) &&
        Objects.equals(this._atSchemaLocation, importJob._atSchemaLocation) &&
        Objects.equals(this._atType, importJob._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, completionDate, contentType, creationDate, errorLog, path, url, status, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    errorLog: ").append(toIndentedString(errorLog)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
