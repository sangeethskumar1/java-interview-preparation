package com.preparation.interview.corejava.java17;

public class Java17Features {

    private record Person(String name, int age) {
    }

    public static void main(String[] args) {
        Java17Features instance = new Java17Features();
        instance.recordsExample();
    }

    private void recordsExample() {
        final Person person = new Person("Sangeeth S Kumar", 33);
        System.out.println(person);
    }
}
