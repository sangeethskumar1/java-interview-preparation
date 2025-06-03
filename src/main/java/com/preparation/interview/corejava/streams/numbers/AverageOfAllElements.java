package com.preparation.interview.corejava.streams.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Calculate Average of all Elements
 */
public class AverageOfAllElements {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        final OptionalDouble averageOptional = numbers.stream().mapToDouble(Integer::doubleValue).average();
        System.out.printf("Average : %s", (averageOptional.isPresent() ? averageOptional.getAsDouble() : "No Element Present"));
    }
}
