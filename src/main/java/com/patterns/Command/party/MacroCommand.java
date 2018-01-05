package com.patterns.Command.party;

public final class MacroCommand implements Command {

    private final Command[] commands;

    public MacroCommand(final Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : this.commands) {
            command.execute();
        }
    }

    /**
     * NOTE:  these commands have to be done backwards to ensure proper undo functionality
     */
    @Override
    public void undo() {
        for (int i = this.commands.length - 1; i >= 0; i--) {
            this.commands[i].undo();
        }
    }
}

