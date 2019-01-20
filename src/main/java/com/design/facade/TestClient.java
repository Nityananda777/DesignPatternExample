package com.design.facade;

public class TestClient {

	public static void main(String[] args) {

		FlightDetails flightDetails = new FlightDetails();
		flightDetails.setFlight_Type("Domestic");
		flightDetails.setSource("Mumbai");
		flightDetails.setDestination("HYD");
		flightDetails.setFlightDate("20/02/2019");
		flightDetails.setNum_Of_Seats(2);
		flightDetails.setTime("12.01 AM");

		UserDetails userDetails = new UserDetails();
		userDetails.setPayment_Type("cash");
		userDetails.setPrice(122);
		userDetails.setReport_Type("pdf");
		userDetails.setUserName("RAM");
		userDetails.setTravelDate("20/01/2019");

		TicketBookingFacade facade = new TicketBookingFacadeImpl();
		facade.bookTicket(flightDetails, userDetails);
	}

}
