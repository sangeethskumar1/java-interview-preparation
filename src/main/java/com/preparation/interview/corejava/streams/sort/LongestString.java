package com.preparation.interview.corejava.streams.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Find the longest String
 */
public class LongestString {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("apple", "banana", "orangesssss", "grape");
        Optional<String> longestOptional = strings.stream().max(Comparator.comparingInt(String::length));
        System.out.printf("Longest Word : %s", (longestOptional.orElse("No Element Present")));
    }
}
