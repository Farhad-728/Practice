package org.example.homework1;

import java.util.List;

public class AcronymApp {
    public static void main(String[] args) {
        String[] words = {"alice", "Lob", "charlie"};
        String s = "abc";

        boolean value = isAcronym(List.of(words), s);
        System.out.println(value);
    }

    public static boolean isAcronym(List<String> words, String s) {

        for (int i = 0; i < words.size(); i++) {
            String word1 = words.get(i);
            if (word1.charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
