package com.patterns.Iterator.dinermergercafe;

import java.util.Iterator;

public final class Waitress {

    private final Menu pancakeHouseMenu;
    private final Menu dinerMenu;
    private final Menu cafeMenu;

    public Waitress(
            final Menu pancakeHouseMenu,
            final Menu dinerMenu,
            final Menu cafeMenu
    ) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        System.out.println("MENU\n----\nBREAKFAST");
        final Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
        printMenu(pancakeIterator);

        System.out.println("\nLUNCH");
        final Iterator dinerIterator = this.dinerMenu.createIterator();
        printMenu(dinerIterator);

        System.out.println("\nDINNER");
        final Iterator cafeIterator = this.cafeMenu.createIterator();
        printMenu(cafeIterator);
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
        System.out.println("\nVEGETARIAN MENU\n---------------");
        printVegetarianMenu(this.pancakeHouseMenu.createIterator());
        printVegetarianMenu(this.dinerMenu.createIterator());
        printVegetarianMenu(this.cafeMenu.createIterator());
    }

    public boolean isItemVegetarian(final String name) {
        final Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
        if (isVegetarian(name, pancakeIterator)) {
            return true;
        }
        final Iterator dinerIterator = this.dinerMenu.createIterator();
        if (isVegetarian(name, dinerIterator)) {
            return true;
        }
        final Iterator cafeIterator = this.cafeMenu.createIterator();
        if (isVegetarian(name, cafeIterator)) {
            return true;
        }
        return false;
    }


    private void printVegetarianMenu(final Iterator iterator) {
        while (iterator.hasNext()) {
            final MenuItem menuItem = (MenuItem) iterator.next();
            if (menuItem.isVegetarian()) {
                System.out.print(menuItem.getName() + ", ");
                System.out.print(menuItem.getPrice() + " -- ");
                System.out.println(menuItem.getDescription());
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
//^^ WaitressCafeMain
//^^ WaitressCafe
