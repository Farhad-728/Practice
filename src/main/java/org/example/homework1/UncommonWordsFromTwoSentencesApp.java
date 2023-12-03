package org.example.homework1;

import java.util.HashSet;
import java.util.Set;

public class UncommonWordsFromTwoSentencesApp {
    public static String[] uncommonFromSentences(String s1, String s2) {
        Set<String> uncommonWords = new HashSet<>();

        String[] words = (s1 + " " + s2).split(" ");

        for (String word : words) {
            if (uncommonWords.contains(word)) {
                uncommonWords.remove(word);
            } else {
                uncommonWords.add(word);
            }
        }
        return uncommonWords.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        uncommonFromSentences(s1, s2);

        for (String words : uncommonFromSentences(s1, s2)) {
            System.out.println(words);
        }
    }
}
