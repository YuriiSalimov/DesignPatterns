package com.patterns.Iterator.dinermerger;

import java.util.Calendar;

public final class AlternatingDinerMenuIterator implements Iterator {

    private final MenuItem[] list;
    private int position;

    public AlternatingDinerMenuIterator(final MenuItem[] list) {
        this.list = list;
        this.position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public Object next() {
        final MenuItem menuItem = this.list[this.position];
        this.position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return (this.position < this.list.length)
                && (this.list[this.position] != null);
    }

    @Override
    public String toString() {
        return "Alternating Diner Menu Iterator";
    }
}
