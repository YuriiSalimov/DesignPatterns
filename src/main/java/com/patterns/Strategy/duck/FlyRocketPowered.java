package com.patterns.Strategy.duck;

public final class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
