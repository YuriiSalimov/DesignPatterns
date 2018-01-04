package com.patterns.Factory.pizzafm;

public final class NYPizzaStore extends PizzaStore {

    Pizza createPizza(final String item) {
        final Pizza pizza;
        if (item.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else {
            pizza = null;
        }
        return pizza;
    }
}
