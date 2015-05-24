package com.mnknowledge.dp.behavioral.state.friendship;

public interface InvitationState {

    public void send(FriendInvitation2 context);

    public void confirm(FriendInvitation2 context);

    public void cancel(FriendInvitation2 context);

    public void ignore(FriendInvitation2 context);
}
