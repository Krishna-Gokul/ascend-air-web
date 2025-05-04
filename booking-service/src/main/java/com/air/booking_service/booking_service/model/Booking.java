package com.air.booking_service.booking_service.model;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "bookingDB")
public class Booking {

	@Id
	private int bookingId;
	
	private LocalDateTime bookingDate;
	
	private String bookingStatus;
	
	private String paymentStatus;
	
	private Integer flightId;
	
	private String passengerName;
	
	private Long mobileNo;
	
	private String origin;
	
	private String destination;
	
	private LocalDateTime depatureTime;
	
}
