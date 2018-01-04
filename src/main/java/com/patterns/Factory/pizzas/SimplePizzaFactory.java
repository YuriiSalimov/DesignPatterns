package com.patterns.Factory.pizzas;

public final class SimplePizzaFactory {

    public Pizza createPizza(final String type) {
        final Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
