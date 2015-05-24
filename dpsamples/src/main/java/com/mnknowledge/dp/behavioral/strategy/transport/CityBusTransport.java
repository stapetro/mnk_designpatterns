package com.mnknowledge.dp.behavioral.strategy.transport;

public class CityBusTransport implements TransportStrategy {

    @Override
    public void transport() {
        System.out.println("City bus transport - relatively small!");
    }

}
