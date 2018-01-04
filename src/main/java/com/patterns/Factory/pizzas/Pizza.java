package com.patterns.Factory.pizzas;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected final List<String> toppings = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public void prepare() {
        System.out.println("Preparing " + this.name);
    }

    public void bake() {
        System.out.println("Baking " + this.name);
    }

    public void cut() {
        System.out.println("Cutting " + this.name);
    }

    public void box() {
        System.out.println("Boxing " + this.name);
    }

    @Override
    public String toString() {
        // code to display pizza name and ingredients
        StringBuilder sb = new StringBuilder();
        sb.append("---- ").append(this.name).append(" ----\n");
        sb.append(this.dough).append("\n");
        sb.append(this.sauce).append("\n");
        for (int i = 0; i < this.toppings.size(); i++) {
            sb.append(this.toppings.get(i)).append("\n");
        }
        return sb.toString();
    }
}

