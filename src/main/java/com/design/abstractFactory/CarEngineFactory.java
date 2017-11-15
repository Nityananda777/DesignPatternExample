package com.design.abstractFactory;

public class CarEngineFactory extends EngineFactory {

	@Override
	public EngineFactory getEngine() {
		// TODO Auto-generated method stub
		return new CarEngineFactory();
	}

}
