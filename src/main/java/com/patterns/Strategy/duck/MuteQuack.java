package com.patterns.Strategy.duck;

public final class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
