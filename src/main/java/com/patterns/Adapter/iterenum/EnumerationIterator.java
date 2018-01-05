package com.patterns.Adapter.iterenum;

import java.util.*;

public final class EnumerationIterator implements Iterator {

    private final Enumeration enumeration;

    public EnumerationIterator(final Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return this.enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return this.enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
