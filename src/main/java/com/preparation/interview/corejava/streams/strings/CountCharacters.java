package com.preparation.interview.corejava.streams.strings;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Find occurrence of each Character
 */
public class CountCharacters {
    public static void main(String[] args) {
        String testString = "hello world";
        Map<String, Long> characterCountMap = testString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
        System.out.printf("Character Count : %s", characterCountMap);
    }
}
