package com.mnknowledge.dp.behavioral.strategy.transport;

public class TransportationToAirport {

    private TransportStrategy transport;

    public TransportationToAirport() {
        setTransport(new CityBusTransport());
    }

    public TransportStrategy getTransport() {
        return transport;
    }

    public void setTransport(TransportStrategy transport) {
        this.transport = transport;
    }

    public void goToAirport() {
        System.out.println("Go to airport with ...");
        getTransport().transport();
    }

    public static void main(String[] args) {
        TransportationToAirport transportation = new TransportationToAirport();
        transportation.goToAirport();
        System.out.println("\nChange transport mode");
        transportation.setTransport(new TaxiTransport());
        transportation.goToAirport();
        System.out.println("\nChange transport mode again");
        transportation.setTransport(new PersonalCarTransport());
        transportation.goToAirport();
    }
}
