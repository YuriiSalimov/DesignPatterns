package com.patterns.Singleton.subclass;

public class SingletonTestDrive {

    public static void main(String[] args) {
        final Singleton foo = CoolerSingleton.getInstance();
        final Singleton bar = HotterSingleton.getInstance();
        System.out.println(foo);
        System.out.println(bar);
    }
}
