package com.preparation.interview.corejava.streams.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Sort Strings in Alphabetical Order
 */
public class SortStrings {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("banana", "orange", "apple", "grape");
        System.out.printf("List in Alphabetical Order : %s%n", strings.stream().sorted().toList());
        System.out.printf("List in Reverse Alphabetical Order : %s", strings.stream().sorted(Comparator.reverseOrder()).toList());
    }
}
