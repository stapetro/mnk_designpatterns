package com.mnknowledge.dp.creational.builder.car;

import java.util.List;

/**
 * Use Builder Pattern to build cars.
 *
 * @author siiliev
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        // build on steps new Ford Mondeo car...
        final Car fordMondeo = new FordMondeoBuilder().addAlarm(true).addDoors(5).addSatNav(true).addEngine("2.8")
                .carBody("Convertible").paintColor("Red").addSatNav(true).addSunroof(true).mp3Player(true).build();

        final Car bmw = new BMWX6Builder().addAlarm(true).addDoors(4).addSatNav(false).addEngine("3.6")
                .carBody("Convertible").paintColor("Dark Blue").addSunroof(false).mp3Player(true).build();

        // present it
        List.of(fordMondeo, bmw).forEach(System.out::println);
    }
}
