package com.preparation.interview.corejava.designpatterns.creational.singleton;

/**
 * Ensures class has only one instance and provides a global point of access to it.
 * Eg: Configuration Settings, Logging, Database Connections
 */
public class SingletonClient {
    public static void main(String[] args) {
        SingletonExample instance1 = SingletonExample.getInstance();
        SingletonExample instance2 = SingletonExample.getInstance();
        System.out.println("Instance are " + ((instance1 == instance2) ? "Equal" : "Not Equal"));
    }
}
