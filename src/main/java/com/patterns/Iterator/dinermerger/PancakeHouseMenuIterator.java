package com.patterns.Iterator.dinermerger;

import java.util.List;

public final class PancakeHouseMenuIterator implements Iterator {

    private final List<MenuItem> items;
    private int position;

    public PancakeHouseMenuIterator(final List<MenuItem> items) {
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
        return (this.position < this.items.size());
    }
}
