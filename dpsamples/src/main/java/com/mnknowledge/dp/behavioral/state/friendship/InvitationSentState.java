package com.mnknowledge.dp.behavioral.state.friendship;

public class InvitationSentState implements InvitationState {

    @Override
    public void send(FriendInvitation2 context) {
        if (isSent(context)) {
            System.out.println("Re-Send invitation...");
        } else {
            System.out.println("Send invitation...");
            context.setCurrentState(this);
        }
    }

    @Override
    public void confirm(FriendInvitation2 context) {
        if (isSent(context)) {
            new InvitationConfirmState().confirm(context);
        } else {
            System.out.println("Invitation cannot be confirmed!");
        }
    }

    @Override
    public void cancel(FriendInvitation2 context) {
        if (isSent(context)) {
            new InvitationCanceledState().cancel(context);
        } else {
            System.out.println("Invitation cannot be canceled!");
        }
    }

    @Override
    public void ignore(FriendInvitation2 context) {
        if (isSent(context)) {
            new InvitationIgnoredState().ignore(context);
        } else {
            System.out.println("Invitation cannot be ignored!");
        }
    }

    private boolean isSent(FriendInvitation2 context) {
        return (context.getCurrentState() != null && context.getCurrentState().getClass().isAssignableFrom(getClass()));
    }

}
