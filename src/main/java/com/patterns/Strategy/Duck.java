package com.patterns.Strategy;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(final FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(final QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    abstract void display();
}
