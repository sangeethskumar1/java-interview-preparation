package com.preparation.interview.corejava.immutability;

public class ImmutabilityClient {
    public static void main(String[] args) {
        int id = 1;
        String name = "Sangeeth";
        ImmutableNonObject immutableNonObject = new ImmutableNonObject(id, name); // No Setters are available since the variables are final
        System.out.println(immutableNonObject); // ImmutableNonObject(id=1, name=Sangeeth)
        id = 2;
        name = "Shwetha";
        System.out.println(immutableNonObject);// ImmutableNonObject(id=1, name=Sangeeth)
        System.out.println();
    }
}
