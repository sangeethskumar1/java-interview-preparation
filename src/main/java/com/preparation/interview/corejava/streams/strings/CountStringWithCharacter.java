package com.preparation.interview.corejava.streams.strings;

import java.util.Arrays;
import java.util.List;

/**
 * Count Strings with Character
 */
public class CountStringWithCharacter {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        final char searchChar = 'a';
        final long count = strings.stream().filter(word -> word.contains(String.valueOf(searchChar))).count();
        System.out.printf("String Containing Search Character : %s, is : %d%n", searchChar, count);
    }
}
