package com.patterns.Command.party;

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
        switch (this.prevSpeed) {
            case CeilingFan.HIGH:
                this.ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                this.ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                this.ceilingFan.low();
                break;
            default:
                this.ceilingFan.off();
                break;
        }
    }
}
