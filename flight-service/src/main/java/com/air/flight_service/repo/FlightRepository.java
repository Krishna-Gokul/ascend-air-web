package com.air.flight_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.air.flight_service.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

	
}
