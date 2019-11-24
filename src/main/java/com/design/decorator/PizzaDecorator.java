package com.design.decorator;

public class PizzaDecorator implements PizzaHot {
	private PizzaHot pizza;

	PizzaDecorator(PizzaHot pizza) {
		this.pizza = pizza;
	}

	@Override
	public void assemble(String name) {
		System.out.println("inside pizza decorator");
		pizza.assemble(name);
	}

}
