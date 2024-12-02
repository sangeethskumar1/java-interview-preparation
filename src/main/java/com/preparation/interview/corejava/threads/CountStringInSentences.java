package com.preparation.interview.corejava.threads;

import java.util.Arrays;
import java.util.List;

/**
 * Find the count of String Apple in the list
 */
public class CountStringInSentences {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Apple is a fruit", "Doctor asks to eat an apple a day",
                "Apple keeps us healthy", "Apple is nutritious. Apple contain multivitamins");

        final long count = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.toLowerCase().split("\\s"))) // Split the sentence to word based on space
                .filter(word -> word.equals("apple"))
                .count();
        System.out.println("Count of Apple : " + count);
    }
}
