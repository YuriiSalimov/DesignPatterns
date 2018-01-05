package com.patterns.Command.undo;

public final class DimmerLightOffCommand implements Command {

    private final Light light;
    private int prevLevel;

    public DimmerLightOffCommand(final Light light) {
        this.light = light;
        this.prevLevel = 100;
    }

    @Override
    public void execute() {
        this.prevLevel = this.light.getLevel();
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.dim(this.prevLevel);
    }
}
