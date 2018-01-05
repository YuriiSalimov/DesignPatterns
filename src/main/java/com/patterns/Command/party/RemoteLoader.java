package com.patterns.Command.party;

public class RemoteLoader {

    public static void main(String[] args) {
        final RemoteControl remoteControl = new RemoteControl(1);

        final Light light = new Light("Living Room");
        final LightOnCommand lightOn = new LightOnCommand(light);
        final LightOffCommand lightOff = new LightOffCommand(light);

        final TV tv = new TV("Living Room");
        final TVOnCommand tvOn = new TVOnCommand(tv);
        final TVOffCommand tvOff = new TVOffCommand(tv);

        final Stereo stereo = new Stereo("Living Room");
        final StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        final StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        final Hottub hottub = new Hottub();
        final HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        final HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        final Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        final Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        final MacroCommand partyOnMacro = new MacroCommand(partyOn);
        final MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }
}
