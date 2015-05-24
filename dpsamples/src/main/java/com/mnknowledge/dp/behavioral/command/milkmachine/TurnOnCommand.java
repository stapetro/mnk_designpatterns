package com.mnknowledge.dp.behavioral.command.milkmachine;

public class TurnOnCommand extends MilkingMachineCommand {

    @Override
    public void execute() {
        getReceiver().turnOn();
    }
}
