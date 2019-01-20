package com.design.facade;

import java.util.UUID;

public class DomesticFlight implements FlightBooking {

	private Payment payment;
	private Report report;

	DomesticFlight(Payment payment, Report report) {
		this.payment = payment;
		this.report = report;
	}

	@Override
	public FlightStatus bookFlight(FlightDetails flightDetails, UserDetails userDetails) {
		ShoppingCart cart = new ShoppingCart();
		FlightStatus f = new FlightStatus();
		f.setSource(flightDetails.getSource());
		f.setDestination(flightDetails.getDestination());
		f.setStatus("Booked");
		f.setFlightNo("123");
		f.setFlightTime(flightDetails.getTime());

		payAndBookTicket(flightDetails, cart);

		System.out.println("Flight is booked .." + "from " + f.getSource() + " to " + f.getDestination() + " for User "
				+ userDetails.getUserName() + " and payment " + userDetails.getPrice() + "  is successfully paid.");

		System.out.println("...Genrating report..");
		report.generateReport();
		return f;
	}

	private void payAndBookTicket(FlightDetails flightDetails, ShoppingCart cart) {
		for (int i = 0; i < flightDetails.getNum_Of_Seats(); i++) {
			Ticket ticket = new Ticket(UUID.randomUUID().toString(), 1000);
			cart.addItem(ticket);
		}
		cart.pay(payment);
	}

}
