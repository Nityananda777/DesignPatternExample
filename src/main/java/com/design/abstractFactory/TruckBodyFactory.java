package com.design.abstractFactory;

public class TruckBodyFactory extends BodyFactory {

	@Override
	public BodyFactory getVechicleBody() {
		// TODO Auto-generated method stub
		return new TruckBodyFactory();
	}

}
