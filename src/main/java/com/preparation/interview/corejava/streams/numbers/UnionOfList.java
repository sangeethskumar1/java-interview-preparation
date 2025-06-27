package com.preparation.interview.corejava.streams.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Write a program to find the union of two lists of integers using Java Stream API
 */
public class UnionOfList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
        List<Integer> unionList = Stream.concat(list1.stream(), list2.stream()).distinct().toList();
        System.out.printf("Union List : %s", unionList);
    }
}
