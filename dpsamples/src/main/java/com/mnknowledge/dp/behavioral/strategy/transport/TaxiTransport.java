package com.mnknowledge.dp.behavioral.strategy.transport;

public class TaxiTransport implements TransportStrategy {

    @Override
    public void transport() {
        System.out.println("Taxi transport - relatively quick & expensive");
    }

}
