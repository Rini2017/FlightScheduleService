package com.cognizant.airport.schedule.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.cognizant.airport.schedule.model.InlineResponse200FlightScheduleStop;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * InlineResponse200FlightScheduleRoute
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-31T14:44:55.945Z")

public class InlineResponse200FlightScheduleRoute   {
  @JsonProperty("NoOfStop")
  private String noOfStop = null;

  @JsonProperty("RouteId")
  private String routeId = null;

  @JsonProperty("Stop")
  private List<InlineResponse200FlightScheduleStop> stop = new ArrayList<InlineResponse200FlightScheduleStop>();

  @JsonProperty("StopOver")
  private String stopOver = null;

  @JsonProperty("TotalTravelTime")
  private String totalTravelTime = null;

  public InlineResponse200FlightScheduleRoute noOfStop(String noOfStop) {
    this.noOfStop = noOfStop;
    return this;
  }

   /**
   * Get noOfStop
   * @return noOfStop
  **/
  @ApiModelProperty(value = "")
  public String getNoOfStop() {
    return noOfStop;
  }

  public void setNoOfStop(String noOfStop) {
    this.noOfStop = noOfStop;
  }

  public InlineResponse200FlightScheduleRoute routeId(String routeId) {
    this.routeId = routeId;
    return this;
  }

   /**
   * Get routeId
   * @return routeId
  **/
  @ApiModelProperty(value = "")
  public String getRouteId() {
    return routeId;
  }

  public void setRouteId(String routeId) {
    this.routeId = routeId;
  }

  public InlineResponse200FlightScheduleRoute stop(List<InlineResponse200FlightScheduleStop> stop) {
    this.stop = stop;
    return this;
  }

  public InlineResponse200FlightScheduleRoute addStopItem(InlineResponse200FlightScheduleStop stopItem) {
    this.stop.add(stopItem);
    return this;
  }

   /**
   * Get stop
   * @return stop
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200FlightScheduleStop> getStop() {
    return stop;
  }

  public void setStop(List<InlineResponse200FlightScheduleStop> stop) {
    this.stop = stop;
  }

  public InlineResponse200FlightScheduleRoute stopOver(String stopOver) {
    this.stopOver = stopOver;
    return this;
  }

   /**
   * Get stopOver
   * @return stopOver
  **/
  @ApiModelProperty(value = "")
  public String getStopOver() {
    return stopOver;
  }

  public void setStopOver(String stopOver) {
    this.stopOver = stopOver;
  }

  public InlineResponse200FlightScheduleRoute totalTravelTime(String totalTravelTime) {
    this.totalTravelTime = totalTravelTime;
    return this;
  }

   /**
   * Get totalTravelTime
   * @return totalTravelTime
  **/
  @ApiModelProperty(value = "")
  public String getTotalTravelTime() {
    return totalTravelTime;
  }

  public void setTotalTravelTime(String totalTravelTime) {
    this.totalTravelTime = totalTravelTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200FlightScheduleRoute inlineResponse200FlightScheduleRoute = (InlineResponse200FlightScheduleRoute) o;
    return Objects.equals(this.noOfStop, inlineResponse200FlightScheduleRoute.noOfStop) &&
        Objects.equals(this.routeId, inlineResponse200FlightScheduleRoute.routeId) &&
        Objects.equals(this.stop, inlineResponse200FlightScheduleRoute.stop) &&
        Objects.equals(this.stopOver, inlineResponse200FlightScheduleRoute.stopOver) &&
        Objects.equals(this.totalTravelTime, inlineResponse200FlightScheduleRoute.totalTravelTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noOfStop, routeId, stop, stopOver, totalTravelTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200FlightScheduleRoute {\n");
    
    sb.append("    noOfStop: ").append(toIndentedString(noOfStop)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    stopOver: ").append(toIndentedString(stopOver)).append("\n");
    sb.append("    totalTravelTime: ").append(toIndentedString(totalTravelTime)).append("\n");
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

