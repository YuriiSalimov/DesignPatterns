package com.patterns.Adapter.iterenum;

import java.util.*;

public final class IteratorEnumeration implements Enumeration {

    private final Iterator iterator;

    public IteratorEnumeration(final Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return this.iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return this.iterator.next();
    }
}
