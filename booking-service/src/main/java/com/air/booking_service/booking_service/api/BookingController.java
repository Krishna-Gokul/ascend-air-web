package com.air.booking_service.booking_service.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		return ResponseEntity.ok().body("success");
	}
	
	@GetMapping("/get/bookingDetails/{bookingId}")
	public ResponseEntity<Booking> getBookingDetailsById(@PathVariable Integer bookingId) {
		System.out.println("get details controller method  is called");
		Booking book = service.getBookingDetailsById(bookingId);
		return ResponseEntity.ok(book);
	}
	
}
