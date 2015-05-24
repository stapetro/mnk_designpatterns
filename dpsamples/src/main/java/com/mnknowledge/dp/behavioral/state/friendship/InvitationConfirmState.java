package com.mnknowledge.dp.behavioral.state.friendship;

public class InvitationConfirmState implements InvitationState {

    @Override
    public void send(FriendInvitation2 context) {
        System.out.println("Invitation cannot be sent!");
    }

    @Override
    public void confirm(FriendInvitation2 context) {
        System.out.println("Invitation is confirmed!");
        context.setCurrentState(this);
    }

    @Override
    public void cancel(FriendInvitation2 context) {
        System.out.println("Invitaiton cannot be canceled!");
    }

    @Override
    public void ignore(FriendInvitation2 context) {
        System.out.println("Invitation cannot be ignored!");
    }

}
