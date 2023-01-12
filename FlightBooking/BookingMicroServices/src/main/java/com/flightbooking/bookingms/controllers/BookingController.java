package com.flightbooking.bookingms.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/FlightBooking")
public class BookingController {

	@GetMapping("/getFareDetails")
	public void getFareDetails() {
		
	}
	
	
}
