package com.design.meditors;

public class ATCcontrollerImpl implements ATCcontroller {

	private Flight flight;
	private boolean status;

	@Override
	public void registerFlight(Flight flight) {
		// TODO Auto-generated method stub
		this.flight = flight;
	}
	@Override
	public void setLandingStatus(boolean status) {
		this.status = status;
	}

	@Override
	public Flight getFlightDetails(String name) {
		return flight;
	}

	@Override
	public boolean getLandingStatus() {
		// TODO Auto-generated method stub
		return this.status;
	}



}
