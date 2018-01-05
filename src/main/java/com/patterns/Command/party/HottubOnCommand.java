package com.patterns.Command.party;

public final class HottubOnCommand implements Command {

    private final Hottub hottub;

    public HottubOnCommand(final Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        this.hottub.on();
        this.hottub.setTemperature(104);
        this.hottub.circulate();
    }

    @Override
    public void undo() {
        this.hottub.off();
    }
}
