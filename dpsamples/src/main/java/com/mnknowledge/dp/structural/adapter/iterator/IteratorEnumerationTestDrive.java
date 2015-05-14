package com.mnknowledge.dp.structural.adapter.iterator;

import java.util.*;

public class IteratorEnumerationTestDrive {
	public static void main (String args[]) {
		
		String [] arr = {"One", "Two", "Three", "Four"};
		ArrayList l = new ArrayList(Arrays.asList(arr));
		Enumeration enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
