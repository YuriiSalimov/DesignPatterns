package com.patterns.Command.party;

public final class StereoOnCommand implements Command {

    private final Stereo stereo;

    public StereoOnCommand(final Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
    }

    @Override
    public void undo() {
        this.stereo.off();
    }
}
