package com.preparation.interview.corejava.streams.numbers;

import java.util.Arrays;
import java.util.List;

/**
 * Find product of all elements
 */
public class ProductOfAllElements {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        final int product = numbers.stream().reduce(1, (num1, num2) -> num1 * num2);
        System.out.printf("Product of all Numbers : %s", product);
    }
}
