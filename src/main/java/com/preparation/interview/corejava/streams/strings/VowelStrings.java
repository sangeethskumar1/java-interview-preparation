package com.preparation.interview.corejava.streams.strings;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of strings, write a program to find and print the strings containing only vowels using Java Stream API
 */
public class VowelStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "oai");
        List<String> vowelStrings = strings.stream().filter(ele -> ele.matches("[aeiouAEIOU]+")).toList();
        System.out.printf("Vowel Strings : %s", vowelStrings);
    }
}
