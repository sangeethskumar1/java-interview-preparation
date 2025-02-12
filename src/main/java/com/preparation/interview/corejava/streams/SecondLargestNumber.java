package com.preparation.interview.corejava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Find the second-largest number from the list
 */
public class SecondLargestNumber {
    public static void main(String[] args) {
        final List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 8, 10);
        Optional<Integer> secondLargestOptional = inputList.stream().sorted((num1, num2) -> num2 - num1).distinct().skip(1).findAny();
        secondLargestOptional.ifPresentOrElse(data -> System.out.println("Second Largest Element is : " + data), () -> System.out.println("No Element Found"));
    }
}
