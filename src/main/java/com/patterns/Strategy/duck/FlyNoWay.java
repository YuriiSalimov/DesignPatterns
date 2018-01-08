package com.patterns.Strategy.duck;

public final class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
