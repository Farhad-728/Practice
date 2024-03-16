package org.example.homework5;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> find = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                find.add(i);
            }
        }
        return find;
    }

    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        char x = 'e';
        findWordsContaining(words, x);
    }
}
