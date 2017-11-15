package com.design.factory;

public class EngineFactory {
	VehicleEngine engine;

	public VehicleEngine getVehicleEngine(String engineName) {
		if (engineName.equals("car")) {
			engine = new CarEngine();
		} else if (engineName.equals("bus")) {
			engine = new BusEngine();
		} else if (engineName.equals("truck")) {
			engine = new TruckEngine();
		}
		return engine;
	}
}
