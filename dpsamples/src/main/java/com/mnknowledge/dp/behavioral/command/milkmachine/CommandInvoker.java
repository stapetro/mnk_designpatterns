package com.mnknowledge.dp.behavioral.command.milkmachine;

import java.util.Arrays;
import java.util.Collection;

public class CommandInvoker {

    public void invoke(Collection<Command> commands) {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void invoke(Command command) {
        invoke(Arrays.asList(command));
    }
}
