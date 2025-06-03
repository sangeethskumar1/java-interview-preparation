package com.preparation.interview.corejava.streams.numbers;

import java.util.List;

public class FilterEvenNumbers {

    public static void main(String[] args) {
        final List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final List<Integer> resultList = integerList.stream().filter(num -> num % 2 == 0).toList();
        System.out.println("Even Numbers : " + resultList);
    }
}
