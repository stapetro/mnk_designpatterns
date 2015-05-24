package com.mnknowledge.dp.behavioral.iterator.repository.java;

import java.util.Iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        StaffRepository namesRepository = new StaffRepository();

        System.out.println("Company staff : ");
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
