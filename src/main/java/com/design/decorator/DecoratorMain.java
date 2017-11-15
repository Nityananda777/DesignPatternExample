package com.design.decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		PizzaHot piza = new BasicPiza();
		piza.assemble("basic piza");
		PizzaHot grilPiza = new PizzaDecorator(new GrillPizza(new BasicPiza()));
		grilPiza.assemble("grill pizza ");
		PizzaHot grilPannerPiza = new PizzaDecorator(new GrillPizza(new PannerPiza(new BasicPiza())));
		grilPannerPiza.assemble("grill panner pizza ");
	}

}
