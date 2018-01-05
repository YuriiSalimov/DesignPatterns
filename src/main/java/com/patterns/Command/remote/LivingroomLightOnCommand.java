package com.patterns.Command.remote;

public final class LivingroomLightOnCommand implements Command {

    private final Light light;

    public LivingroomLightOnCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
