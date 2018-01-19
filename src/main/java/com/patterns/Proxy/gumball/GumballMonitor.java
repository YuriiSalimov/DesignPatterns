package com.patterns.Proxy.gumball;

import java.rmi.*;

public final class GumballMonitor {

    private final GumballMachineRemote machine;

    public GumballMonitor(final GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + this.machine.getLocation());
            System.out.println("Current inventory: " + this.machine.getCount() + " gumballs");
            System.out.println("Current State: " + this.machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
