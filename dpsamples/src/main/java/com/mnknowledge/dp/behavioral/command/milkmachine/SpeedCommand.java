package com.mnknowledge.dp.behavioral.command.milkmachine;

import com.mnknowledge.dp.behavioral.command.milkmachine.SpeedController.SpeedLevel;

public class SpeedCommand implements Command {

    private SpeedLevel speedLevel;
    private SpeedController speedController;

    public SpeedCommand(SpeedLevel speedLevel) {
        this.speedLevel = speedLevel;
    }

    private SpeedController getSpeedController() {
        return speedController;
    }

    public void setSpeedController(SpeedController speedController) {
        this.speedController = speedController;
    }

    @Override
    public void execute() {
        this.speedController.setCurrentSpeed(speedLevel);
    }

}
