package com.design.meditors;

public interface ATCcontroller {

	void registerFlight(Flight flight);
	Flight getFlightDetails(String name);

	void setLandingStatus(boolean status);
	boolean getLandingStatus();
	
}
