package com.design.meditors;

public class AirIndiaFlight implements Flight {
	private ATCcontroller atcCcontroller;
	private boolean status;
	private String name;

	AirIndiaFlight(String name, ATCcontroller atcCcontroller) {
		this.atcCcontroller = atcCcontroller;
		this.name=name;
	}

	@Override
	public void land(String s) {
		System.out.println("Landing is done for : " + s);

	}

	@Override
	public boolean runningStatus() {
		// TODO Auto-generated method stub
		return status;
	}

}
