package com.cognizant.airport.schedule.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.cognizant.airport.schedule.model.InlineResponse200FlightScheduleRoute;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * InlineResponse200FlightSchedule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-31T14:44:55.945Z")

public class InlineResponse200FlightSchedule   {
  @JsonProperty("Dest")
  private String dest = null;

  @JsonProperty("DestinationAirport")
  private String destinationAirport = null;

  @JsonProperty("Route")
  private List<InlineResponse200FlightScheduleRoute> route = new ArrayList<InlineResponse200FlightScheduleRoute>();

  @JsonProperty("Source")
  private String source = null;

  @JsonProperty("SourceAirport")
  private String sourceAirport = null;

  @JsonProperty("TravelTime")
  private String travelTime = null;

  public InlineResponse200FlightSchedule dest(String dest) {
    this.dest = dest;
    return this;
  }

   /**
   * Get dest
   * @return dest
  **/
  @ApiModelProperty(value = "")
  public String getDest() {
    return dest;
  }

  public void setDest(String dest) {
    this.dest = dest;
  }

  public InlineResponse200FlightSchedule destinationAirport(String destinationAirport) {
    this.destinationAirport = destinationAirport;
    return this;
  }

   /**
   * Get destinationAirport
   * @return destinationAirport
  **/
  @ApiModelProperty(value = "")
  public String getDestinationAirport() {
    return destinationAirport;
  }

  public void setDestinationAirport(String destinationAirport) {
    this.destinationAirport = destinationAirport;
  }

  public InlineResponse200FlightSchedule route(List<InlineResponse200FlightScheduleRoute> route) {
    this.route = route;
    return this;
  }

  public InlineResponse200FlightSchedule addRouteItem(InlineResponse200FlightScheduleRoute routeItem) {
    this.route.add(routeItem);
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200FlightScheduleRoute> getRoute() {
    return route;
  }

  public void setRoute(List<InlineResponse200FlightScheduleRoute> route) {
    this.route = route;
  }

  public InlineResponse200FlightSchedule source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public InlineResponse200FlightSchedule sourceAirport(String sourceAirport) {
    this.sourceAirport = sourceAirport;
    return this;
  }

   /**
   * Get sourceAirport
   * @return sourceAirport
  **/
  @ApiModelProperty(value = "")
  public String getSourceAirport() {
    return sourceAirport;
  }

  public void setSourceAirport(String sourceAirport) {
    this.sourceAirport = sourceAirport;
  }

  public InlineResponse200FlightSchedule travelTime(String travelTime) {
    this.travelTime = travelTime;
    return this;
  }

   /**
   * Get travelTime
   * @return travelTime
  **/
  @ApiModelProperty(value = "")
  public String getTravelTime() {
    return travelTime;
  }

  public void setTravelTime(String travelTime) {
    this.travelTime = travelTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200FlightSchedule inlineResponse200FlightSchedule = (InlineResponse200FlightSchedule) o;
    return Objects.equals(this.dest, inlineResponse200FlightSchedule.dest) &&
        Objects.equals(this.destinationAirport, inlineResponse200FlightSchedule.destinationAirport) &&
        Objects.equals(this.route, inlineResponse200FlightSchedule.route) &&
        Objects.equals(this.source, inlineResponse200FlightSchedule.source) &&
        Objects.equals(this.sourceAirport, inlineResponse200FlightSchedule.sourceAirport) &&
        Objects.equals(this.travelTime, inlineResponse200FlightSchedule.travelTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dest, destinationAirport, route, source, sourceAirport, travelTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200FlightSchedule {\n");
    
    sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
    sb.append("    destinationAirport: ").append(toIndentedString(destinationAirport)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceAirport: ").append(toIndentedString(sourceAirport)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
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

