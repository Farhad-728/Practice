package org.example.homework3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounterApp {
    public static void main(String[] args) {
        String inputParagraf = "Java is a programming language. Java is used for web development and software engineering.";

        printWordFrequency(inputParagraf);
    }

    public static void printWordFrequency(String sentences) {
        String[] words = sentences.split("\\s+");

        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        wordFrequency.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}



