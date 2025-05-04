package com.air.flight_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.air.flight_service.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
