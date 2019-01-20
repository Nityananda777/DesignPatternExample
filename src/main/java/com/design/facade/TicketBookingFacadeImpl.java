package com.design.facade;

public class TicketBookingFacadeImpl implements TicketBookingFacade {

	private FlightBooking flightBooking;

	TicketBookingFacadeImpl() {
	}

	@Override
	public BookStatus bookTicket(FlightDetails flightDetails, UserDetails userDetails) {
		BookStatus status = new BookStatus();

		status.setFlightStatus(getFlightBookingFactory(flightDetails).bookFlight(flightDetails, userDetails));
		// status.setReport(getReportFactory(userDetails).generateReport());
		status.setUserDetails(userDetails);

		return status;
	}

	private FlightBooking getFlightBookingFactory(FlightDetails flightDetails) {
		if (flightDetails.getFlight_Type().equals("Domestic")) {
			flightBooking = new DomesticFlight(new CashPayment(), new HtmlReport());
		} else {
			flightBooking = new InternationFlight(new CashPayment());
		}
		return flightBooking;
	}

}
