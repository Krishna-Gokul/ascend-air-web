package com.air.flight_service.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "flight")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer flightId;

	@Column(name = "FlightNumber")
	private String flightNo;
	
	@Column(name = "FlightName")
	private String flightName;
	
	@Column(name = "FlightMake")
	private String flightMake;
	
	@Column(name = "Capacity")
	private Integer flightCapacity;
	
	@Column(name = "AvailableSeats")
	private Integer availableSeats;
	
	@Column(name = "Origin")
	private String flightOrigin;
	
	@Column(name = "DepatureTime")
	private LocalDateTime depatureTime;
	
	@Column(name = "ArrivalTime")
	private LocalDateTime arrivalTime;
}
