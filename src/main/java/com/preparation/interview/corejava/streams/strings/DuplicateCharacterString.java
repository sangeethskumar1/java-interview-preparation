package com.preparation.interview.corejava.streams.strings;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of strings, write a program to find and print the strings containing duplicate characters using Java Stream API
 */
public class DuplicateCharacterString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "strawberry", "watermelon");
        List<String> duplicateList = strings.stream().filter(s -> s.length() != s.chars().distinct().count()).toList();
        System.out.printf("Duplicate Character List : %s", duplicateList);
    }
}
