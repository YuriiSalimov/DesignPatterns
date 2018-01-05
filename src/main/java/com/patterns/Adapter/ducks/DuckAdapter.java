package com.patterns.Adapter.ducks;

import java.util.Random;

public final class DuckAdapter implements Turkey {

    private final Duck duck;
    private final Random rand;

    public DuckAdapter(final Duck duck) {
        this.duck = duck;
        this.rand = new Random();
    }

    @Override
    public void gobble() {
        this.duck.quack();
    }

    @Override
    public void fly() {
        if (this.rand.nextInt(5) == 0) {
            this.duck.fly();
        }
    }
}
