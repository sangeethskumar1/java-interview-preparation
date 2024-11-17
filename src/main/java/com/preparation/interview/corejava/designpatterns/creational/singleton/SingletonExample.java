package com.preparation.interview.corejava.designpatterns.creational.singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

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
