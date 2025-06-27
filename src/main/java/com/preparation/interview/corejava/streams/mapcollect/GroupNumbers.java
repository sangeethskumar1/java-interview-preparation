package com.preparation.interview.corejava.streams.mapcollect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Group Numbers in List by No of Instances
 */
public class GroupNumbers {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 1, 4, 5, 5, 6, 3, 6, 4, 10);
        final Map<Integer, Long> countMap = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Grouped Numbers : " + countMap);
    }
}
