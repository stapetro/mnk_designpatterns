package com.mnknowledge.dp.creational.builder.car;

/**
 * Car - the object that will be build.
 *
 * @author siiliev
 *
 */
public class Car {
    private String _make;
    private String _model;
    private boolean _mp3Player;
    private String _carBody;
    private String _colour;
    private int _numberOfDoors;
    private String _engineSize;
    private boolean _sunroof;
    private boolean _satNav;
    private boolean _alarm;

    public Car(String make, String model, boolean mp3Player, String carBody, String colour, int numberOfDoors,
            String engineSize, boolean sunroof, boolean satNav, boolean alarm) {
        _make = make;
        _model = model;
        _mp3Player = mp3Player;
        _carBody = carBody;
        _colour = colour;
        _numberOfDoors = numberOfDoors;
        _engineSize = engineSize;
        _sunroof = sunroof;
        _satNav = satNav;
        _alarm = alarm;
    }

    public String getMake() {
        return _make;
    }

    public String getModel() {
        return _model;
    }

    public boolean isMp3Player() {
        return _mp3Player;
    }

    public String getCarBody() {
        return _carBody;
    }

    public String getColour() {
        return _colour;
    }

    public int getNumberOfDoors() {
        return _numberOfDoors;
    }

    public String getEngineSize() {
        return _engineSize;
    }

    public boolean isSunroof() {
        return _sunroof;
    }

    public boolean isSatNav() {
        return _satNav;
    }

    public boolean isAlarm() {
        return _alarm;
    }

    @Override
    public String toString() {
        return "Car [_make=" + _make + ", _model=" + _model + ", _mp3Player=" + _mp3Player + ", _carBody=" + _carBody
                + ", _colour=" + _colour + ", _numberOfDoors=" + _numberOfDoors + ", _engineSize=" + _engineSize
                + ", _sunroof=" + _sunroof + ", _satNav=" + _satNav + ", _alarm=" + _alarm + "]";
    }
}
