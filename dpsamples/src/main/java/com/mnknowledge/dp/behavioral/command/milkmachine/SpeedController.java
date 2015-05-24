package com.mnknowledge.dp.behavioral.command.milkmachine;

/**
 * receiver
 */
public class SpeedController {

    private SpeedLevel speedLevel;

    public SpeedLevel getCurrentSpeed() {
        return this.speedLevel;
    }

    public void setCurrentSpeed(SpeedLevel speed) {
        this.speedLevel = speed;
    }

    @Override
    public String toString() {
        return "SpeedController [speedLevel=" + speedLevel + "]";
    }

    public enum SpeedLevel {
        LOW, MEDIUM, HIGH;
    }
}
