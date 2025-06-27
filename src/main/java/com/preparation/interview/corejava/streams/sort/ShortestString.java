package com.preparation.interview.corejava.streams.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Given a list of strings, write a program to find and print the shortest string using Java Stream API
 */
public class ShortestString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        Optional<String> shortestOptional = strings.stream().min(Comparator.comparingInt(String::length));
        System.out.printf("Shortest String : %s", shortestOptional.orElse("No Element Present"));
    }
}
