package com.mnknowledge.dp.behavioral.command.milkmachine;

import com.mnknowledge.dp.behavioral.command.milkmachine.SpeedController.SpeedLevel;

/**
 * receiver
 */
public class MilkingMachine {

    private boolean isWorkging;
    private SpeedController speedController;

    public boolean isWorkging() {
        return isWorkging;
    }

    private void setWorkging(boolean isWorkging) {
        this.isWorkging = isWorkging;
    }

    public SpeedController getSpeedController() {
        return speedController;
    }

    public void setSpeedController(SpeedController speedController) {
        this.speedController = speedController;
    }

    public void turnOn() {
        setWorkging(true);
    }

    public void turnOff() {
        setWorkging(false);
    }

    public SpeedLevel getSpeed() {
        return getSpeedController().getCurrentSpeed();
    }

    @Override
    public String toString() {
        return "MilkingMachine [isWorkging=" + isWorkging + ", Speed=" + getSpeed() + "]";
    }
}
