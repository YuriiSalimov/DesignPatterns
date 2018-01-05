package com.patterns.Command.party;

public final class TVOnCommand implements Command {

    private final TV tv;

    public TVOnCommand(final TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.on();
        this.tv.setInputChannel();
    }

    @Override
    public void undo() {
        this.tv.off();
    }
}
