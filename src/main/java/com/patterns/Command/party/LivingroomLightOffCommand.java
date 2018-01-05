package com.patterns.Command.party;

public final class LivingroomLightOffCommand implements Command {

    private final Light light;

    public LivingroomLightOffCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
