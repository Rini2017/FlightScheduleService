package com.cognizant.airport.schedule.api;

import com.cognizant.airport.schedule.model.InlineResponse200;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-31T14:44:55.945Z")
@Controller
public class AirPortScheduleApiController implements AirPortScheduleApi {


    public ResponseEntity<InlineResponse200> searchFlightSchedule(@NotNull @ApiParam(value = "Source Airport code", required = true) @RequestParam(required = true) String sourceLocation,
                                                                  @NotNull @ApiParam(value = "Destination Airport code", required = true) @RequestParam(value = "destLocation",required = true) String destLocation,
                                                                  @NotNull @ApiParam(value = "From date", required = true) @RequestParam(value = "fromDate",required = true) String fromDate,
                                                                  @NotNull @ApiParam(value = "To date", required = true) @RequestParam(value = "toDate",required = true) String toDate) {


        final String uri = "https://api.mlab.com/api/1/databases/CloudFoundry_7ik8lbbn_9v82nfds/collections/AirRoute";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(uri).queryParam("q",
                                                                       "{'FlightSchedule.SourceAirport' : '" + sourceLocation
                                                                           + "','FlightSchedule.DestinationAirport' : '" + destLocation
                                                                           + "'}").queryParam("f", "{'_id': 0 }").queryParam("fo", "true")
                                                           .queryParam("apiKey", "L8xAbCxQBE1r-6Mt8sAFHwKi734Vpc7i");

        System.out.println("URI to mlab : " + builder.build().encode().toUri());
        
        InlineResponse200 response200;

        response200 = restTemplate.getForObject(builder.build().encode().toUri(), InlineResponse200.class);

        if (null == response200) {
            
            System.out.println("Response is null");
            return new ResponseEntity<InlineResponse200>(response200, HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<InlineResponse200>(response200, HttpStatus.OK);
    }

}
