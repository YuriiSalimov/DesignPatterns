package com.patterns.Iterator.dinermergercafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PancakeHouseMenu implements Menu {

    private final List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(
            final String name,
            final String description,
            final boolean vegetarian,
            final double price
    ) {
        final MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    @Override
    public Iterator createIterator() {
        return this.menuItems.iterator();
    }

    // other menu methods here
}
