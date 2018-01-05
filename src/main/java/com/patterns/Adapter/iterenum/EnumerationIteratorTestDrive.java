package com.patterns.Adapter.iterenum;

import java.util.*;

public class EnumerationIteratorTestDrive {

    public static void main(String args[]) {
        final Vector<String> v = new Vector<>(Arrays.asList(args));
        final Iterator iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
