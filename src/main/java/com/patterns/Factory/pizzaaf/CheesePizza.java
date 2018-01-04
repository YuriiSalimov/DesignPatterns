package com.patterns.Factory.pizzaaf;

public final class CheesePizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    public CheesePizza(final PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + this.name);
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
        this.cheese = this.ingredientFactory.createCheese();
    }
}
