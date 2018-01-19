package com.patterns.Proxy.gumballmonitor;

public final class GumballMonitor {

    private final GumballMachine machine;

    public GumballMonitor(final GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("Gumball Machine: " + this.machine.getLocation());
        System.out.println("Current inventory: " + this.machine.getCount() + " gumballs");
        System.out.println("Current State: " + this.machine.getState());
    }
}
