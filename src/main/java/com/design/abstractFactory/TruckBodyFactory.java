package com.design.abstractFactory;

public class TruckBodyFactory extends BodyFactory {

	@Override
	public BodyFactory getVechicleBody() {
		// TODO Auto-generated method stub
		return new TruckBodyFactory();
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
