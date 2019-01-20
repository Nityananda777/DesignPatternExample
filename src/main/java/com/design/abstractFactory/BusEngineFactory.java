package com.design.abstractFactory;

public  class BusEngineFactory extends EngineFactory {

	@Override
	public EngineFactory getEngine() {
		// TODO Auto-generated method stub
		return new BusEngineFactory();
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
