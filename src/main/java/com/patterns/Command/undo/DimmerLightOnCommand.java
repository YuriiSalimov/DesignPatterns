package com.patterns.Command.undo;

public final class DimmerLightOnCommand implements Command {

    private final Light light;
    private int prevLevel;

    public DimmerLightOnCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.prevLevel = this.light.getLevel();
        this.light.dim(75);
    }

    @Override
    public void undo() {
        this.light.dim(prevLevel);
    }
}
