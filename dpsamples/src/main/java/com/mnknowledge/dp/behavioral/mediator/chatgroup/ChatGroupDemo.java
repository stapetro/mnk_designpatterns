package com.mnknowledge.dp.behavioral.mediator.chatgroup;

public class ChatGroupDemo {

    public static void main(String[] args) {
        // define chat group - the mediator in our demo
        ChatGroup chatGroup = new ChatGroup();

        // define some users to join the chat group
        User ivan = new User("Ivan");
        User petar = new User("Petar");
        User maria = new User("Maria");

        // users now will join the group
        ivan.join(chatGroup);
        petar.join(chatGroup);
        maria.join(chatGroup);

        // now let's start to chat
        ivan.sendMessage("Hi! all!");
        petar.sendMessage("Hello! Ivan, All!");
        maria.sendMessage("Hello! Ivan, Petar!");
        maria.sendMessage("How are you boys?");
    }
}