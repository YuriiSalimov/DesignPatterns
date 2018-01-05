package com.patterns.Adapter.ducks;

public class DuckTestDrive {
	public static void main(String[] args) {
		final MallardDuck duck = new MallardDuck();

		final WildTurkey turkey = new WildTurkey();
		final Duck turkeyAdapter = new TurkeyAdapter(turkey);
   
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
 
		System.out.println("\nThe Duck says...");
		testDuck(duck);
  
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
 
	private static void testDuck(final Duck duck) {
		duck.quack();
		duck.fly();
	}
}
