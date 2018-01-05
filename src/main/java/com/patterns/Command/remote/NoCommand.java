package com.patterns.Command.remote;

public final class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No Command");
    }
}
