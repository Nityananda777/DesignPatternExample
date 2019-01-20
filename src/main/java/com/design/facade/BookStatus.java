package com.design.facade;

public class BookStatus {

	private String bookingStatus;
	private FlightStatus flightStatus;
	private ReportDetails report;
	private boolean paymentStatus;
	private UserDetails userDetails;
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	
	public void setFlightStatus(FlightStatus flightStatus) {
		this.flightStatus = flightStatus;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public boolean getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public ReportDetails getReport() {
		return report;
	}

	public void setReport(ReportDetails report) {
		this.report = report;
	}

	public FlightStatus getFlightStatus() {
		return flightStatus;
	}
}
