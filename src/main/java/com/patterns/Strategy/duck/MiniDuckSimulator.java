package com.patterns.Strategy.duck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        final MallardDuck mallard = new MallardDuck();
        final RubberDuck rubberDuckie = new RubberDuck();
        final DecoyDuck decoy = new DecoyDuck();
        final ModelDuck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
