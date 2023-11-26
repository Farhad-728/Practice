package org.example.homework3;

public class UniqueCharactersFinderApp {

    public static void main(String[] args) {
        String input = "Java is a programming language";
        input = input.replaceAll("[^a-zA-Z]", "");
        uniqueCharacters(input);
    }

    public static void uniqueCharacters(String test) {
        String word = "";
        for (int i = 0; i < test.length(); i++) {
            if (word.indexOf(test.charAt(i)) == -1) {
                word = word + test.charAt(i);

            }
        }
        System.out.println(word);

    }
}