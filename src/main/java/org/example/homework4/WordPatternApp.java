package org.example.homework4;

import java.util.HashMap;

public class WordPatternApp {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";

        boolean result = wordPattern(pattern, s);
        System.out.println(result);
    }

    private static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != s.length()) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if (!map.get(ch).equals(word)) {
                return false;
            } else {
                map.put(ch, word);
            }
        }
        return true;
    }
}
