package com.patterns.Singleton.chocolate;

public class ChocolateController {

    public static void main(String args[]) {
        final ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // will return the existing instance
        final ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }
}
