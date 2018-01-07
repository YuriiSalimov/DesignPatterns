package com.patterns.Iterator.dinermergeri;

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
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}
