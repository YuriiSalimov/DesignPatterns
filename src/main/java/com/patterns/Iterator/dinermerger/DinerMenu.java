package com.patterns.Iterator.dinermerger;

public final class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;

    private final MenuItem[] menuItems;
    private int numberOfItems;


    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89);
    }

    public void addItem(
            final String name,
            final String description,
            final boolean vegetarian,
            final double price
    ) {
        final MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (this.numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            this.menuItems[this.numberOfItems] = menuItem;
            this.numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return this.menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(this.menuItems);
    }

    // other menu methods here
}