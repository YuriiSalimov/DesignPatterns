package com.patterns.Composite.menuiterator;

import java.util.Iterator;

public final class MenuItem extends MenuComponent {

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

    public Iterator createIterator() {
        return new NullIterator();
    }

    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }
//vv MenuItemCompositeV2Main
}
//^^ MenuItemCompositeV2Main
//^^ MenuItemCompositeV2
