package com.patterns.Command.party;

public final class HottubOffCommand implements Command {

    private final Hottub hottub;

    public HottubOffCommand(final Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        this.hottub.setTemperature(98);
        this.hottub.off();
    }

    @Override
    public void undo() {
        this.hottub.on();
    }
}
