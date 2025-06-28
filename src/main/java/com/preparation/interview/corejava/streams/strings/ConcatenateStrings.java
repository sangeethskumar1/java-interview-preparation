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
        String concatenatedString = strings.stream().collect(Collectors.joining());
        System.out.printf("Concatenated String : %s", concatenatedString);
        System.out.println();
        concatenatedString = strings.stream().reduce("", (obj1, obj2) -> obj1 + obj2);
        System.out.printf("Reduced String : %s", concatenatedString);
        System.out.println();
        String commaSeparatedString = strings.stream().collect(Collectors.joining(", "));
        System.out.printf("Comma Separated String : %s", commaSeparatedString);
        System.out.println();
        commaSeparatedString = strings.stream().reduce("", (obj1, obj2) -> obj1 + ", " + obj2);
        System.out.printf("Comma Separated Reduced String : %s", commaSeparatedString);
    }

}
