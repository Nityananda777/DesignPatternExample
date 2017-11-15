package com.design.decorator;

public class GrillPizza extends PizzaDecorator {

	GrillPizza(PizzaHot pizza) {
		super(pizza);
	}
	@Override
	public void assemble(String name) {
		System.out.println("inside grill pizza class " +name);
	}

}
