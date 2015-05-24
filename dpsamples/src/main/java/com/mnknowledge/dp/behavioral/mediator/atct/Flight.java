package com.mnknowledge.dp.behavioral.mediator.atct;

/**
 * Note: Flight have reference to air traffic control tower, instead directly to
 * runway.
 *
 * @author siiliev
 *
 */
public class Flight {
    private IATMediator atctMediator;

    public Flight(IATMediator atcMediator) {
        this.atctMediator = atcMediator;
    }

    public void land() {
        if (atctMediator.isLandingOk()) {
            System.out.println("Landing started....");
            atctMediator.setLandingStatus(LandingStatus.LANDING);
        } else
            System.out.println("Will wait to land....");
    }

    public void done() {
        System.out.println("Landing done....");
        atctMediator.setLandingStatus(LandingStatus.LANDED);
    }

    public void getReady() {
        System.out.println("Getting ready to land...");
    }
}