package com.design.meditors;

public class IndigoFlight implements Flight {
	private ATCcontroller atcCcontroller;

	IndigoFlight(ATCcontroller atcCcontroller) {
		this.atcCcontroller = atcCcontroller;
	}

	@Override
	public void land(String s) {
		System.out.println("Landing is done for : "+s);

	}

	@Override
	public boolean runningStatus() {
		// TODO Auto-generated method stub
		return true;
	}

}
