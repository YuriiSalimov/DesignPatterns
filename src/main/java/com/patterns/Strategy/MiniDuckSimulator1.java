package com.patterns.Strategy;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
		final Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		final Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
