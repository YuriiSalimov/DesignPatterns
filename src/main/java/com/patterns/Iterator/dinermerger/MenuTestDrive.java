package com.patterns.Iterator.dinermerger;

import java.util.*;

public class MenuTestDrive {

    public static void main(String args[]) {
        final PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        final DinerMenu dinerMenu = new DinerMenu();
        final Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }

    public static void printMenu() {
        final PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        final List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (MenuItem menuItem : breakfastItems) {
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }

        final DinerMenu dinerMenu = new DinerMenu();
        final MenuItem[] lunchItems = dinerMenu.getMenuItems();
        for (MenuItem menuItem : lunchItems) {
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }
}
