package com.patterns.Composite.menuiterator;

import java.util.*;

public final class CompositeIterator implements Iterator {

    private final Stack<Iterator> stack = new Stack<>();

    public CompositeIterator(final Iterator iterator) {
        this.stack.push(iterator);
    }

    public Object next() {
        if (hasNext()) {
            final Iterator iterator = this.stack.peek();
            final MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                this.stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if (this.stack.empty()) {
            return false;
        } else {
            final Iterator iterator = stack.peek();
            if (!iterator.hasNext()) {
                this.stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}


