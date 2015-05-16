package com.mnknowledge.dp.creational.builder.car;

/**
 * CarBuilder - the object that will be used as a builder. <br>
 * Note: Every method returns the CarBuilder current state. Build method builds
 * instantiate the Car object. No setters as we want our Builder object to be
 * immutable.
 *
 * @author siiliev
 *
 */
public abstract class CarBuilder {
    protected String _make;
    protected String _model;
    protected boolean _mp3Player;
    protected String _carBody;
    protected String _colour;
    protected int _numberOfDoors;
    protected String _engineSize;
    protected boolean _sunroof;
    protected boolean _satNav;
    protected boolean _alarm;

    public CarBuilder make(String make) {
        _make = make;
        return this;
    }

    public CarBuilder model(String model) {
        _model = model;
        return this;
    }

    public CarBuilder addAlarm(boolean alarm) {
        _alarm = alarm;
        return this;
    }

    public CarBuilder addSatNav(boolean satNav) {
        _satNav = satNav;
        return this;
    }

    public CarBuilder addSunroof(boolean sunroof) {
        _sunroof = sunroof;
        return this;
    }

    public CarBuilder mp3Player(boolean mp3Player) {
        _mp3Player = mp3Player;
        return this;
    }

    public CarBuilder carBody(String carBody) {
        _carBody = carBody;
        return this;
    }

    public CarBuilder paintColor(String colour) {
        _colour = colour;
        return this;
    }

    public CarBuilder addDoors(int numberOfDoors) {
        _numberOfDoors = numberOfDoors;
        return this;
    }

    public CarBuilder addEngine(String engineSize) {
        _engineSize = engineSize;
        return this;
    }

    public Car build() {
        return new Car(_make, _model, _mp3Player, _carBody, _colour, _numberOfDoors, _engineSize, _sunroof, _satNav,
                _alarm);
    }
}
