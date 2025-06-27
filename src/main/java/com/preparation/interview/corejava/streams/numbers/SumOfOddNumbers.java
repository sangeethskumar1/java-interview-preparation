package com.preparation.interview.corejava.streams.numbers;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integers, write a program to find and print the sum of all odd numbers using Java Stream API
 */
public class SumOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.printf("Sum of Odd Numbers : %s", sum);
    }
}
