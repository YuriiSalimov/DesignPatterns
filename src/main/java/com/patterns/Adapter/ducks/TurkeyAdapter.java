package com.patterns.Adapter.ducks;

public final class TurkeyAdapter implements Duck {

    private final Turkey turkey;

    public TurkeyAdapter(final Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            this.turkey.fly();
        }
    }
}
