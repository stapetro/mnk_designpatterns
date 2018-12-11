package com.mnknowledge.dp.creational.builder.car;

/**
 * Car - the object that will be build.
 */
public class Car {
    private final String _make;
    private final String _model;
    private final boolean _mp3Player;
    private final String _carBody;
    private final String _colour;
    private final int _numberOfDoors;
    private final String _engineSize;
    private final boolean _sunroof;
    private final boolean _satNav;
    private final boolean _alarm;

    public static class Builder {
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

        public Builder make(String make) {
            _make = make;
            return this;
        }

        public Builder model(String model) {
            _model = model;
            return this;
        }

        public Builder addAlarm(boolean alarm) {
            _alarm = alarm;
            return this;
        }

        public Builder addSatNav(boolean satNav) {
            _satNav = satNav;
            return this;
        }

        public Builder addSunroof(boolean sunroof) {
            _sunroof = sunroof;
            return this;
        }

        public Builder mp3Player(boolean mp3Player) {
            _mp3Player = mp3Player;
            return this;
        }

        public Builder carBody(String carBody) {
            _carBody = carBody;
            return this;
        }

        public Builder paintColor(String colour) {
            _colour = colour;
            return this;
        }

        public Builder addDoors(int numberOfDoors) {
            _numberOfDoors = numberOfDoors;
            return this;
        }

        public Builder addEngine(String engineSize) {
            _engineSize = engineSize;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        _make = builder._make;
        _model = builder._model;
        _mp3Player = builder._mp3Player;
        _carBody = builder._carBody;
        _colour = builder._colour;
        _numberOfDoors = builder._numberOfDoors;
        _engineSize = builder._engineSize;
        _sunroof = builder._sunroof;
        _satNav = builder._satNav;
        _alarm = builder._alarm;
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
