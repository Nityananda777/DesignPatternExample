package com.design.factory;

public class BusEngine implements VehicleEngine {

	public void produceEngine(String data) {
		System.out.println("Producing Bus engine from " + data + "plant");
	}

}
