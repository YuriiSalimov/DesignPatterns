package com.patterns.Command.remote;

public final class HottubOnCommand implements Command {

    private final Hottub hottub;

    public HottubOnCommand(final Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        this.hottub.on();
        this.hottub.heat();
        this.hottub.bubblesOn();
    }
}
