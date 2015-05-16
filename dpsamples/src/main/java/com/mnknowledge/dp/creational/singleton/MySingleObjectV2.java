package com.mnknowledge.dp.creational.singleton;

/**
 * Eager initializing singleton - ensure only one single instance. <br>
 * Note: Rely on JVM to create our object single instance.
 *
 * @author siiliev
 *
 */
public class MySingleObjectV2 {

    // create an object of MySingleObjectV2
    private static MySingleObjectV2 instance = new MySingleObjectV2();

    // make the constructor private so that this class cannot be instantiated
    private MySingleObjectV2() {
    }

    // Get the only object available
    public static MySingleObjectV2 getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Unique Single Object!");
    }
}