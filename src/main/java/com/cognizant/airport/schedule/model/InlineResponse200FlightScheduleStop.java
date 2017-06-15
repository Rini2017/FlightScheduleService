package com.cognizant.airport.schedule.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * InlineResponse200FlightScheduleStop
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-31T14:44:55.945Z")

public class InlineResponse200FlightScheduleStop   {
  @JsonProperty("ArivalLocation")
  private String arivalLocation = null;

  @JsonProperty("ArivalTime")
  private String arivalTime = null;

  @JsonProperty("DepartureLocation")
  private String departureLocation = null;

  @JsonProperty("DepartureTime")
  private String departureTime = null;

  @JsonProperty("FlightNo")
  private String flightNo = null;

  @JsonProperty("Leg")
  private String leg = null;

  @JsonProperty("TravelTime")
  private String travelTime = null;

  public InlineResponse200FlightScheduleStop arivalLocation(String arivalLocation) {
    this.arivalLocation = arivalLocation;
    return this;
  }

   /**
   * Get arivalLocation
   * @return arivalLocation
  **/
  @ApiModelProperty(value = "")
  public String getArivalLocation() {
    return arivalLocation;
  }

  public void setArivalLocation(String arivalLocation) {
    this.arivalLocation = arivalLocation;
  }

  public InlineResponse200FlightScheduleStop arivalTime(String arivalTime) {
    this.arivalTime = arivalTime;
    return this;
  }

   /**
   * Get arivalTime
   * @return arivalTime
  **/
  @ApiModelProperty(value = "")
  public String getArivalTime() {
    return arivalTime;
  }

  public void setArivalTime(String arivalTime) {
    this.arivalTime = arivalTime;
  }

  public InlineResponse200FlightScheduleStop departureLocation(String departureLocation) {
    this.departureLocation = departureLocation;
    return this;
  }

   /**
   * Get departureLocation
   * @return departureLocation
  **/
  @ApiModelProperty(value = "")
  public String getDepartureLocation() {
    return departureLocation;
  }

  public void setDepartureLocation(String departureLocation) {
    this.departureLocation = departureLocation;
  }

  public InlineResponse200FlightScheduleStop departureTime(String departureTime) {
    this.departureTime = departureTime;
    return this;
  }

   /**
   * Get departureTime
   * @return departureTime
  **/
  @ApiModelProperty(value = "")
  public String getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }

  public InlineResponse200FlightScheduleStop flightNo(String flightNo) {
    this.flightNo = flightNo;
    return this;
  }

   /**
   * Get flightNo
   * @return flightNo
  **/
  @ApiModelProperty(value = "")
  public String getFlightNo() {
    return flightNo;
  }

  public void setFlightNo(String flightNo) {
    this.flightNo = flightNo;
  }

  public InlineResponse200FlightScheduleStop leg(String leg) {
    this.leg = leg;
    return this;
  }

   /**
   * Get leg
   * @return leg
  **/
  @ApiModelProperty(value = "")
  public String getLeg() {
    return leg;
  }

  public void setLeg(String leg) {
    this.leg = leg;
  }

  public InlineResponse200FlightScheduleStop travelTime(String travelTime) {
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
    InlineResponse200FlightScheduleStop inlineResponse200FlightScheduleStop = (InlineResponse200FlightScheduleStop) o;
    return Objects.equals(this.arivalLocation, inlineResponse200FlightScheduleStop.arivalLocation) &&
        Objects.equals(this.arivalTime, inlineResponse200FlightScheduleStop.arivalTime) &&
        Objects.equals(this.departureLocation, inlineResponse200FlightScheduleStop.departureLocation) &&
        Objects.equals(this.departureTime, inlineResponse200FlightScheduleStop.departureTime) &&
        Objects.equals(this.flightNo, inlineResponse200FlightScheduleStop.flightNo) &&
        Objects.equals(this.leg, inlineResponse200FlightScheduleStop.leg) &&
        Objects.equals(this.travelTime, inlineResponse200FlightScheduleStop.travelTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arivalLocation, arivalTime, departureLocation, departureTime, flightNo, leg, travelTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200FlightScheduleStop {\n");
    
    sb.append("    arivalLocation: ").append(toIndentedString(arivalLocation)).append("\n");
    sb.append("    arivalTime: ").append(toIndentedString(arivalTime)).append("\n");
    sb.append("    departureLocation: ").append(toIndentedString(departureLocation)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    flightNo: ").append(toIndentedString(flightNo)).append("\n");
    sb.append("    leg: ").append(toIndentedString(leg)).append("\n");
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

