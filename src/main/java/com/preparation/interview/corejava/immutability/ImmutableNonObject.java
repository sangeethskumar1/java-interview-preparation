package com.preparation.interview.corejava.immutability;

public class ImmutableNonObject {
    private final int id;
    private final String name;

    public ImmutableNonObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
