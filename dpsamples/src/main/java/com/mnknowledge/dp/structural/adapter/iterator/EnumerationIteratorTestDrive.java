package com.mnknowledge.dp.structural.adapter.iterator;

import java.util.*;

public class EnumerationIteratorTestDrive {
	public static void main (String args[]) {
		String [] arr = {"One", "Two", "Three", "Four"};
		Vector v = new Vector(Arrays.asList(arr));
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
	}
}
