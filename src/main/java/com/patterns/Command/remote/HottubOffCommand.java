package com.patterns.Command.remote;

public final class HottubOffCommand implements Command {

    private final Hottub hottub;

    public HottubOffCommand(final Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        this.hottub.cool();
        this.hottub.off();
    }
}
