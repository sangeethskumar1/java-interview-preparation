package com.preparation.interview.corejava.designpatterns.creational.singleton;

public class SingletonClient {
    public static void main(String[] args) {
        SingletonExample instance1 = SingletonExample.getInstance();
        SingletonExample instance2 = SingletonExample.getInstance();
        System.out.println("Instance are " + ((instance1 == instance2) ? "Equal" : "Not Equal"));
    }
}
