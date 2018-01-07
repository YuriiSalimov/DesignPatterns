package com.patterns.Iterator.dinermergercafe;

import java.util.Iterator;
import java.util.Calendar;

public final class AlternatingDinerMenuIterator implements Iterator {

    private final MenuItem[] items;
    private int position;

    public AlternatingDinerMenuIterator(final MenuItem[] items) {
        this.items = items;
        this.position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public Object next() {
        final MenuItem menuItem = this.items[this.position];
        this.position += 2;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return (this.position < this.items.length)
                && (this.items[this.position] != null);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(
                "Alternating Diner Menu Iterator does not support remove()"
        );
    }
}
