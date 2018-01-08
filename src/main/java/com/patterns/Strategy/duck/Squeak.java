package com.patterns.Strategy.duck;

public final class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
