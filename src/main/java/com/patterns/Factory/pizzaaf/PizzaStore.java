package com.patterns.Factory.pizzaaf;

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

    protected abstract Pizza createPizza(final String item);
}
