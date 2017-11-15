package com.design.abstractFactory;

public class BusBodyFactory extends BodyFactory {

	@Override
	public BodyFactory getVechicleBody() {
		// TODO Auto-generated method stub
		return new BusBodyFactory();
	}

}
