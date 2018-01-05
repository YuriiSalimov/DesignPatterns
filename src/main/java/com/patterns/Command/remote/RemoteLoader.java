package com.patterns.Command.remote;

public class RemoteLoader {

    public static void main(String[] args) {
        final RemoteControl remoteControl = new RemoteControl(6);

        final Light livingRoomLight = new Light("Living Room");
        final LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        final LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        final Light kitchenLight = new Light("Kitchen");
        final LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        final LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

        final CeilingFan ceilingFan = new CeilingFan("Living Room");
        final CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        final CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);

        final GarageDoor garageDoor = new GarageDoor("");
        final GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        final GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);

        final Stereo stereo = new Stereo("Living Room");
        final StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        final StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
    }
}
