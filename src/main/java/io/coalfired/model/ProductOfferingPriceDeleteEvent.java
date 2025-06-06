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
 * The notification data structure
 */
@Schema(description = "The notification data structure")
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-05-22T16:36:15.642271455Z[GMT]")


public class ProductOfferingPriceDeleteEvent   {
  @JsonProperty("id")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String id = null;

  @JsonProperty("href")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String href = null;

  @JsonProperty("eventId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String eventId = null;

  @JsonProperty("eventTime")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime eventTime = null;

  @JsonProperty("eventType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String eventType = null;

  @JsonProperty("correlationId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String correlationId = null;

  @JsonProperty("domain")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String domain = null;

  @JsonProperty("title")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String title = null;

  @JsonProperty("description")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String description = null;

  @JsonProperty("priority")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String priority = null;

  @JsonProperty("timeOcurred")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime timeOcurred = null;

  @JsonProperty("event")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private ProductOfferingPriceDeleteEventPayload event = null;


  public ProductOfferingPriceDeleteEvent id(String id) { 

    this.id = id;
    return this;
  }

  /**
   * Identifier of the Process flow
   * @return id
   **/
  
  @Schema(description = "Identifier of the Process flow")
  
  public String getId() {  
    return id;
  }



  public void setId(String id) { 
    this.id = id;
  }

  public ProductOfferingPriceDeleteEvent href(String href) { 

    this.href = href;
    return this;
  }

  /**
   * Reference of the ProcessFlow
   * @return href
   **/
  
  @Schema(description = "Reference of the ProcessFlow")
  
  public String getHref() {  
    return href;
  }



  public void setHref(String href) { 
    this.href = href;
  }

  public ProductOfferingPriceDeleteEvent eventId(String eventId) { 

    this.eventId = eventId;
    return this;
  }

  /**
   * The identifier of the notification.
   * @return eventId
   **/
  
  @Schema(description = "The identifier of the notification.")
  
  public String getEventId() {  
    return eventId;
  }



  public void setEventId(String eventId) { 
    this.eventId = eventId;
  }

  public ProductOfferingPriceDeleteEvent eventTime(OffsetDateTime eventTime) { 

    this.eventTime = eventTime;
    return this;
  }

  /**
   * Time of the event occurrence.
   * @return eventTime
   **/
  
  @Schema(description = "Time of the event occurrence.")
  
@Valid
  public OffsetDateTime getEventTime() {  
    return eventTime;
  }



  public void setEventTime(OffsetDateTime eventTime) { 
    this.eventTime = eventTime;
  }

  public ProductOfferingPriceDeleteEvent eventType(String eventType) { 

    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the notification.
   * @return eventType
   **/
  
  @Schema(description = "The type of the notification.")
  
  public String getEventType() {  
    return eventType;
  }



  public void setEventType(String eventType) { 
    this.eventType = eventType;
  }

  public ProductOfferingPriceDeleteEvent correlationId(String correlationId) { 

    this.correlationId = correlationId;
    return this;
  }

  /**
   * The correlation id for this event.
   * @return correlationId
   **/
  
  @Schema(description = "The correlation id for this event.")
  
  public String getCorrelationId() {  
    return correlationId;
  }



  public void setCorrelationId(String correlationId) { 
    this.correlationId = correlationId;
  }

  public ProductOfferingPriceDeleteEvent domain(String domain) { 

    this.domain = domain;
    return this;
  }

  /**
   * The domain of the event.
   * @return domain
   **/
  
  @Schema(description = "The domain of the event.")
  
  public String getDomain() {  
    return domain;
  }



  public void setDomain(String domain) { 
    this.domain = domain;
  }

  public ProductOfferingPriceDeleteEvent title(String title) { 

    this.title = title;
    return this;
  }

  /**
   * The title of the event.
   * @return title
   **/
  
  @Schema(description = "The title of the event.")
  
  public String getTitle() {  
    return title;
  }



  public void setTitle(String title) { 
    this.title = title;
  }

  public ProductOfferingPriceDeleteEvent description(String description) { 

    this.description = description;
    return this;
  }

  /**
   * An explnatory of the event.
   * @return description
   **/
  
  @Schema(description = "An explnatory of the event.")
  
  public String getDescription() {  
    return description;
  }



  public void setDescription(String description) { 
    this.description = description;
  }

  public ProductOfferingPriceDeleteEvent priority(String priority) { 

    this.priority = priority;
    return this;
  }

  /**
   * A priority.
   * @return priority
   **/
  
  @Schema(description = "A priority.")
  
  public String getPriority() {  
    return priority;
  }



  public void setPriority(String priority) { 
    this.priority = priority;
  }

  public ProductOfferingPriceDeleteEvent timeOcurred(OffsetDateTime timeOcurred) { 

    this.timeOcurred = timeOcurred;
    return this;
  }

  /**
   * The time the event occured.
   * @return timeOcurred
   **/
  
  @Schema(description = "The time the event occured.")
  
@Valid
  public OffsetDateTime getTimeOcurred() {  
    return timeOcurred;
  }



  public void setTimeOcurred(OffsetDateTime timeOcurred) { 
    this.timeOcurred = timeOcurred;
  }

  public ProductOfferingPriceDeleteEvent event(ProductOfferingPriceDeleteEventPayload event) { 

    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   **/
  
  @Schema(description = "")
  
@Valid
  public ProductOfferingPriceDeleteEventPayload getEvent() {  
    return event;
  }



  public void setEvent(ProductOfferingPriceDeleteEventPayload event) { 
    this.event = event;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingPriceDeleteEvent productOfferingPriceDeleteEvent = (ProductOfferingPriceDeleteEvent) o;
    return Objects.equals(this.id, productOfferingPriceDeleteEvent.id) &&
        Objects.equals(this.href, productOfferingPriceDeleteEvent.href) &&
        Objects.equals(this.eventId, productOfferingPriceDeleteEvent.eventId) &&
        Objects.equals(this.eventTime, productOfferingPriceDeleteEvent.eventTime) &&
        Objects.equals(this.eventType, productOfferingPriceDeleteEvent.eventType) &&
        Objects.equals(this.correlationId, productOfferingPriceDeleteEvent.correlationId) &&
        Objects.equals(this.domain, productOfferingPriceDeleteEvent.domain) &&
        Objects.equals(this.title, productOfferingPriceDeleteEvent.title) &&
        Objects.equals(this.description, productOfferingPriceDeleteEvent.description) &&
        Objects.equals(this.priority, productOfferingPriceDeleteEvent.priority) &&
        Objects.equals(this.timeOcurred, productOfferingPriceDeleteEvent.timeOcurred) &&
        Objects.equals(this.event, productOfferingPriceDeleteEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingPriceDeleteEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
