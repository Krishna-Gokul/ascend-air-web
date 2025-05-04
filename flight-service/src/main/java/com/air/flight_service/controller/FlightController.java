package com.air.flight_service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.air.flight_service.DTO.FlightDTO;
import com.air.flight_service.service.FlightService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/flight")
@RequiredArgsConstructor
public class FlightController {

	private final FlightService service;
	
	@PostMapping("/create")
	public ResponseEntity<String> createFlight(@RequestBody FlightDTO dto) {
		String mesg = service.createFlight(dto);
		return new ResponseEntity<>(mesg, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<FlightDTO>> getAllFlights() {
		List<FlightDTO> list = service.getAllFlights();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
