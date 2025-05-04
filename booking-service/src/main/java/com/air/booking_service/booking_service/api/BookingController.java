package com.air.booking_service.booking_service.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.air.booking_service.booking_service.model.Booking;
import com.air.booking_service.booking_service.service.BookingService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookingController {

	private final BookingService service;
	
	@PostMapping("/flight")
	public ResponseEntity<String> bookFlight(@RequestBody Booking book) {
		service.bookFlight(book);
		return new ResponseEntity<>("success", HttpStatus.CREATED);
	}
	
	
}
