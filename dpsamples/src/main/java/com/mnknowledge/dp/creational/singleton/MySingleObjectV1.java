package com.mnknowledge.dp.creational.singleton;

/**
 * MySingleObjectV1 - ensure only one single instance.<br>
 * Note: might be slow because of synchronized getInstance() method
 *
 * @author siiliev
 *
 */
public class MySingleObjectV1 {

    private static MySingleObjectV1 uniqueInstance;

    // make the constructor private so that this class cannot be instantiated
    // outside
    private MySingleObjectV1() {
    }

    // Get the only object available
    public static synchronized MySingleObjectV1 getInstance() {

        if (uniqueInstance == null) {
            // create an object of MySingleObjectV1
            uniqueInstance = new MySingleObjectV1();
        }

        return uniqueInstance;
    }

    public void showMessage() {
        System.out.println("Hello from Unique Single Object!");
    }
}