package com.design.abstractFactory;

public class BusBodyFactory extends BodyFactory {


	public BodyFactory getVechicleBody() {
		// TODO Auto-generated method stub
		return new BusBodyFactory();
	}

	@Override
	public EngineFactory getEngine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBodyName() {
		// TODO Auto-generated method stub
		return null;
	}

}
