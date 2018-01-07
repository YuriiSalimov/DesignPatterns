package com.patterns.Iterator.dinermerger;

import java.util.ArrayList;
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
                "Pancakes made with fresh blueberries",
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
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(this.menuItems);
    }

    @Override
    public String toString() {
        return "Objectville Pancake House Menu";
    }

    // other menu methods here
}
