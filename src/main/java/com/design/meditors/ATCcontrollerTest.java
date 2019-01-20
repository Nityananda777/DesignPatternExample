package com.design.meditors;

public class ATCcontrollerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ATCcontroller controller = new ATCcontrollerImpl();
		Flight f1 = new AirAsiaFlight("Air Asia",controller);
		Flight f2 = new AirIndiaFlight("Air India",controller);
		Flight f3 = new IndigoFlight(controller);
		controller.registerFlight(f1);
		controller.registerFlight(f2);
		controller.registerFlight(f3);

		controller.getFlightDetails("Air Asia").land("flight is landing");
		controller.getFlightDetails("Air Asia").runningStatus();
	
	
	}

}
