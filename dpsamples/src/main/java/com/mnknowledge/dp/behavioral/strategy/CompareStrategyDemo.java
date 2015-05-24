package com.mnknowledge.dp.behavioral.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareStrategyDemo {

    public static void main(String[] args) {
        List<String> userNames = new ArrayList<String>(
                Arrays.asList("pesho", "vanko", "misho", "agata", "martin folwer", "kent beck", "robert martin"));
        System.out.println("Names -> ");
        System.out.println(Arrays.toString(userNames.toArray()));
        System.out.println("\nAsc Sorted Names -> ");
        Collections.sort(userNames, ascComparator());
        System.out.println(Arrays.toString(userNames.toArray()));
        System.out.println("\nDesc Sorted Names -> ");
        Collections.sort(userNames, descComparator());
        System.out.println(Arrays.toString(userNames.toArray()));
        System.out.println("\nNaturaly ordered Names -> ");
        Collections.sort(userNames);
        System.out.println(Arrays.toString(userNames.toArray()));
    }

    public static Comparator<String> descComparator() {
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
    }

    public static Comparator<String> ascComparator() {
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
    }

}
