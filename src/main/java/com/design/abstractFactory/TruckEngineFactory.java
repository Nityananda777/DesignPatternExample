package com.design.abstractFactory;

public class TruckEngineFactory extends EngineFactory {

	@Override
	public EngineFactory getEngine() {
		// TODO Auto-generated method stub
		return new TruckEngineFactory();
	}

}
