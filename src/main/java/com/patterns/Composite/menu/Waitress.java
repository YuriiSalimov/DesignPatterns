package com.patterns.Composite.menu;

public final class Waitress {

    private final MenuComponent allMenus;

    public Waitress(final MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        this.allMenus.print();
    }
}
