package com.patterns.Command.remote;

public final class Hottub {

    private boolean on;
    private int temperature;

    public void on() {
        this.on = true;
    }

    public void off() {
        this.on = false;
    }

    public void bubblesOn() {
        if (this.on) {
            System.out.println("Hottub is bubbling!");
        }
    }

    public void bubblesOff() {
        if (this.on) {
            System.out.println("Hottub is not bubbling");
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

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void heat() {
        this.temperature = 105;
        System.out.println("Hottub is heating to a steaming 105 degrees");
    }

    public void cool() {
        this.temperature = 98;
        System.out.println("Hottub is cooling to 98 degrees");
    }
}
