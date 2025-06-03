package com.preparation.interview.corejava.streams.sort;

import java.util.Arrays;
import java.util.List;

/**
 * Sort the list in Ascending & Descending Order
 */
public class SortAscendingDescending {

    public static void main(String[] args) {
        final List<Integer> inputList = Arrays.asList(1, 8, 2, 3, 7, 4, 9, 5, 6, 1, 7, 8, 3, 9, 10, 8, 10);
        System.out.println("Ascending Order : " + inputList.stream().sorted().toList());
        System.out.println("Ascending Order Unique : " + inputList.stream().sorted().distinct().toList());
        System.out.println("Descending Order : " + inputList.stream().sorted((num1, num2) -> (num2 - num1)).toList());
        System.out.println("Descending Order Unique : " + inputList.stream().sorted((num1, num2) -> (num2 - num1)).distinct().toList());
    }
}
