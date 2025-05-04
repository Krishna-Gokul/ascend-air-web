package com.air.flight_service.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.air.flight_service.DTO.FlightDTO;
import com.air.flight_service.entity.Flight;
import com.air.flight_service.repo.FlightRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class FlightServiceImpl implements FlightService {

	private final FlightRepository flightRepo;
	
	@Override
	public String createFlight(FlightDTO dto) {
		if(null == dto) {
			return "DTO is null, in create flight";
		}
		Flight newFlight = Flight.builder()
								.flightNo(dto.getFlightNo())
								.flightName(dto.getFlightName())
								.flightMake(dto.getFlightMake())
								.flightCapacity(dto.getFlightCapacity())
								.flightOrigin(dto.getFlightOrigin())
								.availableSeats(dto.getAvailableSeats())
								.flightDestination(dto.getFlightDestination())
								.depatureTime(dto.getDepatureTime())
								.arrivalTime(dto.getArrivalTime())
								.build();
		flightRepo.save(newFlight);
		return "create Flight success! with FlightId " + newFlight.getFlightId();
	}


	@Override
	public List<FlightDTO> getAllFlights() {
		List<Flight> list =  flightRepo.findAll();
		List<FlightDTO> dtoList = list.stream().map(flight -> Flight.generateDTO(flight)).collect(Collectors.toList());
		return dtoList;
	}


	@Override
	public FlightDTO getFlightByFlightNumber(Integer flightNo) {
		Optional<Flight> opt = flightRepo.findById(flightNo);
		if(opt.isEmpty()) {
			return null;
		}
		Flight flight = opt.get();
		return Flight.generateDTO(flight);
	}


	@Override
	public String deleteFlight(Integer flightNo) {
		flightRepo.deleteById(flightNo);
		return "successfully deleted the flight!";
	}


	@Override
	public FlightDTO updateFlight(FlightDTO dto) {
		Optional<Flight> opt = flightRepo.findById(dto.getFlightNo());
		if(opt.isEmpty()) {
			return null;
		}
		Flight flight = opt.get();
		return Flight.generateDTO(flight);
	}
	
}
