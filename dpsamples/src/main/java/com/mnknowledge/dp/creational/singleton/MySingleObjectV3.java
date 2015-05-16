package com.mnknowledge.dp.creational.singleton;

/**
 * Double Check Locking implementation of singleton - ensure only one single
 * instance. Ensure synchronization is made only on first call of get instance<br>
 * Note: works on java >= 1.5.
 *
 * @author siiliev
 *
 */
public class MySingleObjectV3 {

    private volatile static MySingleObjectV3 uniqueInstance;

    // make the constructor private so that this class cannot be instantiated
    private MySingleObjectV3() {
    }

    // Get the only object available
    public static MySingleObjectV3 getInstance() {

        if (uniqueInstance == null) {

            synchronized (uniqueInstance) {

                if (uniqueInstance == null) {

                    // create an object of MySingleObjectV3
                    uniqueInstance = new MySingleObjectV3();
                }
            }
        }

        return uniqueInstance;
    }

    public void showMessage() {
        System.out.println("Hello from Unique Single Object!");
    }
}