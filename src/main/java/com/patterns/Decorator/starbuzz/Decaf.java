package com.patterns.Decorator.starbuzz;

public final class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}

