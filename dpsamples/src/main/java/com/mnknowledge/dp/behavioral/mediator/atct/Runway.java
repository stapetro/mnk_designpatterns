package com.mnknowledge.dp.behavioral.mediator.atct;

/**
 * Note: Runway have a reference to ATC Mediator instead to Flight directly.
 *
 * @author siiliev
 *
 */
public class Runway {
    private IATMediator atcMediator;

    public Runway(IATMediator atcMediator) {
        this.atcMediator = atcMediator;
        atcMediator.setLandingStatus(LandingStatus.FREE);
    }

    public void allowLanding() {
        System.out.println("Landing permission granted...");
        atcMediator.setLandingStatus(LandingStatus.GRANTED);
    }

}
