package com.patterns.Iterator.dinermerger;

public final class DinerMenuIterator implements Iterator {

    private final MenuItem[] items;
    private int position;

    public DinerMenuIterator(final MenuItem[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        final MenuItem menuItem = this.items[this.position];
        this.position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return (this.position < this.items.length)
                && (this.items[this.position] != null);
    }
}
