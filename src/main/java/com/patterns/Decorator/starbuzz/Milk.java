package com.patterns.Decorator.starbuzz;

public final class Milk extends CondimentDecorator {

    private final Beverage beverage;

    public Milk(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.10 + this.beverage.cost();
    }
}
