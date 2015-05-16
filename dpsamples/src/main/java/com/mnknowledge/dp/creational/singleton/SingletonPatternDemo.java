package com.mnknowledge.dp.creational.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        // illegal instantiation
        // Compile Time Error: The constructor SingleObject() is not visible
        // MySingleObjectV1 myObject = new MySingleObjectV1();

        // Get the only object available
        MySingleObjectV1 myObject = MySingleObjectV1.getInstance();

        // show the message
        myObject.showMessage();
    }
}
