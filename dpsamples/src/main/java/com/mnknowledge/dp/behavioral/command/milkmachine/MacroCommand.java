package com.mnknowledge.dp.behavioral.command.milkmachine;

import java.util.ArrayList;
import java.util.Collection;

public class MacroCommand implements Command {

    private Collection<Command> commands;

    private Collection<Command> getCommands() {
        if(this.commands == null) {
            this.commands = new ArrayList<>();
        }
        return this.commands;
    }

    @Override
    public void execute() {
        for (Command command : getCommands()) {
            command.execute();
        }
    }

    public void add(Command command) {
        getCommands().add(command);
    }

    public void remove(Command command) {
        getCommands().remove(command);
    }

    public void clearChildren() {
        getCommands().clear();
    }

}
