package com.mnknowledge.dp.behavioral.mediator.chatgroup;

import java.util.Date;

/**
 * Simple Chat Group implementation to demonstrate Mediator design pattern.<br>
 * Note: This is the actual mediator...
 *
 * @author siiliev
 *
 */
public class ChatGroup {

    public void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}