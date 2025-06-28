package com.preparation.interview.corejava.inheritance;

public class ParentChildConstructor extends Parent {

    public ParentChildConstructor() {
        // super(); Compile time error. Either this/ super can be used inside constructor
        this("Child Constructor");
        System.out.println("Child Class Default Constructor");
    }

    public ParentChildConstructor(String s) {
        System.out.println("Child Class Parameterized Constructor : " + s);
    }

    public static void main(String[] args) {
        new ParentChildConstructor();
    }
}

class Parent {
    public Parent() {
        this("Parent Constructor");
        System.out.println("Parent Class Default Constructor");
    }

    public Parent(String s) {
        System.out.println("Parent Class Parameterized Constructor : " + s);
    }
}
