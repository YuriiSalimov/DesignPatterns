package com.patterns.Strategy.duck;

public final class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
