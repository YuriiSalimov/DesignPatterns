package com.patterns.Command.remote;

public final class LivingroomLightOffCommand implements Command {

    private final Light light;

    public LivingroomLightOffCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }
}
