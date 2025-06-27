package com.preparation.interview.corejava.streams.numbers;

import java.util.Arrays;
import java.util.List;

/**
 * Write a program to convert a list of integers to a list of their squares using Java Stream API
 */
public class SquareOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.printf("Square List : %s", numbers.stream().map(num -> num * num).toList());
    }
}
