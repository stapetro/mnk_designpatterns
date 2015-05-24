package com.mnknowledge.dp.behavioral.state.friendship;

public class FriendInvitationDemo {

    public static void main(String[] args) {
        System.out.println("\n ----- Naive implementation -----\n");
        FriendInvitation invitation = new FriendInvitation();
        invitation.cancel();
        invitation.confirm();
        invitation.send();
        invitation.ignore();
        invitation.confirm();
        invitation.cancel();
        invitation.send();
        System.out.println("\n ----- State DP -----\n");
        FriendInvitation2 invitation2 = new FriendInvitation2();
        invitation2.cancel();
        invitation2.confirm();
        invitation2.send();
        invitation2.ignore();
        invitation2.confirm();
        invitation2.cancel();
        invitation2.send();

    }

}
