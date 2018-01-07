package com.patterns.Iterator.dinermerger;

import java.util.List;

public final class ArrayListIterator implements Iterator {

    private final List items;
    private int position = 0;

    public ArrayListIterator(final List items) {
        this.items = items;
    }

    @Override
    public Object next() {
        final Object object = this.items.get(this.position);
        this.position++;
        return object;
    }

    @Override
    public boolean hasNext() {
        return (this.position >= this.items.size());
    }
}
