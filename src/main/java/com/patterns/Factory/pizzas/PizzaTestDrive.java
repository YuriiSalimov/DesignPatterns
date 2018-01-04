package com.patterns.Factory.pizzas;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		final SimplePizzaFactory factory = new SimplePizzaFactory();
		final PizzaStore store = new PizzaStore(factory);

		final Pizza cheesePizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + cheesePizza.getName() + "\n");

		final Pizza veggiePizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + veggiePizza.getName() + "\n");
	}
}
