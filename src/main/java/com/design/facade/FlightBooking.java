package com.design.facade;

public interface FlightBooking {

	FlightStatus bookFlight(FlightDetails flightDetails,UserDetails userDetails);
}
