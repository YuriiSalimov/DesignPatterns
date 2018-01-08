package com.patterns.Strategy.duck;

public final class FakeQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Qwak");
    }
}
