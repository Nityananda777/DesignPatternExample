package com.design.facade;

import java.io.Serializable;

public class FlightDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String Flight_Num;
	private String FlightDate;
	private String Time;
	private int Num_Of_Seats;
	private String Source;
	private String Destination;
	private String flight_Type;
	private String payment_Type;
	public FlightDetails() {
		super();
	}

	// constructor for the flightDetails class
	public FlightDetails(String fn, String fd, String t, int ns, String s, String d) {
		this.Flight_Num = fn;
		this.FlightDate = fd;
		this.Time = t;
		this.Num_Of_Seats = ns;
		this.Source = s;
		this.Destination = d;
	}

	public String getFlight_Num() {
		return Flight_Num;
	}
	public String getPayment_Type() {
		return payment_Type;
	}

	public void setPayment_Type(String payment_Type) {
		this.payment_Type = payment_Type;
	}

	public void setFlight_Num(String flight_Num) {
		Flight_Num = flight_Num;
	}

	public String getFlightDate() {
		return FlightDate;
	}

	public void setFlightDate(String flightDate) {
		FlightDate = flightDate;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public int getNum_Of_Seats() {
		return Num_Of_Seats;
	}

	public void setNum_Of_Seats(int num_Of_Seats) {
		Num_Of_Seats = num_Of_Seats;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public String getFlight_Type() {
		return flight_Type;
	}

	public void setFlight_Type(String flight_Type) {
		this.flight_Type = flight_Type;
	}

}
