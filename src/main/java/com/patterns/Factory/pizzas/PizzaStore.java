package com.patterns.Factory.pizzas;

public final class PizzaStore {

    private final SimplePizzaFactory factory;

    public PizzaStore(final SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(final String type) {
        final Pizza pizza = this.factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
