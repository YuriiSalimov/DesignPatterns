package com.patterns.Command.simpleremote;

public class RemoteControlTest {

    public static void main(String[] args) {
        final SimpleRemoteControl remote = new SimpleRemoteControl();

        final Light light = new Light();
        final LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        final GarageDoor garageDoor = new GarageDoor();
        final GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
