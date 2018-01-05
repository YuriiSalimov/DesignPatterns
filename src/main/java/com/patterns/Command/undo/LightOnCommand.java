package com.patterns.Command.undo;

public final class LightOnCommand implements Command {

    private final Light light;
    private int level;

    public LightOnCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.level = this.light.getLevel();
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.dim(this.level);
    }
}
