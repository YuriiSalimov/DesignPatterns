package com.patterns.Command.party;

public final class CeilingFanMediumCommand implements Command {

    private final CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanMediumCommand(final CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.medium();
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
