package com.example.mypraticeproject.singletonpattern;

public class Singleton {
    // non-safe thread
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
