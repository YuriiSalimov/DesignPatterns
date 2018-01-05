package com.patterns.Command.undo;

public final class LightOffCommand implements Command {

    private final Light light;
    private int level;

    public LightOffCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.level = this.light.getLevel();
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.dim(level);
    }
}
