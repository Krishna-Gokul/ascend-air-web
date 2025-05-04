package com.air.booking_service.booking_service.service;

import org.springframework.stereotype.Service;

import com.air.booking_service.booking_service.model.Booking;
import com.air.booking_service.booking_service.repo.BookingRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

	private final BookingRepository repo;

	@Override
	public String bookFlight(Booking b) {
		repo.save(b);
		return "success";
	}

	
}
