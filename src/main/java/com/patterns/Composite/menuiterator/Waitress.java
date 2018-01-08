package com.patterns.Composite.menuiterator;

import java.util.Iterator;

public final class Waitress {

    private final MenuComponent allMenus;

    public Waitress(final MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        this.allMenus.print();
    }

    public void printVegetarianMenu() {
        final Iterator iterator = this.allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            final MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    }
}
