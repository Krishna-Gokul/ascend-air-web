package com.air.booking_service.booking_service.service;

import java.util.Optional;

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

	@Override
	public Booking getBookingDetailsById(Integer bookingId) {
		Optional<Booking> optBooking =  repo.findById(bookingId);
		if(optBooking.isPresent()) {
			System.out.println("PResent");
			return optBooking.get();
		}
		System.out.println("nujll is returned");
		return null;
	}

	
}
