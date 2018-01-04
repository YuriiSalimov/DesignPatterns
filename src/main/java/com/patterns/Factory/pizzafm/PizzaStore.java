package com.patterns.Factory.pizzafm;

public abstract class PizzaStore {

	public Pizza orderPizza(final String type) {
		final Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	abstract Pizza createPizza(final String item);
}
