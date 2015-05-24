package com.mnknowledge.dp.behavioral.state.friendship;

public class FriendInvitation {

    private InvitationStatus status = InvitationStatus.NEW;

    public enum InvitationStatus {
        NEW, SENT, CONFIRMED, SENDER_CANCELED, RECEIVER_IGNORED;
    }

    public void send() {
        switch(status) {
        case CONFIRMED:
            System.out.println("Invitation cannot be sent!");
            break;
        case NEW:
            System.out.println("Send invitation...");
            status = InvitationStatus.SENT;
            break;
        case RECEIVER_IGNORED:
            System.out.println("Invitation cannot be sent!");
            break;
        case SENDER_CANCELED:
            System.out.println("Invitation cannot be sent!");
            break;
        case SENT:
            System.out.println("Re-send invitation again!");
            break;
        default:
            break;
        
        }
    }

    public void cancel() {
        switch(status) {
        case CONFIRMED:
        case RECEIVER_IGNORED:
            System.out.println("Invitation cannot be canceled!");
            break;
        case SENDER_CANCELED:
            System.out.println("Invitation is already canceled!");
            break;
        case NEW:
            System.out.println("Invitation cannot be canceled!");
            break;
        case SENT:
            System.out.println("Invitation is canceled!");
            status = InvitationStatus.SENDER_CANCELED;
            break;
        default:
            break;
        }
    }

    public void confirm() {
        switch(status) {
        case CONFIRMED:
            System.out.println("Invitation is already confirmed!");
            break;
        case NEW:
            System.out.println("Invitation cannot be confirmed!");
            break;
        case RECEIVER_IGNORED:
            System.out.println("Invitation cannot be confirmed!");
            break;
        case SENDER_CANCELED:
            System.out.println("Invitation cannot be confirmed!");
            break;
        case SENT:
            System.out.println("Invitation is confirmed!");
            status = InvitationStatus.CONFIRMED;
            break;
        default:
            break;
        }
    }

    public void ignore() {
        switch(status) {
        case CONFIRMED:
            System.out.println("Invitation cannot be ingored!");
            break;
        case NEW:
            System.out.println("Invitation cannot be ignored!");
            break;
        case RECEIVER_IGNORED:
            System.out.println("Invitation cannot be ignored!");
            break;
        case SENDER_CANCELED:
            System.out.println("Invitation cannot be ignored!");
            break;
        case SENT:
            System.out.println("Invitation is ignored!");
            status = InvitationStatus.RECEIVER_IGNORED;
            break;
        default:
            break;
        }
    }

}
