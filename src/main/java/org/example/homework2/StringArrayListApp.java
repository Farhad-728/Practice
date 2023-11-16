package org.example.homework2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringArrayListApp {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Samir");
        words.add("Farhad");
        words.add("Calal");
        words.add("Ali");

        System.out.println("1. " + words);

        Collections.sort(words);

        System.out.println("2. " + words);
    }
}
