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
import jakarta.validation.Valid;

/**
 * A period of time, either as a deadline (endDateTime only) a startDateTime only, or both
 */
@Schema(description = "A period of time, either as a deadline (endDateTime only) a startDateTime only, or both")
@Validated
@NotUndefined
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-05-22T16:36:15.642271455Z[GMT]")


public class TimePeriod   {
  @JsonProperty("endDateTime")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime endDateTime = null;

  @JsonProperty("startDateTime")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime startDateTime = null;


  public TimePeriod endDateTime(OffsetDateTime endDateTime) { 

    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * End of the time period, using IETC-RFC-3339 format
   * @return endDateTime
   **/
  
  @Schema(description = "End of the time period, using IETC-RFC-3339 format")
  
@Valid
  public OffsetDateTime getEndDateTime() {  
    return endDateTime;
  }



  public void setEndDateTime(OffsetDateTime endDateTime) { 
    this.endDateTime = endDateTime;
  }

  public TimePeriod startDateTime(OffsetDateTime startDateTime) { 

    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Start of the time period, using IETC-RFC-3339 format. If you define a start, you must also define an end
   * @return startDateTime
   **/
  
  @Schema(description = "Start of the time period, using IETC-RFC-3339 format. If you define a start, you must also define an end")
  
@Valid
  public OffsetDateTime getStartDateTime() {  
    return startDateTime;
  }



  public void setStartDateTime(OffsetDateTime startDateTime) { 
    this.startDateTime = startDateTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriod timePeriod = (TimePeriod) o;
    return Objects.equals(this.endDateTime, timePeriod.endDateTime) &&
        Objects.equals(this.startDateTime, timePeriod.startDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDateTime, startDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriod {\n");
    
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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
