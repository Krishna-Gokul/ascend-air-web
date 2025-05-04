package com.air.booking_service.booking_service.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.air.booking_service.booking_service.model.Booking;

@Repository
public interface Bookingrepository extends MongoRepository<Booking, Integer>{

}
