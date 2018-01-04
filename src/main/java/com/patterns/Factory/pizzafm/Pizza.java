package com.patterns.Factory.pizzafm;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + this.name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : this.toppings) {
            System.out.println("   " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- ").append(this.name).append(" ----\n");
        sb.append(this.dough).append("\n");
        sb.append(this.sauce).append("\n");
        for (String topping : this.toppings) {
            sb.append(topping).append("\n");
        }
        return sb.toString();
    }
}

 
 
