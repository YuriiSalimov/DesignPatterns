package com.patterns.Adapter.iterenum;

import java.util.*;

public class IteratorEnumerationTestDrive {

	public static void main (String args[]) {
		final List<String> l = new ArrayList<>(Arrays.asList(args));
		final Enumeration enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
