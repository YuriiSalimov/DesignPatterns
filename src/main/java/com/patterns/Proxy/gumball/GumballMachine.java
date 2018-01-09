package com.patterns.Proxy.gumball;

import java.rmi.*;
import java.rmi.server.*;

public final class GumballMachine
        extends UnicastRemoteObject implements GumballMachineRemote {

    private final State soldOutState;
    private final State noQuarterState;
    private final State hasQuarterState;
    private final State soldState;
    private final State winnerState;

    private State state;
    private int count;
    private String location;

    public GumballMachine(final String location, final int numberGumballs)
            throws RemoteException {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            this.state = this.noQuarterState;
        } else {
            this.state = this.soldOutState;
        }
        this.location = location;
    }


    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
    }

    void setState(final State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (this.count != 0) {
            this.count--;
        }
    }

    public void refill(final int count) {
        this.count = count;
        this.state = this.noQuarterState;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public State getState() {
        return this.state;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    public State getSoldOutState() {
        return this.soldOutState;
    }

    public State getNoQuarterState() {
        return this.noQuarterState;
    }

    public State getHasQuarterState() {
        return this.hasQuarterState;
    }

    public State getSoldState() {
        return this.soldState;
    }

    public State getWinnerState() {
        return this.winnerState;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: ").append(this.count).append(" gumball");
        if (this.count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is ").append(this.state).append("\n");
        return result.toString();
    }
}
