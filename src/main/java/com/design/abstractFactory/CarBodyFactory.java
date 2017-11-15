package com.design.abstractFactory;

public class CarBodyFactory extends BodyFactory {

	@Override
	public BodyFactory getVechicleBody() {
		// TODO Auto-generated method stub
		return new CarBodyFactory();
	}

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
