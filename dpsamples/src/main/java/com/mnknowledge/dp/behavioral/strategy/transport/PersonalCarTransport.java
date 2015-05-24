package com.mnknowledge.dp.behavioral.strategy.transport;

public class PersonalCarTransport implements TransportStrategy {

    @Override
    public void transport() {
        System.out.println("Personal car - the best transport ever!");
    }

}
