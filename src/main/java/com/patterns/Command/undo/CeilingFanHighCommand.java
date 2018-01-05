package com.patterns.Command.undo;

public final class CeilingFanHighCommand implements Command {

    private final CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanHighCommand(final CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.high();
    }

    @Override
    public void undo() {
        if (this.prevSpeed == CeilingFan.HIGH) {
            this.ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            this.ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            this.ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            this.ceilingFan.off();
        }
    }
}
