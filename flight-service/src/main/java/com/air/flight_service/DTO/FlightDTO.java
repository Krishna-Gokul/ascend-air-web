package com.air.flight_service.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class FlightDTO {

	private String flightNo;
	
	private String flightName;
	
	private String flightMake;
	
	private Integer flightCapacity;
	
	private Integer availableSeats;
	
	private String flightOrigin;
	
	private LocalDateTime depatureTime;
	
	private LocalDateTime arrivalTime;
	
}
