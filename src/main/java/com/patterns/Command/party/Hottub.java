package com.patterns.Command.party;

public final class Hottub {

    private boolean on;
    private int temperature;

    public void on() {
        this.on = true;
    }

    public void off() {
        this.on = false;
    }

    public void circulate() {
        if (this.on) {
            System.out.println("Hottub is bubbling!");
        }
    }

    public void jetsOn() {
        if (this.on) {
            System.out.println("Hottub jets are on");
        }
    }

    public void jetsOff() {
        if (this.on) {
            System.out.println("Hottub jets are off");
        }
    }

    public void setTemperature(final int temperature) {
        if (temperature > this.temperature) {
            System.out.println("Hottub is heating to a steaming " + temperature + " degrees");
        } else {
            System.out.println("Hottub is cooling to " + temperature + " degrees");
        }
        this.temperature = temperature;
    }
}
