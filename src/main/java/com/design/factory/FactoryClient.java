package com.design.factory;

public class FactoryClient {

	public static void main(String[] args) {
		VehicleEngine engine;
		// TODO Auto-generated method stub
		EngineFactory f = new EngineFactory();
		engine = f.getVehicleEngine("car");
		engine.produceEngine("Honda");
		engine = f.getVehicleEngine("bus");
		engine.produceEngine("TATA");
		engine = f.getVehicleEngine("truck");
		engine.produceEngine("Ashok Leyland");
	}

}
