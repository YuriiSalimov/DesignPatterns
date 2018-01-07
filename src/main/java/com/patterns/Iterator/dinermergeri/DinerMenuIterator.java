package com.patterns.Iterator.dinermergeri;

import java.util.Iterator;

public final class DinerMenuIterator implements Iterator {

    private final MenuItem[] list;
    private int position = 0;

    public DinerMenuIterator(final MenuItem[] list) {
        this.list = list;
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
    public void remove() {
        if (this.position <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item until you've done at least one next()");
        }
        if (this.list[this.position - 1] != null) {
            for (int i = this.position - 1; i < (this.list.length - 1); i++) {
                this.list[i] = this.list[i + 1];
            }
            this.list[this.list.length - 1] = null;
        }
    }
}
