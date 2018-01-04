package com.patterns.Decorator.starbuzz;

public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }

    public abstract double cost();
}
