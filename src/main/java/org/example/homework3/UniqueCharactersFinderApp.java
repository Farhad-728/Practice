package org.example.homework3;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharactersFinderApp {

    public static void main(String[] args) {
        String input = "Java is a programming language";
        input = input.replaceAll("[^a-zA-Z]", "");
        uniqueCharacters(input);
    }

    public static void uniqueCharacters(String test) {
        Set<Character> uniqueChar = new HashSet<>();
        for (char ch : test.toCharArray()) {
            uniqueChar.add(ch);
        }
        System.out.println(uniqueChar);
    }
}