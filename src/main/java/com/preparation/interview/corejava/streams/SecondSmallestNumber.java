package com.preparation.interview.corejava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Find the second-smallest number from the list
 */
public class SecondSmallestNumber {
    public static void main(String[] args) {
        final List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 8, 10);
        Optional<Integer> secondSmallestOptional = inputList.stream().sorted().distinct().skip(1).findAny();
        secondSmallestOptional.ifPresentOrElse(data -> System.out.println("Second Smallest Element is : " + data), () -> System.out.println("No Element Found"));
    }
}
