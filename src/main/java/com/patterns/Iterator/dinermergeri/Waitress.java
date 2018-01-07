package com.patterns.Iterator.dinermergeri;

import java.util.Iterator;


public final class Waitress {

    private final Menu pancakeHouseMenu;
    private final Menu dinerMenu;

    public Waitress(final Menu pancakeHouseMenu, final Menu dinerMenu) {
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

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            final MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printVegetarianMenu() {
        System.out.println("\nVEGETARIAN MENU\n----\nBREAKFAST");
        printVegetarianMenu(this.pancakeHouseMenu.createIterator());
        System.out.println("\nLUNCH");
        printVegetarianMenu(this.dinerMenu.createIterator());
    }

    public boolean isItemVegetarian(final String name) {
        final boolean result;
        final Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
        if (isVegetarian(name, pancakeIterator)) {
            result = true;
        } else {
            final Iterator dinerIterator = this.dinerMenu.createIterator();
            result = isVegetarian(name, dinerIterator);
        }
        return result;
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
