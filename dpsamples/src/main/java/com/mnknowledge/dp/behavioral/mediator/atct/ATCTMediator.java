package com.mnknowledge.dp.behavioral.mediator.atct;

/**
 * Simple Air Traffic Control Tower implementation to demonstrate Mediator
 * design pattern.
 *
 * @author siiliev
 *
 */
public class ATCTMediator implements IATMediator {

    @SuppressWarnings("unused")
    private Flight flight;

    @SuppressWarnings("unused")
    private Runway runway;

    public LandingStatus landStatus;

    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    public boolean isLandingOk() {
        return landStatus == LandingStatus.GRANTED;
    }

    public void setLandingStatus(LandingStatus newStatus) {
        landStatus = newStatus;
    }
}
