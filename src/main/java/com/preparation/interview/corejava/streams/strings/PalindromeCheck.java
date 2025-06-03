package com.preparation.interview.corejava.streams.strings;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Check if a given String is Palindrome
 */
public class PalindromeCheck {

    public static void main(String[] args) {
        final String inputString = "Malayalam";
        List<Character> characterList = inputString.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Collections.reverse(characterList);
        final String outputString = characterList.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(inputString + " is " + (inputString.equalsIgnoreCase(outputString) ? "Palindrome" : "Not Palindrome"));
    }
}
