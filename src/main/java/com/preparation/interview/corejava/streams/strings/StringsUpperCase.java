package com.preparation.interview.corejava.streams.strings;

import java.util.Arrays;
import java.util.List;

/**
 * List of String to Upper Case
 */
public class StringsUpperCase {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        final List<String> resultList = strings.stream().map(String::toUpperCase).toList();
        System.out.printf("Upper Case List : %s", resultList);
    }
}
