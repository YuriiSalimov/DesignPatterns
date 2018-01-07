package com.patterns.Iterator.transition;

import java.util.*;

public final class Waitress {

    private final List<Menu> menus;

    public Waitress(final List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        final Iterator menuIterator = this.menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    void printMenu(final Iterator iterator) {
        while (iterator.hasNext()) {
            final MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}  
