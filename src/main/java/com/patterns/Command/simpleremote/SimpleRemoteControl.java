package com.patterns.Command.simpleremote;

//
// This is the invoker
//
public final class SimpleRemoteControl {

	private Command slot;
 
	public void setCommand(Command command) {
		this.slot = command;
	}
 
	public void buttonWasPressed() {
		this.slot.execute();
	}
}
