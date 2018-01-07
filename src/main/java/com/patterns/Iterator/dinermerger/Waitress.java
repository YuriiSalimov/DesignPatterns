package com.patterns.Iterator.dinermerger;

public final class Waitress {

    private final PancakeHouseMenu pancakeHouseMenu;
    private final DinerMenu dinerMenu;

    public Waitress(
            final PancakeHouseMenu pancakeHouseMenu,
            final DinerMenu dinerMenu
    ) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        System.out.println("MENU\n----\nBREAKFAST");
        final Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
        printMenu(pancakeIterator);

        System.out.println("\nLUNCH");
        final Iterator dinerIterator = this.dinerMenu.createIterator();
        printMenu(dinerIterator);
    }

    private void printMenu(final Iterator iterator) {
        while (iterator.hasNext()) {
            final MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printVegetarianMenu() {
        printVegetarianMenu(this.pancakeHouseMenu.createIterator());
        printVegetarianMenu(this.dinerMenu.createIterator());
    }

    public boolean isItemVegetarian(final String name) {
        final Iterator breakfastIterator = this.pancakeHouseMenu.createIterator();
        if (isVegetarian(name, breakfastIterator)) {
            return true;
        }
        final Iterator dinnerIterator = this.dinerMenu.createIterator();
        if (isVegetarian(name, dinnerIterator)) {
            return true;
        }
        return false;
    }


    private void printVegetarianMenu(final Iterator iterator) {
        while (iterator.hasNext()) {
            final MenuItem menuItem = (MenuItem) iterator.next();
            if (menuItem.isVegetarian()) {
                System.out.print(menuItem.getName());
                System.out.println("\t\t" + menuItem.getPrice());
                System.out.println("\t" + menuItem.getDescription());
            }
        }
    }

    private boolean isVegetarian(final String name, final Iterator iterator) {
        while (iterator.hasNext()) {
            final MenuItem menuItem = (MenuItem) iterator.next();
            if (menuItem.getName().equals(name)) {
                if (menuItem.isVegetarian()) {
                    return true;
                }
            }
        }
        return false;
    }
}
