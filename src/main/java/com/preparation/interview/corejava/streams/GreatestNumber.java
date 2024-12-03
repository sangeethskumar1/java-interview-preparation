package com.preparation.interview.corejava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/**
 * Find the greatest element in the list
 */
public class GreatestNumber {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 7, 8, 1, 10);
        OptionalInt greatestNumber = numbers.stream().mapToInt(Integer::intValue).max();
        System.out.println(greatestNumber.isPresent() ? "Greatest Number :" + greatestNumber.getAsInt() : "No Element Present");
    }
}
