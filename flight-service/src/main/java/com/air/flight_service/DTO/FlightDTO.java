package com.air.flight_service.DTO;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FlightDTO {

	private Integer flightNo;
	
	private String flightName;
	
	private String flightMake;
	
	private Integer flightCapacity;
	
	private Integer availableSeats;
	
	private String flightOrigin;
	
	private String flightDestination;
	
	private LocalDateTime depatureTime;
	
	private LocalDateTime arrivalTime;
	
}
