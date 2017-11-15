package com.design.abstractFactory;

public class BusEngineFactory extends EngineFactory {

	@Override
	public EngineFactory getEngine() {
		// TODO Auto-generated method stub
		return new BusEngineFactory();
	}

}
