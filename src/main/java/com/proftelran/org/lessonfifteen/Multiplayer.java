package com.proftelran.org.lessonfifteen;

@FunctionalInterface
public interface Multiplayer {

    // only one abstract method
    void multiplay(int value);

    default void printHello() {
        System.out.println("Hello");
    }

    static void printWelcome() {
        System.out.println("Welcome");
    }
}
