package com.patterns.Command.undo;

public final class Light {

    private final String location;
    private int level;

    public Light(final String location) {
        this.location = location;
    }

    public void on() {
        this.level = 100;
        System.out.println("Light is on");
    }

    public void off() {
        this.level = 0;
        System.out.println("Light is off");
    }

    public void dim(final int level) {
        this.level = level;
        if (level == 0) {
            off();
        } else {
            System.out.println("Light is dimmed to " + level + "%");
        }
    }

    public int getLevel() {
        return this.level;
    }
}
