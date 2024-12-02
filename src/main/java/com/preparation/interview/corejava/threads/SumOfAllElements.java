package com.preparation.interview.corejava.threads;

import java.util.Arrays;
import java.util.List;

/**
 * Sum Of All Elements in List
 */
public class SumOfAllElements {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final int sum = numbers.stream()
                .mapToInt(Integer::intValue) // Converting to primitive data type from Wrapper Class
                .sum();
        System.out.println("Sum of Numbers : " + sum);
    }
}
