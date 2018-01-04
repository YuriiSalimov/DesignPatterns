package com.patterns.Factory.pizzafm;

public final class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        this.name = "Chicago Style Pepperoni Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";
        this.toppings.add("Shredded Mozzarella Cheese");
        this.toppings.add("Black Olives");
        this.toppings.add("Spinach");
        this.toppings.add("Eggplant");
        this.toppings.add("Sliced Pepperoni");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
