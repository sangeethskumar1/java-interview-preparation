package com.preparation.interview.corejava.designpatterns.creational;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Ensures class has only one instance and provides a global point of access to it.
 * Eg: Configuration Settings, Logging, Database Connections
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SingletonExample {
    private static SingletonExample singletonExample;

    public static SingletonExample getInstance() {
        synchronized (SingletonExample.class) {
            if (null == singletonExample) {
                singletonExample = new SingletonExample();
            }
            return singletonExample;
        }
    }
}
