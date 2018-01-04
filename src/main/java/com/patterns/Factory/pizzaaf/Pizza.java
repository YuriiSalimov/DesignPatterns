package com.patterns.Factory.pizzaaf;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        result.append("---- ").append(this.name).append(" ----\n");
        if (this.dough != null) {
            result.append(this.dough).append("\n");
        }
        if (this.sauce != null) {
            result.append(this.sauce).append("\n");
        }
        if (this.cheese != null) {
            result.append(this.cheese).append("\n");
        }
        if (this.veggies != null) {
            for (int i = 0; i < this.veggies.length; i++) {
                result.append(this.veggies[i]);
                if (i < this.veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (this.clam != null) {
            result.append(this.clam).append("\n");
        }
        if (this.pepperoni != null) {
            result.append(this.pepperoni).append("\n");
        }
        return result.toString();
    }

    abstract void prepare();
}
