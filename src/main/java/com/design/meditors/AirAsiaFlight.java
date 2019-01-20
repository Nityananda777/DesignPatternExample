package com.design.meditors;

public class AirAsiaFlight implements Flight {
	private ATCcontroller atcCcontroller;
	private String name;
	AirAsiaFlight(String name,ATCcontroller atcCcontroller) {
		this.atcCcontroller = atcCcontroller;
		this.name=name;
	}

	@Override
	public void land(String s) {
		// TODO Auto-generated method stub
		System.out.println("Landing is done for : "+s);
	}

	@Override
	public boolean runningStatus() {
		// TODO Auto-generated method stub
		return false;
	}

}
