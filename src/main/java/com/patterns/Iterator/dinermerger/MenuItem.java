package com.patterns.Iterator.dinermerger;

public final class MenuItem {

    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;

    public MenuItem(
            final String name,
            final String description,
            final boolean vegetarian,
            final double price
    ) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isVegetarian() {
        return this.vegetarian;
    }

    @Override
    public String toString() {
        return (this.name + ", $" + this.price + "\n   " + this.description);
    }
}
