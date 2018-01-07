package com.patterns.Iterator.dinermerger;

public final class ArrayIterator implements Iterator {

    private final MenuItem[] items;
    private int position = 0;

    public ArrayIterator(final MenuItem[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        final MenuItem menuItem = this.items[this.position];
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return (this.position < this.items.length)
                && (this.items[this.position] != null);
    }
}
