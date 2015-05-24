package com.mnknowledge.dp.behavioral.mediator.chatgroup;

/**
 * Note: That user object represent colleagues component, from Mediator DP. Note
 * also user object contains mediator object - chat group.
 *
 * @author siiliev
 *
 */
public class User {

    private ChatGroup chatGroup;

    public void join(ChatGroup chatGroup) {
        this.chatGroup = chatGroup;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        chatGroup.showMessage(this, message);
    }
}