package com.mnknowledge.dp.creational.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        // illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        // Get the only object available
        MySingleObjectV1 object = MySingleObjectV1.getInstance();

        // show the message
        object.showMessage();
    }
}
