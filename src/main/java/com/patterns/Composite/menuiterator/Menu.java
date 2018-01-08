package com.patterns.Composite.menuiterator;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public final class Menu extends MenuComponent {

    private final List<MenuComponent> menuComponents = new ArrayList<>();
    private final String name;
    private final String description;

    public Menu(final String name, final String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(final MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }

    @Override
    public void remove(final MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(final int i) {
        return this.menuComponents.get(i);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(this.menuComponents.iterator());
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        Iterator iterator = this.menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent =
                    (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
