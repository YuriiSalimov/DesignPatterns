package com.patterns.Command.remote;

public final class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }
}
