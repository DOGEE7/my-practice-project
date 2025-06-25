package com.example.mypraticeproject.singletonpattern;

public class SingletonFinal {
    // thread-safe singleton using final
    private static final SingletonFinal instance = new SingletonFinal();

    private SingletonFinal() {
        // private constructor to prevent instantiation
    }

    public static SingletonFinal getInstance() {
        return instance;
    }
}
