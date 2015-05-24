package com.mnknowledge.dp.behavioral.mediator.atct;

public class SimpleATCDemo {
    public static void main(String args[]) {

        // we have air traffic control mediator
        IATMediator atctMediator = new ATCTMediator();

        // we have some runways
        Runway mainRunway = new Runway(atctMediator);

        // we have flights
        Flight pidgen101 = new Flight(atctMediator);
        Flight pidgen201 = new Flight(atctMediator);

        atctMediator.registerFlight(pidgen101);
        atctMediator.registerRunway(mainRunway);

        pidgen101.getReady();
        mainRunway.allowLanding();
        // will land only if landing is allowed for this runway
        pidgen101.land();
        pidgen101.done();

        // try to land
        pidgen201.land();
    }
}