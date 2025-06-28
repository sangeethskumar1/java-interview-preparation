package com.preparation.interview.corejava.streams.strings;

import java.util.stream.Stream;

/**
 * Generate String
 */
public class GenerateString {
    public static void main(String[] args) {
        Stream.generate(() -> "element").limit(10).forEach(System.out::println);
    }
}
