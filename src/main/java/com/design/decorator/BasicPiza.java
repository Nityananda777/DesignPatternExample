package com.design.decorator;

public class BasicPiza implements PizzaHot {

	@Override
	public void assemble(String name) {
		System.out.println(name + " Pizza deliverd.");
	}
}
