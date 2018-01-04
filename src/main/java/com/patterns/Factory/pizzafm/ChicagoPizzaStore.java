package com.patterns.Factory.pizzafm;

public final class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(final String item) {
        final Pizza pizza;
        if (item.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else {
            pizza = null;
        }
        return pizza;
    }
}
