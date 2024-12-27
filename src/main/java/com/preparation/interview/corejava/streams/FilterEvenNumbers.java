package com.preparation.interview.corejava.streams;

import java.util.List;

public class FilterEvenNumbers {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(integerList.stream().filter(num -> num % 2 == 0).toList());
    }
}
