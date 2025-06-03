package com.preparation.interview.corejava.streams.sort;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/**
 * Find the largest element in the list
 */
public class LargestNumber {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 7, 8, 1, 10);
        OptionalInt greatestNumber = numbers.stream().mapToInt(Integer::intValue).max();
        System.out.println(greatestNumber.isPresent() ? "Greatest Number :" + greatestNumber.getAsInt() : "No Element Present");
    }
}
