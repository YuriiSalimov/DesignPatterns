package com.patterns.Strategy.duck;

public final class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
