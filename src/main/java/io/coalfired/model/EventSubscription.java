package io.coalfired.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import io.coalfired.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import javax.validation.constraints.*;

/**
 * Sets the communication endpoint address the service instance must use to deliver notification information
 */
@Schema(description = "Sets the communication endpoint address the service instance must use to deliver notification information")
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-05-22T16:36:15.642271455Z[GMT]")


public class EventSubscription   {
  @JsonProperty("id")

  private String id = null;

  @JsonProperty("callback")

  private String callback = null;

  @JsonProperty("query")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String query = null;


  public EventSubscription id(String id) { 

    this.id = id;
    return this;
  }

  /**
   * Id of the listener
   * @return id
   **/
  
  @Schema(required = true, description = "Id of the listener")
  
  @NotNull
  public String getId() {  
    return id;
  }



  public void setId(String id) { 

    this.id = id;
  }

  public EventSubscription callback(String callback) { 

    this.callback = callback;
    return this;
  }

  /**
   * The callback being registered.
   * @return callback
   **/
  
  @Schema(required = true, description = "The callback being registered.")
  
  @NotNull
  public String getCallback() {  
    return callback;
  }



  public void setCallback(String callback) { 

    this.callback = callback;
  }

  public EventSubscription query(String query) { 

    this.query = query;
    return this;
  }

  /**
   * additional data to be passed
   * @return query
   **/
  
  @Schema(description = "additional data to be passed")
  
  public String getQuery() {  
    return query;
  }



  public void setQuery(String query) { 
    this.query = query;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSubscription eventSubscription = (EventSubscription) o;
    return Objects.equals(this.id, eventSubscription.id) &&
        Objects.equals(this.callback, eventSubscription.callback) &&
        Objects.equals(this.query, eventSubscription.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, callback, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSubscription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
