package com.preparation.interview.corejava.streams.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Concatenate Strings
 */
public class ConcatenateStrings {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        final String concatenatedString = strings.stream().collect(Collectors.joining());
        System.out.printf("Concatenated String : %s", concatenatedString);
        final String commaSeparatedString = strings.stream().collect(Collectors.joining(","));
        System.out.printf("Comma Separated String : %s", commaSeparatedString);
    }

}
