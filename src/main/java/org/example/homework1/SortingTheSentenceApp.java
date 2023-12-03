package org.example.homework1;

import java.util.Arrays;
import java.util.Comparator;

public class SortingTheSentenceApp {
    public static String sortSentence(String s) {
        String[] words = s.split(" ");

        Arrays.sort(words, Comparator.comparing(word -> Integer.parseInt(word.replaceAll("[^0-9]", ""))));

        StringBuilder sortedSentence = new StringBuilder();
        for (String word : words) {
            sortedSentence.append(word.replaceAll("[^a-zA-Z]", "")).append(" ");
        }

        return sortedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";

        String result = sortSentence(s);
        System.out.println(result);
    }
}
