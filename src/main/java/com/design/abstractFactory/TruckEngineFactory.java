package com.design.abstractFactory;

public class TruckEngineFactory extends EngineFactory {

	@Override
	public EngineFactory getEngine() {
		// TODO Auto-generated method stub
		return new TruckEngineFactory();
	}

	@Override
	public BodyFactory getVechicleBody() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEngineName() {
		// TODO Auto-generated method stub
		return null;
	}

}
