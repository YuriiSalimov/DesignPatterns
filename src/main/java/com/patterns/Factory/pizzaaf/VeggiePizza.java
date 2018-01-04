package com.patterns.Factory.pizzaaf;

public final class VeggiePizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(final PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + this.name);
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
        this.cheese = this.ingredientFactory.createCheese();
        this.veggies = this.ingredientFactory.createVeggies();
    }
}
