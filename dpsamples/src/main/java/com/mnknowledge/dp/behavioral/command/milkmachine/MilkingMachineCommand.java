package com.mnknowledge.dp.behavioral.command.milkmachine;

public abstract class MilkingMachineCommand implements Command {

    private MilkingMachine receiver;

    public MilkingMachine getReceiver() {
        return receiver;
    }

    public void setReceiver(MilkingMachine receiver) {
        this.receiver = receiver;
    }

    @Override
    public abstract void execute();

}
