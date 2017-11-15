package com.design.decorator;

public class PannerPiza extends PizzaDecorator {

	PannerPiza(PizzaHot pizza) {
		super(pizza);
	}

	@Override
	public void assemble(String name) {
		System.out.println("inside pizza Panner pizza class" +name);
	}

}
