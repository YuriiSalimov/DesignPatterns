package com.patterns.Factory.pizzas;

public final class ClamPizza extends Pizza {

    public ClamPizza() {
        this.name = "Clam Pizza";
        this.dough = "Thin crust";
        this.sauce = "White garlic sauce";
        this.toppings.add("Clams");
        this.toppings.add("Grated parmesan cheese");
    }
}
