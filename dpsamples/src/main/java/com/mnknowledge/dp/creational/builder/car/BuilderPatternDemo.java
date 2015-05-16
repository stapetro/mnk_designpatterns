package com.mnknowledge.dp.creational.builder.car;

/**
 * Use Builder Pattern to build cars.
 *
 * @author siiliev
 *
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        // build on steps new Ford Mondeo car...
        Car fordMondeo = new FordMondeoBuilder().addAlarm(true).addDoors(5).addSatNav(true).addEngine("2.8")
                .carBody("Convertible").paintColor("Red").addSatNav(true).addSunroof(true).mp3Player(true).build();

        // present it
        System.out.println(fordMondeo);
    }
}
