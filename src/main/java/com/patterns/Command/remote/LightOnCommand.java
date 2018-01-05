package com.patterns.Command.remote;

public final class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
