package com.patterns.Strategy.duck;

public final class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
