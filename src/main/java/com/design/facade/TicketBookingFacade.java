package com.design.facade;

public interface TicketBookingFacade {

	BookStatus bookTicket(FlightDetails flightDetails, UserDetails userDetails);

}
