package com.cognizant.airport.schedule.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.airport.schedule.model.InlineResponse200;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-31T14:44:55.945Z")

@Api(value = "getFlightSchedule", description = "the FlightSchedule API")
public interface AirPortScheduleApi {

    @ApiOperation(value = "gets the flight schedule", notes = "By passing the source and destination location will gives the avilable schedules  ", response = InlineResponse200.class, tags={"SearchFlightSchedule"  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Airport Scheule for matching criteria", response = InlineResponse200.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/getFlightSchedule",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> searchFlightSchedule( @NotNull @ApiParam(value = "Source Airport code", required = true) @RequestParam(value = "sourceLocation", required = true) String sourceLocation,
         @NotNull @ApiParam(value = "Destination Airport code", required = true) @RequestParam(value = "destLocation", required = true) String destLocation,
         @NotNull @ApiParam(value = "From date", required = true) @RequestParam(value = "fromDate", required = true) String fromDate,
         @NotNull @ApiParam(value = "To date", required = true) @RequestParam(value = "toDate", required = true) String toDate);

}
