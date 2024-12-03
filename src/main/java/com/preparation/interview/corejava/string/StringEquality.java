package com.preparation.interview.corejava.string;

public class StringEquality {

    public static void main(String[] args) {
        String s1 = "Sangeeth";
        String s2 = new String("Sangeeth");
        String s3 = "Sangeeth";
        String s4 = s3;

        System.out.println("s1 == s2 : " + (s1 == s2)); // False
        System.out.println("s1 == s3 : " + (s1 == s3)); // True
        System.out.println("s1.equals(s2) : " + (s1.equals(s2))); // True
        System.out.println("s3 == s4 : " + (s3 == s4)); // True
        s4 += " S Kumar";
        System.out.println("s3 == s4 : " + (s3 == s4)); // False
    }
}
