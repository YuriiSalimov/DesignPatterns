package com.patterns.Command.remote;

public final class StereoOffCommand implements Command {

    private final Stereo stereo;

    public StereoOffCommand(final Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
