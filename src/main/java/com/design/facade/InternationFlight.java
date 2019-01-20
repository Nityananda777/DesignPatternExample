package com.design.facade;

import java.util.UUID;

public class InternationFlight implements FlightBooking {

	private Payment payment;

	InternationFlight(Payment payment) {
		this.payment = payment;
	}
	@Override
	public FlightStatus bookFlight(FlightDetails flightDetails, UserDetails userDetails) {
		// TODO Auto-generated method stub
		ShoppingCart cart = new ShoppingCart();
		FlightStatus f = new FlightStatus();
		f.setSource(flightDetails.getSource());
		f.setDestination(flightDetails.getDestination());
		f.setStatus("Booked");
		f.setFlightNo("123");
		f.setFlightTime(flightDetails.getTime());

		for (int i = 0; i < flightDetails.getNum_Of_Seats(); i++) {
			Ticket ticket = new Ticket(UUID.randomUUID().toString(), 1000);
			cart.addItem(ticket);
		}
		cart.pay(payment);

		System.out.println("Flight is booked .." + "from " + f.getSource() + " to " + f.getDestination() + " for User "
				+ userDetails.getUserName() + " and payment " + userDetails.getPrice() + "  is successfully paid.");
		return f;
	}

}
