package com.patterns.Adapter.iterenum;

import java.util.*;

public class EI {

    public static void main(String args[]) {
        final Vector<String> v = new Vector<>(Arrays.asList(args));
        final Enumeration enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        final Iterator iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
