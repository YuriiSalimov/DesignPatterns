package com.patterns.Command.remote;

//
// This is the invoker
//
public final class RemoteControl {

    private final Command[] onCommands;
    private final Command[] offCommands;

    public RemoteControl(final int buttonsPairs) {
        this.onCommands = new Command[buttonsPairs];
        this.offCommands = new Command[buttonsPairs];
        final Command noCommand = new NoCommand();
        for (int i = 0; i < buttonsPairs; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
    }

    public void setCommand(final int slot, final Command onCommand, final Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(final int slot) {
        this.onCommands[slot].execute();
    }

    public void offButtonWasPushed(final int slot) {
        this.offCommands[slot].execute();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("\n------ Remote Control -------\n");
        for (int i = 0; i < this.onCommands.length; i++) {
            sb.append("[slot ").append(i).append("] ")
                    .append(this.onCommands[i].getClass().getName())
                    .append("    ")
                    .append(this.offCommands[i].getClass().getName())
                    .append("\n");
        }
        return sb.toString();
    }
}
