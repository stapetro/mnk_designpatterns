package com.mnknowledge.dp.behavioral.state.friendship;

public class FriendInvitation2 {

    private InvitationState currentState;

    public InvitationState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(InvitationState currentState) {
        this.currentState = currentState;
    }

    public void send() {
        if (getCurrentState() == null) {
            new InvitationSentState().send(this);
        } else {
            getCurrentState().send(this);
        }
    }

    public void confirm() {
        if (getCurrentState() == null) {
            return;
        }
        getCurrentState().confirm(this);
    }

    public void cancel() {
        if (getCurrentState() == null) {
            return;
        }
        getCurrentState().cancel(this);
    }

    public void ignore() {
        if (getCurrentState() == null) {
            return;
        }
        getCurrentState().ignore(this);
    }

}
