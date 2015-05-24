package com.mnknowledge.dp.behavioral.command.milkmachine;

public class TurnOffCommand extends MilkingMachineCommand {

    @Override
    public void execute() {
        getReceiver().turnOff();
    }
}
