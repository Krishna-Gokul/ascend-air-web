package com.air.flight_service.service;

import java.util.List;

import com.air.flight_service.DTO.FlightDTO;

public interface FlightService {

	public String createFlight(FlightDTO dto);
	
	public List<FlightDTO> getAllFlights();
}
