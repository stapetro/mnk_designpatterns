package com.mnknowledge.dp.behavioral.iterator.repository.simple;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        StaffRepository namesRepository = new StaffRepository();

        System.out.println("Company staff : ");
        for (CIterator iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
