package com.patterns.Command.undo;

public final class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private final String location;
    private int speed;

    public CeilingFan(final String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {
        this.speed = HIGH;
        System.out.println(this.location + " ceiling fan is on high");
    }

    public void medium() {
        this.speed = MEDIUM;
        System.out.println(this.location + " ceiling fan is on medium");
    }

    public void low() {
        this.speed = LOW;
        System.out.println(this.location + " ceiling fan is on low");
    }

    public void off() {
        this.speed = OFF;
        System.out.println(this.location + " ceiling fan is off");
    }

    public int getSpeed() {
        return this.speed;
    }
}
