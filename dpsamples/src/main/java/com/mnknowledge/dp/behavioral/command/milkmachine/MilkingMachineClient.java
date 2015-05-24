package com.mnknowledge.dp.behavioral.command.milkmachine;

import java.util.Arrays;

import com.mnknowledge.dp.behavioral.command.milkmachine.SpeedController.SpeedLevel;

/**
 * client
 */
public class MilkingMachineClient {

    private MilkingMachine machine;

    public MilkingMachineClient() {
        machine = new MilkingMachine();
        machine.setSpeedController(new SpeedController());
    }

    public static void main(String[] args) {
        MilkingMachineClient client = new MilkingMachineClient();
        System.out.println("Buy a brand new ...");
        client.printMilkingMachine();

        CommandInvoker invoker = new CommandInvoker();

        System.out.println("\nTurn on machine!");
        invoker.invoke(client.bindCommand(new TurnOnCommand()));
        client.printMilkingMachine();
        System.out.println("\nLet's set some speed!");
        invoker.invoke(client.bindCommand(new SpeedCommand(SpeedLevel.MEDIUM)));
        client.printMilkingMachine();
        System.out.println("\nTurn off machine but stores speed option!");
        invoker.invoke(client.bindCommand(new TurnOffCommand()));
        client.printMilkingMachine();

        System.out.println("\nTurn on machine and change speed!");
        invoker.invoke(Arrays.asList(client.bindCommand(new TurnOnCommand()),
                client.bindCommand(new SpeedCommand(SpeedLevel.HIGH))));
        client.printMilkingMachine();
        System.out.println("\nTurn off machine and clears speed!");
        invoker.invoke(Arrays.asList(client.bindCommand(new SpeedCommand(null)), client.bindCommand(new TurnOffCommand())));
        client.printMilkingMachine();

        System.out.println("\n[MacroCommand] Turn on machine with low speed!");
        MacroCommand macro = new MacroCommand();
        macro.add(client.bindCommand(new TurnOnCommand()));
        macro.add(client.bindCommand(new SpeedCommand(SpeedLevel.LOW)));
        invoker.invoke(macro);
        client.printMilkingMachine();

        System.out.println("\n[MacroCommand] Clear speed and Turn off!");
        macro.clearChildren();
        macro.add(client.bindCommand(new SpeedCommand(null)));
        macro.add(client.bindCommand(new TurnOffCommand()));
        invoker.invoke(macro);
        client.printMilkingMachine();
    }

    /**
     * Binds command with its respective receiver.
     * @param command
     * @return
     */
    public Command bindCommand(Command command) {
        if (command instanceof MilkingMachineCommand) {
            ((MilkingMachineCommand) command).setReceiver(machine);
        } else if (command instanceof SpeedCommand) {
            ((SpeedCommand) command).setSpeedController(machine.getSpeedController());
        } else {
            throw new IllegalArgumentException("Command is not supported!");
        }
        return command;
    }

    public void printMilkingMachine() {
        System.out.println(machine);
    }
}
